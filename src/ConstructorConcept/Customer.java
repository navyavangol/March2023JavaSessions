package ConstructorConcept;

public class Customer {

	String name;
	int custId;
	String city;
	long phoneNumber;

	public Customer(String name, int custId, String city, long phoneNumber) {
		this.name = name;
		this.custId = custId;
		this.city = city;
		this.phoneNumber = phoneNumber;

		// buss logic--getsalary --- finalsalry --return???? --no because constructor will not return anything

	}

	// buss logic, feature logic, implenetation logic should do in methods
	public int getSalary(int totalCTC, int bonus) {
		return totalCTC + bonus;
	}
}
