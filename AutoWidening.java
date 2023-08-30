package java_tutorials;

public class AutoWidening{

	public static void main(String[] args) {

		int i = 100;
		long l = i; // no explicit type casting is required
		float f = l; // no explicit type casting required
		System.out.println("i= " + i);
		System.out.println("l= " + l);
		System.out.println("f= " + f);
	}
	
}
