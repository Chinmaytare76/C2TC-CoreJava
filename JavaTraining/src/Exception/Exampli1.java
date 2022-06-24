package Exception;

public class Exampli1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
  try {
	 //int x = args.length;
	 //int y = 10/x;
	/*  int i , sum;
	  sum =10;
	  for (i = -1; i <3;i++)
	  {
		  sum = (sum/i);
	  
		  System.out.println(i);}
	*/
	  throw new NullPointerException ("Heo");
	  
  }
  catch(ArithmeticException e){
	  System.out.println("1");
	  
  }
  System.out.println("rest of code ");
  
	}

}
