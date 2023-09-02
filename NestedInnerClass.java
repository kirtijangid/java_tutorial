package java_tutorials;

// Program to Demonstrate Nested inner class  - type of inner class

class Outer {

	class Inner {

		public void show() {

			System.out.println("In a nested class method");
		}
	}
}

class NestedInnerClass {

	public static void main(String[] args) {

		Outer.Inner obj = new Outer().new Inner();

		obj.show();
	}
}
