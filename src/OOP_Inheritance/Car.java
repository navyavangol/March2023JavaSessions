package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final:
	//1. constant values
	//2. to prevent the method overridding
	//3. to prevent inheritance
	
	public void start() {
		System.out.println("car --- start");
	}

	public void stop() {
		System.out.println("car --- stop");
	}
	
	public void refuel() {
		System.out.println("car --- refuel");
	}
	
	@Override//this method override from Parent(vehicle) class
	public void engine() {
		System.out.println("car ---- engine");
	}
	
	//cannot be overridden but can be inherited
	public static void billing() {
		System.out.println("car ----- billing");
	}
	
	//private methods cannot be overridden
	private static void testing() {
		System.out.println("car ---- testing");
	}
	
	public void carTesting() {
		testing();
	}

	//cannot be overridden --practical example logo method
	public final void power() {
		System.out.println("car---- Power");
	}
	
	//cannot be overridden
	public final static void ABS() {
		System.out.println("car---- ABS");
	}
	
}
