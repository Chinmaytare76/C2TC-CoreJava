package array;

public class Stringhanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Navin");
		s.concat("bairi");
		System.out.println(s);

		StringBuffer s1=new StringBuffer("Navin");
		s1.append(" bairi");
		System.out.println(s1);
		System.out.println(s.replace('a','k'));
		System.out.println(s.equalsIgnoreCase("navin"));
	}

}
