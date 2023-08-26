
//calling static members without creating object of the class

package java_tutorials;

public class CallingStatic {

	static int a = 10;

	static void k() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {

		System.out.println(CallingStatic.a);
		CallingStatic.k();

	}

}

// Calling Non-static Data Members

//public class CallingStatic {
//	
//	int a = 5;
//
//	void f()
//	{
//
//		System.out.println("I am Non-static method");
//	}
//
//	public static void main(String[] args)
//	{
//		CallingStatic obj = new CallingStatic();
//
//		System.out.println(obj.a);
//		obj.f();
//	}
//}

// calling non static members without using objects i.e,using constructors

//class CallingStatic {
//
//	CallingStatic() {
//		int a = 10;
//		System.out.println(a);
//		display();
//	}
//
//	void display() {
//		System.out.println("calling non static members using constructors");
//
//	}
//
//	public static void main(String[] args) {
//		new CallingStatic();
//	}
//
//}
