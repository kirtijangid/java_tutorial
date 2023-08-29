
/*In constructor chain, a constructor is called from another constructor in the same class.

-- It occurs through inheritance. When we create an instance of a derived class, 
     all the constructors of the inherited class (base class) are first invoked, 
     after that the constructor of the calling class (derived class) is invoked.

We can achieve constructor chaining in two ways:

1). Within the same class: If the constructors belong to the same class, we use this
2). From the base class: If the constructor belongs to different classes (parent and child classes), 
---- we use the super keyword to call the constructor from the base class.
---- By using the constructor chaining mechanism, we can implement multiple 
       tasks in a single constructor.
        There must exist at least one constructor that does not use this    
     
   Note: In the same constructor block, we cannot use this() and super() simultaneously.*/

package java_tutorials;

public class ConstructorChaining {

	// default constructor
	ConstructorChaining() {
		this("Java");
		System.out.println("Default constructor called.");
	}

	// parameterized constructor
	ConstructorChaining(String str) {
		System.out.println("Parameterized constructor called");
	}

	public static void main(String args[]) {

		ConstructorChaining cc = new ConstructorChaining();
	}
}