//Static Block : Execute before main method
package access_modifier;

public class Static_block {

	public static void main(String[] args) {
		System.out.println("4");
		m();// static method no need of the object 
		
		//Static_block obj = new Static_block();// static method no need of the object 
				//obj.m();
		
	}
	static {
		System.out.println("1");
		m();
	}
	static {
		System.out.println("2");
	}
	static {
		System.out.println("3");
	}
	static void m() {
		System.out.println("8");
	}

}
