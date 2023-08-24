package java_tutorials;

public class SIB {
			   
		    static {
		        System.out.println("SIB-1");
		    }
		   
		    static {
		        System.out.println("SIB-2");
		    }
		   
		    {
		        System.out.println("IIB-1");
		    }
		   
		    {
		        System.out.println("IIB-2");
		    }
		    public SIB() {
		        System.out.println("Constructor");
		    }
		   
		 
		    public static void main(String[] args) {
		        SIB sib = new SIB();
		        System.out.println("--------");
		        SIB sib1 = new SIB();
		    }
	}

