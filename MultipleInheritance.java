package java_tutorials;

interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class MultipleInheritance implements Printable, Showable{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
MultipleInheritance obj = new MultipleInheritance();  
obj.print();  
 }  
}  





//interface Drawable {
//	void draw();
//}
//
//class Rectangle implements Drawable {
//	public void draw() {
//		System.out.println("drawing rectangle");
//	}
//}
//
//class Circle implements Drawable {
//	public void draw() {
//		System.out.println("drawing circle");
//	}
//}
//
//class MultipleInheritance {
//	public static void main(String args[]) {
//		Drawable d = new Circle(); // object is provided by method e.g. getDrawable()
//		d.draw();
//	}
//}