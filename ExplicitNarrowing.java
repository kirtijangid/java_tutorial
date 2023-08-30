package java_tutorials;

public class ExplicitNarrowing {
	 
    public static void main(String[] args) {
 
        double d = 100.01;
               // long l=d;  compile time error as we are assigning larger type to smaller type without casting
        long l = (long) d; // explicit type casting is required
        int i = (int) l; // explicit type casting is required
 
        System.out.println("i= " + i);
        
        System.out.println("l= " + l);
        
        System.out.println("d= " + d);
 
    }
 
}

			//Example:

			//byte=short
			//short=int
			//int=long
			//long=float
			//float=double