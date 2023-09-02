package java_tutorials;

// Program to Illustrate Inner class can be declared within a method of outer class

//class Outer1 {
//
//	void outerMethod() {
//		System.out.println("inside outerMethod");
//
//		// It is local to outerMethod()
//		class Inner {
//			void innerMethod() {
//				System.out.println("inside innerMethod");
//			}
//		}
//
//		Inner y = new Inner();
//		y.innerMethod();
//	}
//}
//
//class MethodLocalInnerClass {
//	public static void main(String[] args) {
//
//		Outer1 x = new Outer1();
//		x.outerMethod();
//	}
//}


class Outer2 {
void outerMethod() {
	int x = 98;
	System.out.println("inside outerMethod");
	class Inner {
		void innerMethod() {
			System.out.println("x= "+x);
		}
	}
	Inner y = new Inner();
	y.innerMethod();
}
}
class MethodLocalInnerClass {
public static void main(String[] args) {
	Outer2 x=new Outer2();
	x.outerMethod();
}
}
