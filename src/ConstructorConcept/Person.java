package ConstructorConcept;

public class Person {

	//static variables will not use in the constructor
	String name;
	static String collegeName;//abcd
	
	public Person(String name, String collegeName) {
		this.name = name;
		Person.collegeName = collegeName;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	
	
	public static void main(String a[]) {
		Person p1 = new Person("Naveen", "ABCD");
		Person p2 = new Person("Tom");
		
		System.out.println(p2.collegeName);//ABCD
		
		System.out.println(collegeName);//ABCD

	}
	
	
}
