package java_tutorials;

public class SIB {
	// SIB executes when the class gets loaded and executes only once in entire execution
	
	static {
		System.out.println("SIB-1");
	}

	static {
		System.out.println("SIB-2");
	}
	// IIB executes when the constructor is called but before the execution of constructor.
	// So it executes as many times as constructor gets executed.
	{
		System.out.println("IIB-1");
	}

	{
		System.out.println("IIB-2");
	}

	public SIB() {
		System.out.println("Constructor");
	}
	
	public void  execute() {
		SIB sib = new SIB();
		System.out.println("--------");
		SIB sib1 = new SIB();

	}

}
