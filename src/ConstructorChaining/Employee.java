package ConstructorChaining;

public class Employee {

	String name;
	int age;
	double salary;

	public Employee() {		
		this("tom",20); //this will call the below constructor
	}

	public Employee(String name, int age) {
		this(name,age,12.2);
		this.name = "mithaj";
		this.age = 25;
	}
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e.name);//mithaj
		System.out.println(e.age);//25
		System.out.println(e.salary);//12.2
		
		
	}
	

}
