package operator;

public class Breaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1; i<=10; i++)
        {
       	 if(i == 1)  //if match then not print , it will continue to check next condition 
       	 {
       	continue; // break;   
       	 }
       	 System.out.println(i);
        }

	}

}
