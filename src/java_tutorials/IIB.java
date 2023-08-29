package java_tutorials;

/* Initialization blocks are executed whenever the class is initialized 
    and before constructors are invoked.*/

//They are typically placed above the constructors within braces.

//public class IIB {
//	{
//		System.out.println("IIB-1");
//	}
//	
//	{
//		System.out.println("IIB-2");
//	}
//	
//	IIB(){
//		System.out.println("constructor");
//	}	
//	{
//	System.out.println("IIB-3");
//	}
//	
//	public static void main(String[] args) {
//		
//		IIB obj = new IIB();
//	}
//
//}

/* We can have IIBs in parent class also. 
  Instance initialization block code runs immediately after the call to super() in a constructor. 
 The compiler executes the parent’s class’s IIB before executing the current class’s IIBs.*/ 

class IIB1{
	IIB1(){
		System.out.println("1 constructor called");
	}
	{
		System.out.println("IIB-1 block");
	}
}

class IIB extends IIB1{
	IIB(){
		super();
		System.out.println("constructor called");
	}
	{
		System.out.println("IIB-2 block");
	}
	public static void main(String[] args) {
		IIB  iib = new IIB(); 
	}
}





