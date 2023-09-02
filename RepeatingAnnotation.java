package java_tutorials;

//Java Program to Demonstrate a Repeatable Annotation

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Make Words annotation repeatable
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface Words
{
	String word() default "Hello";
	int value() default 0;
}

//Create container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos
{
	Words[] value();
}
public class RepeatingAnnotation {

	// Repeat Words on newMethod
	@Words(word = "First", value = 1)
	@Words(word = "Second", value = 2)
	public static void newMethod()
	{
		RepeatingAnnotation obj = new RepeatingAnnotation();

		try {
			Class<?> c = obj.getClass();

			// Obtain the annotation for newMethod
			Method m = c.getMethod("newMethod");

			// Display the repeated annotation
			Annotation anno
				= m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		}
		catch (NoSuchMethodException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) { newMethod(); }
}
