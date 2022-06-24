package access_modifier;

public class Static_demo {
	String name;
	int roll;
	static String college = "St john college";
			
			void display() 
	{
		System.out.println(roll + " "+ name+ " "+college);
	}

static void change() {
	college = "Mumbai university";
}
	


	public Static_demo(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}





	public static void main(String[] args) {
		
		Static_demo s1=new Static_demo ("navin",01);
		Static_demo s2=new Static_demo ("aakash",02);
		s1.display();
		change();
		s2.display();
		}

}
