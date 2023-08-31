package java_tutorials;

class Arithmetic {

	static int Multiply(int a, int b) {

		return a * b;
	}

	static double Multiply(double a, double b) {

		return a * b;
	}
}

class MethodOverloadingPolymorphism {

	public static void main(String[] args) {

		System.out.println(Arithmetic.Multiply(2, 4));
		System.out.println(Arithmetic.Multiply(5.5, 6.3));
	}
}
