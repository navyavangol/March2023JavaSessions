package classandobjects;

public class Person {

	// Method overloading --will always happen in the same class --Poly(many)
	// +morphism(forms) of the method -->compileTime(static binding) polymorphism
	// Within the class if we have multiple methods ,
	// 1. with the same method name
	// 2. with the different parameters
	// 3. with the different types of parameter
	// 4. with the different sequence/order of the parameters
	// 5. return type does not matter

	// we have a limit to pass the number of parameters to the method is 255

	public void test() {// 0 parameter

	}

	public void test(int a) {// 1 parameters

	}

	public void test(int a, int b) {// 2 parameters

	}

	public void test(String a) {// 1 parameters

	}

	public void test(int a, int b, int c) {

	}

	// use cases of method overloading
	// amazon -- search
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {
		System.out.println(name + " " + price);
	}

	public void search(String name, int price, String color) {

	}

	// login
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String phone, int otp) {

	}

	// pop methods overloaded
	public int pop(int x) {
		return 1000;

	}

//	public int pop(int a) {//call by value
//	System.out.println("hiiii");
//	return 1000;
//}

//public int pop(long a) {
//	System.out.println("hello");
//	return 1000;
//}

	public Integer pop(Integer a) {// call/pass by ref
		System.out.println("bye");
		return 100 + a;
	}

	// payment
	public void dopayment(String cc, int cvv) {

	}

	public void dopayment(String upi) {

	}

	public void dopayment(String cc, int cvv, int otp) {

	}

	public void booking(String stPoint, String enPoint) {

	}

	public void booking(String stPoint, String enPoint, String carType) {

	}

	public void booking(String stPoint, String enPoint, int persons) {

	}

	public static void main(String[] args) {

		Person obj = new Person();
		// which method has to be called --its already decided at the compile time -- it
		// will not decide at the run time
		obj.search("nike");
		obj.search("mouse", 1000);

		int u = obj.pop(10);
		// if we want to call object with parameter long then we pass the arguement with
		// the larger value+L--it indicates long value

		System.out.println(u);// 110

	}

}
