
// The abstract class can also be used to provide some implementation of the interface.

package java_tutorials;

interface Base {
	void a();

	void b();

	void c();

	void d();
}

abstract class Child implements Base {
	public void c() {
		System.out.println("I am c");
	}
}

class M extends Child {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

class AbstractInterface {
	public static void main(String args[]) {
		Base a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}