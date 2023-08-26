package java_tutorials;

/* Initialization blocks are executed whenever the class is initialized 
    and before constructors are invoked.*/

//They are typically placed above the constructors within braces.

public class IIB {
	{
		System.out.println("IIB-1");
	}
	
	{
		System.out.println("IIB-2");
	}
	
	IIB(){
		System.out.println("constructor");
	}	
	{
	System.out.println("IIB-3");
	}
	
	public static void main(String[] args) {
		
		IIB obj = new IIB();
	}

}
