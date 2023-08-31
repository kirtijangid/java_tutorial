package java_tutorials;

class First {
	String name;

	void showMessage() {
		System.out.println("Parent method is called");
	}
}

class Second extends First {
	int age;

	@Override
	void showMessage() {
		System.out.println("Child method is called");
	}
}

public class DowncastingExample {

	public static void main(String[] args) {
		First p = new Second();
		p.name = "Kirti";

		// Performing Downcasting Implicitly
		// Child c = new Parent(); // it gives compile-time error

		// Performing Downcasting Explicitly
		Second c = (Second) p;

		c.age = 22;
		System.out.println(c.name);
		System.out.println(c.age);
		c.showMessage();
	}
}