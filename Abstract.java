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




abstract class Shape{  
abstract void draw();  
}  
  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
 
class Abstract{  
public static void main(String args[]){  
Shape s=new Rectangle();  
s.draw();  
}  
}  