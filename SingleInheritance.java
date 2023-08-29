package java_tutorials;

 class SingleInheritance1 {
	int number = 22;
 }
public class SingleInheritance extends SingleInheritance1{
		int age = 22;
		
	
	public static void main(String[] args) {
		
		SingleInheritance s = new SingleInheritance();
		System.out.println("total number is : " +s.number);
		System.out.println("age is : " +s.age);
		
	}

}
