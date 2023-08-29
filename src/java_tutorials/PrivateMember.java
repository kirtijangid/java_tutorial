package java_tutorials;

 class First {
	
	private int a = 3;
	private void msg() {
		System.out.println("Hello World");
	}
	public class PrivateMember{
		
	}
	public static void main(String[] args) {
		First obj = new First();
		System.out.println(obj.a);
		obj.msg();
	}

}
