package java_tutorials;

interface First{
	void show();
}
interface Second extends First{
	void shows();

}
 class TestInterface implements  Second{
	
		public void show() {
			System.out.println("hello");
		}
		public void shows() {
			System.out.println("World!");
		}
		public static void main(String[] args) {
			TestInterface obj = new TestInterface();
			obj.show();
			obj.shows();
	}
}
