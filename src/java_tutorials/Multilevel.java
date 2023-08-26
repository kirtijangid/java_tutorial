package java_tutorials;

class A{
	int a = 2;
}
class B extends A{
	int b = 3;
	
}
public class Multilevel extends B {

	public static void main(String[] args) {
		
		Multilevel s = new Multilevel();
		System.out.println("value of a = " + s.a);
		System.out.println("value of b = " + s.b);
	}

}
