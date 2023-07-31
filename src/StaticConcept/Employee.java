package StaticConcept;

public class Employee {

	//class Static vars : Static keyword
	
	String name;//instance var
	static  int age;//static var
	
	public void getEmail() {
		System.out.println("get email method");
	}
	
	public static void sendEmail() {
		System.out.println("send email method");
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		//how to access non static variables : using object
		e.name="tom";
		
		//how to access static variables
		//1. using the class name
		Employee.age=20;
		//2. can access directly also
		//age=30;
		//3. can access using object reference name?
		//e.age=40;//warning will give--this is not the right way to access through object reference name
		
		System.out.println(Employee.age);//20
		System.out.println(e.name);//tom
		
		//how to access non static method
		e.getEmail();
		
		//how to access static method
		//1. using class name
		Employee.sendEmail();
		//2. direct calling
		sendEmail();
		
		//real time examples for static array examples - company name,department name
		
		
		
		
		

	}

}
