package java_tutorials;

//class A{
//	int a = 2;
//}
//class B extends A{
//	int b = 3;
//	
//}
//public class Multilevel extends B {
//
//	public static void main(String[] args) {
//		
//		Multilevel s = new Multilevel();
//		System.out.println("value of a = " + s.a);
//		System.out.println("value of b = " + s.b);
//	}
//
//}


                 // another example

class Toys{
	public Toys() {
		System.out.println("class Toys");
	}
	public void type() {
		System.out.println("type = toys");
	}
}
	
	class Toys2 extends Toys{
		public Toys2() {
			System.out.println("class Toys2");
		}
		public void category(){
			System.out.println("category = rubber");
		}
	}
	public class Multilevel extends Toys2{
		public static void main(String[] args) {
			Multilevel obj = new Multilevel();
			
			obj.type();
			obj.category();
		}
		
	}
	
	
	
	
	
	
	
	












