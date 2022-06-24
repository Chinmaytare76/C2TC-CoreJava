package operator;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x = 10;

		
		  if (x == 1)  // 10==1 No
		  { System.out.println("The value of x is 1"); } 
		  
		  else if 
		  (x== 2)    // 10 == 2 No
		  {
			  System.out.println("The value of x is 2"); } 
		  
		  else if (x == 3)   // 10 == 2 No
		  { 
			  System.out.println("The value of x is 3"); } 
		  
		  else   // So it will print else statement
		  {
		System.out.println("The value of x is other than 1,2,3"); 
		  }
		 
		
		switch (x)  // x = 10
		{
		case 1: 
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
		System.out.println("The value of x is other than 1,2,3");
			break;

		}*/
		char x = 'B';
		switch (x) 
		{
		case 'a' : 
		case 'A' : 
			System.out.println("The value of x is a");
			break;
		case 'b':
		case 'B' :
			System.out.println("The value of x is b");
			break;
		case 'c':
		case 'C' :	
			System.out.println("The value of x is c");
			break;
		default:
	System.out.println("The value of x is other than a,b,c");
			break;
		}



	}

}
