package java_tutorials;

public class EnumExample {

	enum level{
		LOW,
		HIGH,
		MEDIUM
		
	}
	
	public static void main(String[] args) {
		level obj = level.MEDIUM;
		level obj1 = level.HIGH;
		
		System.out.println(obj);
		System.out.println(obj1);
	}
}

