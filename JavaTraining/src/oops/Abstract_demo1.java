package oops;

public class Abstract_demo1 {

	public static void main(String[] args) {
		Scooty Activa = new Scooty();
		Activa.noofwheels();

	}

}
abstract class Vehicle
{
	abstract public void noofwheels();
	}
class Scooty extends Vehicle
{

	@Override
	public void noofwheels() {
		System.out.println("No of wheels in scooty = "+2);
	}}
