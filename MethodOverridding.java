package java_tutorials;

class ABC {

	    public static void sample() {
	        System.out.println("Method of the base class");
	    }
	}
	public class MethodOverridding extends ABC {
	    public static void sample() {
	        System.out.println("Method of the MethodOverridding class");
	    }
	    public static void main(String args[]) {
	    	MethodOverridding obj2 = new MethodOverridding();
	        ABC obj1 = new ABC();
	        
	        obj1.sample();
	        obj2.sample();
	    }
	}