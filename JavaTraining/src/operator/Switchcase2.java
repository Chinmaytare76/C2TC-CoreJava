package operator;

public class Switchcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "te";

		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "te":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
	}

}
