package OOP_Inheritance;

public class BMW extends Car{
	
	//Method overriding - run time polymorphism
	//when we have a method in parent class and the same name in child class with :
	//the same name
	//the same number of parameters 
	//the same sequence/order of the parameters
	//with the same return type
	
	@Override
	public void start() {//this method is method overriding because same method name as in parent class Car
		System.out.println("BMW --- start");
	}
	
	//individual method
	public void autoparking() {
		System.out.println("BMW ---- autoParking");
	}
	
	@Override//this method override from grandparent class
	public void engine() {
		//super.engine();//this method will call from the vehicle class(grand parent class)
		System.out.println("BMW ------ turbo engine");
	}
	
	//this is not override method-it is a separate method
	//this method is called as Method Hiding - when to try to have the same parent class static method same as in the child class
//	public static void billing() {
//		System.out.println("BMW----- billing");
//	}
	
	//here it is just a private method in BMW class
	//Individual private method -- this is not method hiding
	private void testing() {
		System.out.println("BMW---- testing");
	}
	
	//this is  method hiding
//	private static void testing() {
//		System.out.println("car ---- testing");
//	}
	



}
