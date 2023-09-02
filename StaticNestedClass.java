package java_tutorials;

// Program to Illustrate Static Nested Classes

class OuterClass {
	private static void outerMethod() {
		System.out.println("inside outerMethod");
	}

	static class InnerClass {
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
		OuterClass.InnerClass.display();
	}
}
