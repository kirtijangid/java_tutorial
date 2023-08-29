package java_tutorials;

public class ConstructorOverloading {
		
	int id;
	String name;
	
	ConstructorOverloading(){
		System.out.println("Default constructor");
	}
	ConstructorOverloading(int i, String n){
		 id = i;
		 name = n;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading s = new ConstructorOverloading();
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student id : "+s.id + "\nStudent name : "+s.name);  
		  
		System.out.println("\nParameterized Constructor values: \n");  
		ConstructorOverloading k = new ConstructorOverloading(10, "kirti");  
		System.out.println("Student id : "+k.id + "\nStudent name : "+k.name);  
	}

}
