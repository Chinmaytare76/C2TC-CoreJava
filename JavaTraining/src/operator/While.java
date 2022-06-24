package operator;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int i=99;
			while(i<=100)  // 99 <= 100 yes , 100<=100 yes, 101<=100 no 
			{
				System.out.println(i);  // print 99, print 100,
				i++;   // i = 99+1 = 100  , 100+1 = 101
			} 

	}

}}