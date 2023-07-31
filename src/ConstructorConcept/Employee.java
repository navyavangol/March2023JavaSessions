package ConstructorConcept;

public class Employee {

	// try to restrict to create unneccesary objects so we use constructor
	// constructor will not return any value and constructor name should be the
	// class name
	String name;
	static int age;
	String city;

	// constructor:
	// 1. name should be same as the class name
	// 2. can not return anything/no void
	// 3. can pass parameters to the constructor..constr overloading ? yes its
	// possible
	// 4. how to call const..?--we need to create the object of the class and
	// respective constructor will be called

	public Employee() {// o para const
		System.out.println("default constructor");
	}

	public Employee(int a) {// 1 param
		System.out.println(a);
	}

	public Employee(int a, int b) {// 2 param
		
	}

	public Employee(int a, String b) {// 2 param
		System.out.println(a + " " + b);
	}

	public Employee(String a, int b) {// 2 param

	}

	public static void main(String[] args) {

		Employee e1 = new Employee(10);// this will call the default constructor
		Employee e2 = new Employee(10, "tom");

	}

}
