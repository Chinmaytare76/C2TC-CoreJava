package oops;

public class Method_overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.m(); // method call ..  Exact match is searched by the compiler
		t.m(56);
		t.m(67.56);
		t.m('a');

	}

}

//overload the method

class Test{
	public void m()
	{
		System.out.println("no arguments");
	}

public void m(int i)
{
	System.out.println("integer");
}
public void m(double d)
{
	System.out.println("double");
}
}