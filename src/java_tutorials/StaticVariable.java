package java_tutorials;

public class StaticVariable {
		// static variable
		static int a = m1();

		// static block
		static
		{
			System.out.println("Inside static block");
		}

		// static method-----we can access it without creating object 
		static int m1()
		{
			System.out.println("from m1");
			return 20;
		}

		public void  execute() {
			System.out.println("Value of a : " + a);
			System.out.println("from main");
		}
	}

