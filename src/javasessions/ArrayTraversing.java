package javasessions;

import java.util.Arrays;

public class ArrayTraversing {

	public static void main(String[] args) {

		int k[] = new int[4];

		k[0] = 10;
		k[1] = 20;
		k[2] = 30;
		k[3] = 40;

		System.out.println(Arrays.toString(k));// [10,20,30,40] -- here Arrays is a class

//		System.out.println(k);//it will print random memory address

		// To interate the array : for loop
		// index based loop
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);// 10 20 30 40
		}

		System.out.println("---------------");

		// for each loop
		for (int e : k) {
			System.out.println(e);// 10 20 30 bye
			if (e == 30) {
				System.out.println("bye");
				break;
			}
		}

		System.out.println("---------------");

		//
		short s[] = new short[4];
		s[0] = 10;
		s[1] = 100;
		s[2] = 104;
		s[3] = 105;

		for (short e : s) {
			System.out.println(e);// 10 100 104 105
		}

		System.out.println("---------------");

		// String array
		String browsers[] = new String[3];
		browsers[0] = "chrome";
		browsers[1] = "firefox";
		browsers[2] = "edge";

		for (String e : browsers) {
			System.out.println(e);// it will print chrome firefox edge
		}

		System.out.println("---------------");

		for (String e : browsers) {
			System.out.println(e);
			if (e.equals("chrome")) {
				System.out.println("launch chrome browser");
				break;
			}
		}
		
		//Employee data : String,int,char,boolean,float
		//want to store different datatypes in a single variable by using object array
		//Object is a class is already built in Java
		
		System.out.println("---------------");
		
		Object obj[]=new Object[5];
		obj[0]="Navya";
		obj[1]=32;
		obj[2]=12.33;
		obj[3]='F';
		obj[4]=true;
		
		for(Object e: obj) {
			System.out.println(e);
		}
		
		//by using for each in order to print in the index form 
		//eg: 0=Navya
		//1=32 ...
		
		System.out.println("---------------");
		
		int count=0;
		for(Object e: obj) {
			System.out.println(count + "=" + e);
			count++;
		}
		
		System.out.println("---------------");
		
		for(int i=0;i<5;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("---------------");
		
		//reverse order by index based for loop
		for(int i=obj.length-1; i>=0 ; i--){
			System.out.println(obj[i]);//true F 12.33 32 Navya
		}
		
		//reverse order by using for each --Not possible -- can do by using dynamic array
		
		
		
		
		

	}

}
