package java_tutorials;

//interface First{

//	void show();
//}
//interface Second extends First{
//	void shows();
//
//}
// class TestInterface implements  Second{
//	
//		public void show() {
//			System.out.println("hello");
//		}
//		public void shows() {
//			System.out.println("World!");
//		}
//		public static void main(String[] args) {
//			TestInterface obj = new TestInterface();
//			obj.show();
//			obj.shows();
//	}
//}

// implements using interfaces

interface Drawable {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterface {
	public static void main(String args[]) {
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}