package java_tutorials;

public class AutoWidening {

	public static void main(String[] args) {

		int i = 100;
		long l = i;
		float f = l;
		
		System.out.println("i= " + i);
		System.out.println("l= " + l);
		System.out.println("f= " + f);
	}

}


			// Examples:

			//short=byte
			//int=short
			//long=int
			//float=long
			//double=float


//public class AutoWidening {
//	  static void myMethod(Integer num){
//	    System.out.println("Integer Wrapper class type");
//	  }
//
//	  static void myMethod(double num){
//	    System.out.println("double primitive type");
//	  }
//	  public static void main(String[] args) {
//	    //primitive int type
//	    int n = 100;
//	    myMethod(n);
//	  }
//	}