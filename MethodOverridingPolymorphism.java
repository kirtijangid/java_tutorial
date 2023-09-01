package java_tutorials;

//class SuperParent {

//
//	void Print() {
//
//		System.out.println("parent class");
//	}
//}
//
//class subclass1 extends SuperParent {
//
//	void Print() {
//		System.out.println("subclass1");
//	}
//}
//
//class subclass2 extends SuperParent {
//
//	void Print() {
//
//		System.out.println("subclass2");
//	}
//}
//
//class MethodOverridingPolymorphism {
//
//	public static void main(String[] args) {
//
//		// Creating object of class 1
//		SuperParent a;
//
//		a = new subclass1();
//		a.Print();
//
//		a = new subclass2();
//		a.Print();
//	}
//}

// Another example for method overriding 

class Vehicle {
	
	void run() {
		System.out.println("Vehicle is moving");
	}
}


class MethodOverridingPolymorphism extends Vehicle {
	
	void run() {
		System.out.println("car is running safely");
	}

	public static void main(String args[]) {
		MethodOverridingPolymorphism obj = new MethodOverridingPolymorphism();
		obj.run();
	}
}
