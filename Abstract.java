package java_tutorials;

//abstract class Abstract1{

//		abstract void run();     // abstract method don't have body
//			
//	
//}
//public class Abstract extends Abstract1 {
//	void run() {
//		System.out.println("abstract class");
//	}
//	public static void main(String[] args) {
//		Abstract1 obj = new Abstract();
//		obj.run();
//	}
//}

// another example using abstract class and method

//abstract class Shape{  
//abstract void draw();  
//}  
//  
//class Rectangle extends Shape{  
//void draw(){System.out.println("drawing rectangle");}  
//}  
//class Circle1 extends Shape{  
//void draw(){System.out.println("drawing circle");}  
//}  
// 
//class Abstract{  
//public static void main(String args[]){  
//Shape s=new Rectangle();  
//s.draw();  
//}  
//}  

// another example for abstract class and method

//abstract class Bank{    
//abstract int getRateOfInterest();    
//}    
//class SBI extends Bank{    
//int getRateOfInterest(){return 7;}    
//}    
//class PNB extends Bank{    
//int getRateOfInterest(){return 8;}    
//}    
//    
//class Abstract{    
//public static void main(String args[]){    
//Bank b;  
//b=new SBI();  
//System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
//b=new PNB();  
//System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
//}}    




		//Example of an abstract class that has abstract and non-abstract methods  



abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

//Creating a Child class which inherits Abstract class  
class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

//Creating a Test class which calls abstract and non-abstract methods  
class Abstract {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}


// Rule: If there is an abstract method in a class, that class must be abstract.


