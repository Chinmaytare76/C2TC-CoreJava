package array;

public class Stringhanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Chinmay");
		s.concat("Tare");
		System.out.println(s);

		StringBuffer s1=new StringBuffer("Chinmay");
		s1.append("Tare");
		System.out.println(s1);
		System.out.println(s.replace('a','k'));
		System.out.println(s.equalsIgnoreCase("Chinmay"));
	}

}
