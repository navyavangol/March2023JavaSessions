package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		int k[] = new int[4];
		k[0] = 10;
		k[1] = 20;
		
		//the default value of integer or any primitive datatype is always zero
//		System.out.println(k[0]);//10;
//		System.out.println(k[2]);//0
		
		k[3]=500;
		System.out.println(k[3]);//500

		
		
		//Array Literals : static array : having array element already
		int p[]= {10,20,30,40,50,60,70,80,90};
		//lowest index=0
		//highest index=8
		//length=9
		System.out.println(p.length);//9
		//p[10]=700; //error -AIOB
//System.out.println(p[10]);//Error - ArrayIndexOutOfBound (AIOB) Exception so we call it as Array Literals is a static array
		
		//double Literals
		double d[]= {12.2,13.2,12.44};
		
		char c[]= {'a','k','l'};
		
		String s[]= {"navya","abhi","anu"};
		
		System.out.println("---------------------");
		Object studentArray[]= {"Navya",'F',32,"India",34.45,true};
		
//		System.out.println(d);//random memory allocation number
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(studentArray));
		
		System.out.println("---------------------");
		for(String e : s) {
			System.out.println(e);
		}
		
		System.out.println("---------------------");
		
		for(Object e:studentArray) {
			System.out.println(e);
		}
		
		
		
		

	}

}
