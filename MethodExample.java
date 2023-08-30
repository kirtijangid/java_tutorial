package java_tutorials;

class PerformArithmeticOperation {
	int sum = 0;
	int sub = 0;
	int div = 0;

	public int addNumbers(int x, int y) {
		sum = x + y;
		return sum;
	}

	public int subtractNumber(int x, int y) {
		sub = x - y;
		return sub;
	}

	public int divideNumbers(int x, int y) {
		div = x / y;
		return div;
	}
}

class MethodExample {

	public static void main(String[] args) {

		PerformArithmeticOperation obj = new PerformArithmeticOperation();
		System.out.println("Sum: " + obj.addNumbers(10, 20));
		System.out.println("Subtract: " + obj.subtractNumber(30, 10));
		System.out.println("Divide: " + obj.divideNumbers(10, 5));
	}
}