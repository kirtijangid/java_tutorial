package java_tutorials;

/* Program to Illustrate Anonymous Inner classes declaration Without 
any Name as a subclass of the specified type*/

//class Demo {
//	void show()
//	{
//		System.out.println("i am in show method of super class");
//	}
//}
//class AnonymousInnerclass  {
//	// An anonymous class with Demo as base class
//	static Demo d = new Demo() {
//		void show()
//		{
//			// Calling method show() via super keyword which refers to parent class
//			super.show();
//			System.out.println("i am in Anaonymous class");
//		}
//	};
//	public static void main(String[] args)
//	{
//		// Calling show() method inside main() method
//		d.show();
//	}
//}

/* Program to Illustrate Anonymous Inner Classes
   Declaration Without Any Name as an implementer of Specified interface. */

interface Hello {
	void show();
}

class AnonymousInnerClass {

	// Class implementing interface
	static Hello h = new Hello() {

		public void show() {
			System.out.println("I am in anonymous class");
		}
	};

	public static void main(String[] args) {
		// Calling show() method inside main() method
		h.show();
	}
}
