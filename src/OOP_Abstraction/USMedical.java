package OOP_Abstraction;

public interface USMedical extends WHO,UN {
	
	int min_fee=10;//it will store in metaspace - vars are static and final by default
	
	//method has no body 
	//only method declaration /method prototype
	//no business logic
	//abstract methods
	//not mandatory to mention abstract to the method name
	
	//abstraction --- hiding the implementation
	//abstract method means no method body
	
	public void physioServices();
	
	public void cardioServices();
	
	public void ENTServices();
	
	public void emergencyServices();
	
	public void test(int a);
	
	public String get(int a);
	
	public String get(int a,int b);
	
	@Override
	public void covidVaccination();
	
	
	//from JDK 1.8 (partial abstraction)
	//1. can have static method with method body (with business logic)
	public static void USMedPharmacy() {
		System.out.println("US----- Med Pharmacy");
	}
	
	public static void USMedPharmacy(int a) {
		System.out.println("US----- Med Pharmacy");
	}
	
	//2. can have a default method(non static) with method body-- practically will not use this
	default void billing() {
		System.out.println("US ------ Medical billing");
	}
	
	default void billing(int a) {
		System.out.println("US ------ Medical billing");
	}

}
