package java_tutorials;

public class MethodOverLoading {

		   public static void add(int a, int b) {
		      System.out.println(a+b);
		   }
		   public static void add(int a, int b, int c) {
		      System.out.println(a+b+c);
		   }
		   public static void main(String args[]) {
		      MethodOverLoading obj = new MethodOverLoading();
		      obj.add(20, 40);
		      obj.add(40, 50, 60);
		   }
		}