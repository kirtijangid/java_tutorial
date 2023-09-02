package java_tutorials;

/* Program to Illustrate Anonymous Inner classes declaration Without 
any Name as a subclass of the specified type*/

class Demo {
	void show()
	{
		System.out.println("i am in show method of super class");
	}
}
class AnonymousInnerclass  {
	// An anonymous class with Demo as base class
	static Demo d = new Demo() {
		void show()
		{
			// Calling method show() via super keyword which refers to parent class
			super.show();
			System.out.println("i am in Anaonymous class");
		}
	};
	public static void main(String[] args)
	{
		// Calling show() method inside main() method
		d.show();
	}
}

