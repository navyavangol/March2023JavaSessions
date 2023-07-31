package javasessions;

public class LoopsConcept_2 {

	public static void main(String[] args) {

		// print from 10 to 1
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

		System.out.println("----------------");

		// print from 10 to 1
		for (int p = 10; p >= 1; p--) {
			System.out.println(p);// 10987...1
		}

		System.out.println("----------------");

		// do-while loop
		// in do while loop the statement will execute atleast once before checking the
		// condition

		// print 1-10
		int s = 1;
		do {
			System.out.println(s);// 1234....10
			s++;
		} while (s <= 10);

		// use cases for do-while loop
		// element is already present on the page -- no need to come inside the loop
		// drop down -- default value --->0,2,5,10

		// using break in do-while loop

		int l = 1;
		do {
			System.out.println(l);// 12345hi
			if (l == 5) {
				System.out.println("hi");
				break;
			}
			l++;
		} while (l <= 100);

		System.out.println("-------------------");

		// print even numbers
		for (int j = 2; j <= 10; j = j + 2) {
			System.out.println(j);

		}

		System.out.println("-------------------");

		// print 1 to 100 but print "hi" if the number is divisible by 5
		for (int num = 1; num <= 100; num++) {
			System.out.println(num);
			if (num % 5 == 0) {
				System.out.println("hi");
			}
		}

		System.out.println("-------------------");

		// using modulus operator print odd and even number
		for (int p = 1; p <= 10; p++) {// it will print even numbers
			if (p % 2 == 0) {
				System.out.println(p);
			}

		}

		System.out.println("-------------------");
		for (int p = 1; p <= 10; p++) {// it will print odd numbers
			if (p % 2 != 0) {
				System.out.println(p);
			}

		}

		// double with loops
		for (double d = 1.0; d <= 10.0; d++) {
			System.out.println(d);// 1.0 2.0..........10.0
		}

		// 1.0 1.1 1.2...
		for (double r = 1.0; r <= 10.0; r = r + 0.1) {
			System.out.println(r);// 1.0 1.1 1.2...
		}

		System.out.println("------------------");
		// char with loops
		// print a to z
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);// it will print from a b c d.....z
		}

		System.out.println("------------------");

		// print Ascii table
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + "=" + (int) c);// it will print from a=97 b=98 .....z=122
		}

		System.out.println("print A-Z Ascii table");

		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + "=" + (int) c);// it will print from A=65 B=66 .....Z=90
		}

		System.out.println("print numeric  Ascii table");

		for (char c = '0'; c <= '9'; c++) {
			System.out.println(c + "=" + (int) c);// it will print from A=65 B=66 .....Z=90
		}

//		for(;;) {//it will print infinite loop
//			System.out.println("bye");
//		}

		for (;;) {// it will print bye once
			System.out.println("bye");
			break;
		}

		int pointer = 0;
		while (true) {
			System.out.println("checking the element :" + pointer);
			if (pointer == 10) {
				System.out.println("element is displayed ... click on ele");
				break;
			}
			pointer++;
		}

		// Print 1 to 10 and break the loop once you find the multiplication of 7 with a
		// message "bye, see you tomorrow".

		int w = 1;
		while (w <= 10) {
			System.out.println(w);
			if (w % 7 == 0) {
				System.out.println("bye -- see u tmw");
				break;
			}
			w++;
		}

	}

}
