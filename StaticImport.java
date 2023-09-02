package java_tutorials;

//calling of predefined methods without static import

//public class StaticImport {
//
//	public static void main(String[] args) {
//		System.out.println(Math.sqrt(4));
//		System.out.println(Math.pow(9,2));
//		System.out.println(Math.abs(16.9));
//	}
//
//}

//calling of predefined methods with static import

//import static java.lang.Math.*;
//
//class StaticImport {
//	public static void main(String[] args) {
//		System.out.println(sqrt(4));
//		System.out.println(pow(2, 2));
//		System.out.println(abs(6.3));
//	}
//}

// calling of static member of System class without Class name

//import static java.lang.Math.*;
//import static java.lang.System.*;
//
//class StaticImport {
//	public static void main(String[] args) {
//		// We are calling static member of System class directly without System class
//		// name
//		out.println(sqrt(4));
//		out.println(pow(2, 2));
//		out.println(abs(6.3));
//	}
//}



// to illustrate ambiguity in case of static import

import static java.lang.Integer.*;
import static java.lang.Byte.*;
public class StaticImport {
	public static void main(String[] args)
	{
		system.out.println(MAX_VALUE);
	}
}


/* Explanation : In the above program, we are trying to access MAX_VALUE variable, 
but Every primitive data type contains MAX_VALUE variable which is pre-declared in there 
Wrapper class. Here we are importing Integer and Byte class simultaneously and trying to access 
static variable MAX_VALUE but here compiler will be confused by seeing two import statements
because both Integer and Byte class contains a static variable MAX_VALUE. 
Therefore here compiler throw an error saying Reference to MAX_VALUE is ambiguous.*/
