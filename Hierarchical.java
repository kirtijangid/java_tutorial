package java_tutorials;
	class A{
		public void V1() {
			System.out.println("class A ");
		}
	}
	
	class B extends A{
		public void V2() {
			System.out.println("class B");
		}
	}
	class C extends A{
		public void V3() {
			System.out.println("class C");
		}
	}
public class Hierarchical {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.V2();
		obj1.V1();
		
		C obj2 = new C();
		obj2.V3();
		obj2.V1();
		
		

	}

}
