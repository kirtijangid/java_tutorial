package java_tutorials;
import java.util.*;

public class CndtnlStatmnts {

	public void execute() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		
//			// if-else
//		
//		if (age > 18) {
//			System.out.println("eligible to vote");
//		}else {
//				System.out.println("not eligible");
//		}
		
		
		// if-else ladder
		
		int number = sc.nextInt();
		if (number==1) {
			System.out.println("hii kirti");
		} else if (number==2) {
			System.out.println("namastey kirti");
		} else if (number==3) {
			System.out.println("bonjou");
		} else {
			System.out.println("invalid number");
		}
		
		// switch
		
		switch(number){
		case 1 : System.out.println("hello");
		break;
		case 2 : System.out.println("namastey");
		break;
		case 3 : System.out.println("Bonjou kirti");
		break;
		default : System.out.println("invalid number");
		}
		
		// 
	}

}
