package java_tutorials;

class Grandfather{
	public void H1(){
		System.out.println("class1 - grandfather");
	}
}

class Father extends Grandfather{
	public void H2() {
		System.out.println("class2 - father");
	}
}

class Son extends Father{
	public void H3() {
		System.out.println("class3 - son");
	}
}

     // hybrid is daughter
public class Hybrid extends Father {
	public void H4() {
		System.out.println("class4 - daughter");
	}


	public static void main(String[] args) {
		Son obj1 = new Son();
		obj1.H1();
		obj1.H2();
		obj1.H3();
		
		Hybrid  obj2 = new Hybrid();
		obj2.H1();
		obj2.H2();
		obj2.H4();
		
		Father obj3 = new Father();
		obj3.H1();
		

	}

}
