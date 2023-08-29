// accessing static members from different class

package java_tutorials;

public class AccessingStaticMember {

	static int a = 10;
	static int b = 20;
	

	public void  execute() {
		static_members sm = new static_members();
		sm.addition();

	}
}

 class static_members{
	void addition() {
		int x = AccessingStaticMember.a;
		int y = AccessingStaticMember.b;
		int z = x + y;
		
		System.out.println(z);
	}
}
