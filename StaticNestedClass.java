package java_tutorials;

//Java Program to Illustrate Static Nested Classes

class Outer3 {
	private static void outerMethod() {
		System.out.println("inside outerMethod");
	}

	static class Inner {
		public static void display() {
			System.out.println("inside inner class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}
class StaticNestedClass {
	public static void main(String args[]) {

		// Calling method static display method rather than an instance of that class.
		Outer3.Inner.display();
	}
}
