package OOP_Encapsulation;

public class Employee {

	// private class variables

	private String name;
	private int age;
	private double sal;
	private int amount;

	// public getter and setter methods - for private variables then have to create
	// getter and setter methods
	
	private void calculateShareAmount(int fee) {
		int i=10;
		//int fee=20;
		amount =i+fee;
	}
	
	public int getAmount(int fee) {
		calculateShareAmount(fee);
		return amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
