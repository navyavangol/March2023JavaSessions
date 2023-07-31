package classandobjects;

public class Customer {

	// instance vars
	String name;
	int age;

	// data members of the class -- data members will be access by creating an object
	// vars --class
	// methods/functions -- are used for business logic/feature/implementation
	// can not create a method inside a method
	// we can call a method from another method
	// All methods are independent or parallel to each other

	// types of method
	// 1. no return and no input
	// void means cannot return anything -- no return keyword
	public void test() {// 0 parameter
		System.out.println("test method");
		int i = 10;
		System.out.println(i);
	}

	// 2. some return and no input
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	// return type : String
	public String getTrainerName() {
		System.out.println("Getting trainer names");
		String name = "tom";
		return name;
	}

	public int getNumber() {
		System.out.println("getting number");
		return 100;
	}

	// 3. some return and some input
	public int add(int a, int b) {// parameters
		System.out.println("adding two numbers");
		int sum = a + b;
		return sum;
	}

	public int multiply(int a, int b) {
		System.out.println("Multiplying two numbers");
		int mul = a * b;
		return mul;
	}

	public double getTotalMarks(double score, int handWritingScore, int attendScore) {
		System.out.println("calculating marks");
		double finalScore = score + handWritingScore + attendScore;
		return finalScore;
	}
	
	public void get() {
		System.out.println("print the url");
		return; //blank return/no return -->void
	}

	public static void main(String[] args) {
		// create the object of the class

		Customer c = new Customer();
		c.name = "tom";
		c.age = 30;

		c.test();// calling a method

		int m = c.sum();
		System.out.println(m);

		String name = c.getTrainerName();
		System.out.println(name + "for java and selenium");
		if (name.equals("tom")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		int number = c.getNumber();// 100
		System.out.println(number + 5);// 105

//		System.out.println(c.test());//this method doesnot return any value so it is invalid and give compile error

		int n = c.add(3, 5);
		System.out.println("sum of two numbers :" + n);// sum of two numbers :8

		n = c.add(100, 200);// here 100 and 200 are arguments --values are arguments
		System.out.println(n);// 300

		int v = c.multiply(2, 3);
		System.out.println(v);// 6

		double m2 = c.getTotalMarks(90, -5, -10);
		System.out.println(m2);

	}

}
