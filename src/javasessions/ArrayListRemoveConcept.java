package javasessions;

import java.util.ArrayList;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {

		// int - primitive datatype
		// Integer - it is a class and non primitive datatype
		// Arraylist is a class and non primitive datatype -- always maintain the order
		// -order based collection

		ArrayList<String> empList = new ArrayList<String>();

		empList.add("tom");
		empList.add("ravi");
		empList.add("anu");
		empList.add("abhi");
		empList.add("hi");

		System.out.println(empList);// [tom, ravi, anu, abhi, hi]

		empList.add("bye");
		empList.add(1, "navya");
		System.out.println(empList);// [tom, navya, ravi, anu, abhi, hi, bye]

		empList.remove(2);// index will start from 0
		System.out.println(empList);// [tom, navya, anu, abhi, hi, bye]
		System.out.println(empList.get(3));// abhi

		empList.add(0, "joe");
		System.out.println(empList);// [joe, tom, navya, anu, abhi, hi, bye]

		empList.add("selenium");
		System.out.println(empList);// [joe, tom, navya, anu, abhi, hi, bye, selenium]

		empList.remove("tom");
		System.out.println(empList);// [joe, navya, anu, abhi, hi, bye, selenium]

		empList.add("selenium");// duplicates are allowed
		System.out.println(empList);// [joe, navya, anu, abhi, hi, bye, selenium, selenium]

		empList.remove("selenium");// it will removed the first one if we have multiple values are same
		System.out.println(empList);// [joe, navya, anu, abhi, hi, bye, selenium]

		empList.remove("tom");// even it is not there wont throw any error- just it will print
		System.out.println(empList);// [joe, navya, anu, abhi, hi, bye, selenium]

		// empList.add(14, "go");//it will give error as IndexOutOfBound Exception
		
		//can we add null values in arraylist -yes- it will also allow to add multiple null values
		
		empList.add(null);
		System.out.println(empList);//[joe, navya, anu, abhi, hi, bye, selenium, null]
		
		empList.add(2,null);
		System.out.println(empList);//[joe, navya, null, anu, abhi, hi, bye, selenium, null]
		
	}

}
