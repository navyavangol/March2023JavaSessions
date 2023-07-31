package SuperKeyword;

public class BMW extends Car{
	
	//int min_speed=200;
	
	public BMW() {
		super(20);
		//this(8);//not allowed together -- this keyword will use within the class, if we want to call parent constructor then use super keyword
		System.out.println("BMW --- default constructor");
	}
	
	public BMW(int i) {
		super();
		System.out.println("BMW ---  constructor  " + i);
	}
	
	public void displaySpeed() {
		
		System.out.println(min_speed);//200//50
		System.out.println(super.min_speed);//100//50
	}
	
	@Override
	public void speed() {
		
		super.speed();
		System.out.println("BMW speed");
		System.out.println(super.min_speed);
		
		Car.testing();//calling static methods from parent class by using parent class name.methodname or super keyword with method name
	}
	
	

}
