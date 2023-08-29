package java_tutorials;

interface A1 {
	void msg();
}

public class Interface implements A1 {
	public void msg() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {

		Interface obj = new Interface();
		obj.msg();
	}

}
