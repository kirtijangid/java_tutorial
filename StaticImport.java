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

import static java.lang.Math.*;
class StaticImport {
	public static void main(String[] args)
	{
		System.out.println(sqrt(4));
		System.out.println(pow(2, 2));
		System.out.println(abs(6.3));
	}
}
