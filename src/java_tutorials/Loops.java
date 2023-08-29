package java_tutorials;
import java.util.*;

public class Loops {

	public void execute(){
		// TODO Auto-generated method stub
	//	Scanner sc = new Scanner(System.in);
		
		// for loop
//		for(int i=1; i<10; i++) {
//			//System.out.println("hii kirti");
//			//System.out.println(i);
//			//System.out.println(i+" ");
//		} 
		
		// while loop
		
//		 int i = 1;
//
//	        while (i < 6) {
//	            System.out.println(i);
//	            i++;
//		}
	        
	        // do while loop
	        
//	        int k =1;
//	        do {
//	        	 System.out.println(k);
//	        	 k++;
//	        }while(k<11);
	         
	        // sum of n natural numbers
	        //int n= sc.nextInt();
//	        int sum = 0;
//	        for(int i=0; i<=n; i++) {
//	       sum = sum+i;
//	        	System.out.println(sum);
//	        }
	        
	        //print table of number entered by user
	        
//	        for(int i=1; i<11;i++) {
//	        	 System.out.println(n*i);
//	        }
	       
	        // patterns -----
		
		//printing * one in a line
	        int n=5;
	        int m=6;
//	        for(int i=1; i<n; i++) {
//	        	 for(int j=1; j<m; j++) {
//	 	        	System.out.print("*");
//	 	        }
//	        	System.out.println();
//	        }
	        
	        // hollow rectangle
	        
	        for(int i=1; i<=n; i++) {
	        	for(int j=1; j<=m; j++) {
	        		if(i==1 || j==1 || i==n || j==m) {
	        			System.out.print("*");
	        		}else {
	        			System.out.print(" ");
	        		}
	        	}
	       System.out.println();
	        }
	}	
}