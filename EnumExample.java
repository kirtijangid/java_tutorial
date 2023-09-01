package java_tutorials;

  /* An enum is a special "class" that represents a group of constants 
(unchangeable variables, like final variables).*/

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

