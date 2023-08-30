package java_tutorials;

//class TestConstructor {

//	// declare data member
//	int number;
//	String name;
//
//	TestConstructor() {
//		System.out.println("Default constructor of TestConstructor class call.");
//	}
//
//	TestConstructor(int number, String name) {
//
//		this.number = number;
//		this.name = name;
//		System.out.println("Parameterized constructor of TestConstructor class call.");
//	}
//}
//
//// create ConstructorExample class that invoke the constructor of TestConstructor  
//public class ConstructorExample {
//	// main() method start
//	public static void main(String[] args) {
//		// this would invoke the default constructor.
//		TestConstructor obj1 = new TestConstructor();
//
//		// Default constructor always provide default values, i.e., 0 and null, to the
//		// object
//		System.out.println(obj1.name);
//		System.out.println(obj1.number);
//
//		// this would invoke the parameterized constructor.
//		TestConstructor obj2 = new TestConstructor(131, "Paul");
//
//		// parameterized constructor invoke the object with the given value
//		System.out.println(obj2.name);
//		System.out.println(obj2.number);
//	}
//}

// Another Constructor example 

public class ConstructorExample {
	int num;

	ConstructorExample() {
		num = 3;
		System.out.println("Constructor invoked. num: " + num);
	}

	public void init() {
		num = 5;
		System.out.println("Method invoked. num: " + num);
	}

	public static void main(String args[]) {
		ConstructorExample tester = new ConstructorExample();
		tester.init();
	}
}
