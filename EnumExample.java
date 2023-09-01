package java_tutorials;

/* An enum is a special "class" that represents a group of constants 
(unchangeable variables, like final variables).*/

//public class EnumExample {
//
//	enum level{
//		LOW,
//		HIGH,
//		MEDIUM
//		
//	}
//	
//	public static void main(String[] args) {
//		level obj = level.MEDIUM;
//		level obj1 = level.HIGH;
//		
//		System.out.println(obj);
//		System.out.println(obj1);
//	}
//}
//

// another example

enum Level {
	LOW, MEDIUM, HIGH
}

public class EnumExample {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}
}