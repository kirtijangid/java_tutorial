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