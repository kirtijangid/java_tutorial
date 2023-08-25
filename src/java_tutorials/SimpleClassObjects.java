//object --- entity that has state and behavior. It is an instance of a class. 
/* class ---A class is a group of objects which have common properties.
It is a template or blueprint from which objects are created. It is a logical entity.*/

package java_tutorials;

 class SimpleClassObjects1 {
 
		 int id;  
		 String name;  
		}  
		class SimpleClassObjects{  
		 public static void main(String args[]){  
		  //Creating objects  
			 SimpleClassObjects1 s1=new SimpleClassObjects1();  
			 SimpleClassObjects1 s2=new SimpleClassObjects1();  
		  //Initializing objects  
		  s1.id=101;  
		  s1.name="kirti";  
		  s2.id=102;  
		  s2.name="suryansh";  
		  //Printing data  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name);  
		 }
		}