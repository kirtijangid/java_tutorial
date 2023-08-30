package java_tutorials;

class  Parent{  
	   void PrintData() {  
	      System.out.println("method of parent class");  
	   }  
	}  
	  
	class Child1 extends Parent {  
	   void PrintData() {  
	      System.out.println("method of child class");  
	   }  
	}  
	class UpcastingExample{  
	   public static void main(String args[]) {  
	        
	      Parent obj1 = (Parent) new Child1();  
	      Parent obj2 = (Parent) new Child1();   
	      obj1.PrintData();  
	      obj2.PrintData();  
	   }  
	}  
