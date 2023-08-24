package java_tutorials;

public class passbyvalue {

		  int a=100;     
	         void change(int a){    
	         a=a+100;//Changing values  It will be locally)   
	         }    
	         public static void main(String args[]){    
	           passbyvalue p=new passbyvalue();  //Creating object  
	           System.out.println(" Value (before change)="+p.a);    
	           p.change(500);  //Passing value  
	           System.out.println(" Value (after change)="+p.a);    
	          
	}

}
