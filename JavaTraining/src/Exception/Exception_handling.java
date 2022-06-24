package Exception;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		try
		{
			System.out.println(arr[4]);
			
			System.out.println("inside try block");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("inside catch block");
			
			
		}
		finally {
			System.out.println("inside finally block");
			
		}
		System.out.println("inside ");
		

	}

}
