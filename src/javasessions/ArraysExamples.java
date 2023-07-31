package javasessions;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {

		// online e-commerce app
		// cricinfo
		// default value of object array,string array is always null
		// For primitive datatypes default value of array is always null

		// player :playername,int,country,total runs ,strike rate
		Object player[] = new Object[5];
		player[0] = "Rashid Khan";
		player[1] = 30;
		player[2] = "Afg";
		player[3] = 5000;
		player[4] = 110.2;

		Object player1[] = new Object[5];
		player1[0] = "Virat";
		player1[1] = 35;

		System.out.println(player1[2]);// null

		System.out.println(Arrays.toString(player1));// [Virat, 35, null, null, null]

		System.out.println(Arrays.toString(player));// [Rashid Khan, 30, Afg, 5000, 110.2]

		// String array:
		String st[] = new String[5];
		st[0] = "Azmoon";
		st[1] = "Raza";
		System.out.println(Arrays.toString(st));//[Azmoon, Raza, null, null, null]

		// int
		int i[] = new int[5];
		i[0] = 100;
		System.out.println(Arrays.toString(i));//[100, 0, 0, 0, 0]

		short sh[] = new short[5];
		sh[0] = 200;
		System.out.println(Arrays.toString(sh));//[200, 0, 0, 0, 0]

		// double:
		double db[] = new double[5];
		db[0] = 200.12;
		System.out.println(Arrays.toString(db));//[200.12, 0.0, 0.0, 0.0, 0.0]

		// char:
		char ch[] = new char[5];
		ch[0] = 'a';
		System.out.println(Arrays.toString(ch));//[a, , , , ] --it will give blank spaces

		// boolean:
		boolean bool[] = new boolean[5];
		bool[0] = true;
		System.out.println(Arrays.toString(bool));//[true, false, false, false, false]

		// int, short, long, byte: 0
		// double, float: 0.0
		// char: blank space
		// boolean: false
		// non-primitive: String, Object: null

		//
		int num[] = { 2, 4, 55, 1, 20, 67, 900 };
		System.out.println(Arrays.toString(num));//[2, 4, 55, 1, 20, 67, 900]
		num[0] = 100;
		System.out.println(Arrays.toString(num));//[100, 4, 55, 1, 20, 67, 900]

		//num[9] = 500;
		//System.out.println(Arrays.toString(num));//AIOB error
		
		//delete a value from array - not possible to do in static array
		String str[]= {"navya","abhi","anu","honey"};
		str[0]=" ";
		System.out.println(Arrays.toString(str));//[ , abhi, anu, honey]
		

	}

}
