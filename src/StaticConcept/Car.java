package StaticConcept;

public class Car {

	String name;
	String engineNumber;
	String chasisNumber;
	double price;
	static final int wheels=4; 
	
	//static means common property for all if we use final keyword then the value wont change
	//local variables - static is not possible
	
	//utils/generic functions
	public static void displayLogo() {
		
	}
	
	public void getUrl() {
		
	}
	
	public static void main(String[] args) {
	
		//static int i=10; // not possible for local variables
		final int j=10;//this will allow for local variables
		
		
		Car c1=new Car();
		c1.name="Audi A6";
		c1.chasisNumber="3456dfgh";		
		
		Car c2=new Car();
		c2.name="Audi W6";
		c2.chasisNumber="AudiYI3456dfgh";		
		
		Car c3=new Car();
		c3.name="BMW A6";
		c3.chasisNumber="BMWYU3456dfgh";
		
		//Car.wheels=5;
		
		System.out.println(c3.name + " "+ c3.chasisNumber + " "+ c3.engineNumber+" "+Car.wheels);
		
		
		
		
		
		

	}

}
