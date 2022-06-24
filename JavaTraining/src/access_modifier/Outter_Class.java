package access_modifier;
// conclusion is static inner class 
public class Outter_Class {
 	int x  =10; 
	
	                        static class inner{
		               public void main() {
		            	   System.out.println("I am inner class");
		            	   
		               }
	                                     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter_Class.inner obj = new Outter_Class.inner() ;// object creation
	 obj.main();
	}

}


