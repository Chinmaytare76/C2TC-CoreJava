package newpack;

import pack.*; 
import Sub_pack.*; 
//import pack.A; // package.class_name 

class B
{
	public static void main(String[] args) {
		A obj = new A();
		D obj1 = new D();
	//	C obj = new C();
		
		
	//pack.A obj=new pack.A();// fully qualified name
	
	//pack.C obj1=new pack.C();
	
	obj.msg();
	obj1.msg();
	
		
			
	}

}
