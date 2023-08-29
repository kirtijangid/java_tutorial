package java_tutorials;

public class PassByValue {

		  int a=100;     
	         void change(int a){    
	         a=a+100;//Changing values  It will be locally)   
	         }    
	         public void execute(){    
	           PassByValue p=new PassByValue();  //Creating object  
	           System.out.println(" Value (before change)="+p.a);    
	           p.change(500);  //Passing value  
	           System.out.println(" Value (after change)="+p.a);    
	          
	}

}
