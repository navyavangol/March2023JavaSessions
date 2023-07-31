package MethodCallingConcept;

public class User {

	// call by reference example
	// calling a method by passing a reference is called as call by reference ..ex
	// getEmail method

	public void sendEmail() {
		System.out.println("sending email method");

	}
	
	public static void getName(Employee e) {
		e.m3();
	}

	public static void getEmail(User u) {// u=u1
		System.out.println("getting email method");
		u.sendEmail();
		User.readEmail(u);
		u.test(10);
	}

	public static void readEmail(User r) {
		System.out.println("read email method");
		r.sendEmail();

	}

	public void test(int i) {
		System.out.println(i);

	}

	public static void main(String[] args) {

		User u1 = new User();
		Employee e=new Employee();
//		User.getEmail(u1); // call by reference
//		u1.test(5);// value -- call by value
		User.getName(e);
	}

}
