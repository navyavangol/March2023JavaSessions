package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		//String is a class in java
		//Memory management is also different compared to primitive datatypes
		// + symbol use as concatenation operator with string 
		
		String s="hello world";
		System.out.println(s);// hellow world
		
		String s1="100";
		System.out.println(s1+20); //10020
		
		System.out.println(10+20);//30
		
		int a=100;
		int b=200;
		String x="hello";
		String y="selenium";
		
		System.out.println(a+b);//300
		System.out.println(x+y);//helloselenium
		System.out.println(a+b+x+y);//300helloselenium
		System.out.println(x+y+a+b);//helloselenium100200
		System.out.println(x+y+(a+b));//helloselenium300
		System.out.println(a+b+x+y+a+b);//300helloselenium100200
		System.out.println("the value of a"+ a);// the value of a 100
		System.out.println("the value of b"+b);//the value of b 200
		System.out.println("the sum is :" + (a+b));// the sum is: 300
		
		double c=12.33;
		double d=11.33;
		System.out.println(c+d);//23.66
		
		System.out.println(x+y+c+d);//helloselenium12.3311.33
		System.out.println(a+b+x+y+c+d);//300helloselenium12.3311.33
		System.out.println(a+b+x+y+(c+d));//300helloselenium23.66
		
		char c1='a';//97
		char c2='b';//98
		System.out.println(c1+c2);//195
		System.out.println(x+y+c1+c2);//helloseleniumab
		System.out.println(c1+c2+x+y);//195helloselenium
		
		System.out.println(a+b);//300
		System.out.println(a-b);//-100
		
		System.out.println(b/a);//2
		System.out.println(a*b);//20000
		
		System.out.println(c2-c1);//1
		System.out.println(c1*c2);//9506
		
		System.out.println("this emp is :"+ true);
		System.out.println("your bank account is :"+ false);
		
		System.out.println(9/3);//3
		System.out.println(9/2);//4 -ideally it should give 4.5, why this behavoiur becoz both the numbers are in integers
		
		System.out.println(9.0/2);//4.5 --in order to get this result atleast one number should be in float
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		System.out.println(0/1);//0
		System.out.println(0/200);//0
//		System.out.println(9/0);//usually it should give infinity but in java not defined and it will give Arithmetic exception
		
//		System.out.println(0/0);//it will give Arithmetic exception
		
		System.out.println(9.1/0);//infinity it is defined only on double values not on integers
		System.out.println(9/0.0);//infinity
		System.out.println(9.0/0.0);//infinity
		
		System.out.println(0.0/0.0);//NaN(Not a Number)
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
//		System.out.println(0/0);//it will give Arithmetic exception
		
//		System.out.println('a'/0);//it will give Arithmetic exception
		System.out.println('a'/'0');// 97/48 so output is 2
		
		byte b1=120;
		byte b2=125;
		//byte b3 =b1+b2; //this will give an error -cannot add two byte numbers in java becoz if the value change later in b1 value at that time it will be out of range of byte data type
		int b3=b1+b2;
				
		//	short b3=b+b2;//for short also will not allow to add only for integers nos can add
		//whenever we do calculation will store in integer
		//Mathematical operations like addition,subtraction,multiplication,division will not allow to do in byte and short
		
		//In order to add two byte values then value should be store in integer
		int c3=b1+b2;//valid- this we can do
		
		System.out.println(10%2);//0 
		System.out.println(9%2);//1 --modulus operator(%) - will give remainder
		System.out.println(50%3);//2
		System.out.println(70%5);//0
		
		System.out.println(100%3);//1
		
		byte h=065;//octal number -when number start with 0(zero)
		System.out.println(h);//53 -becoz it gives octal number any number will start with 0 treat as octal number - in java it will convert octal number to decimal and give the result
		//065 --> (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		//089 -->invalid becoz octal range is from 0 to 7
		//for decimal range 0 to 9
		
		short t=0736;//0-7 range
		System.out.println(t);
		
		byte x1 = 125;//1
		byte x2 = 120;//1
		int x3 = b1+b3;//64 bits -- 4 ===> 6
		
		byte x5 = (byte) (x1+x2);//245
//		System.out.println(x3);//245-256 = -11
		
		//-128 to 0 to 127 --> 256
		
		int age = 10;
		//byte /short
		
//		int x1 = 125;//4
//		int x2 = 120;//4
//		int x3 = b1+b3;//4 ===> 12
		
		System.out.println(9f/2f);//4.5
		System.out.println(9/2f);//4.5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
