package classandobjects;

import java.util.ArrayList;

public class Employee {
	// class variables or global variables
	String name;
	int age;
	double salary;
	String city;

	public static void main(String[] args) {
		// class is a category(means for all objects) or it is blue print or a templates
		// Object - physical entity created from Class (category)
		// Every object is having its own properties

		int i = 10; // local variable

		// create the object of the class : using a new keyword
		Employee obj = new Employee();// here obj is object reference name
		// Employee - class name
		// obj - object reference name
		// new - is a keyword to create the object
		// new Employee() ----> Object

		obj.name = "tom";
		obj.age = 20;
		obj.salary = 12.33;
		obj.city = "bng";

		System.out.println(obj.name);// tom
		System.out.println(obj.age);// 20

		Employee obj1 = new Employee();// we can create n number of objects in a class with

		ArrayList<String> ar = new ArrayList<String>(20);// vc=20,pc=3

		ar.add("test");
		ar.add("testing");
		ar.add("testautomaton");

		ar.trimToSize(); // vc = pc = 3

		for (String e : ar) {
			if (e.equals("testing")) {
				ar.set(1, "cypress");
			}
		}

		ar.removeAll(ar);
		System.out.println(ar);

		ArrayList<String> lang = new ArrayList<String>();
		lang.add("JAVA");
		lang.add("Py");

		ar.addAll(lang);
		System.out.println(ar);

	}

}
