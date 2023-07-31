package Assignments;

public class DataTypesQuiz {

	public static void main(String[] args) {
		
//		1. Write a Java program to add two strings:

			String a = "Hello";

			String b = "Naveen K";

//			Expected Output :
//
//			Hello Naveen K
			System.out.println(a+" "+b);

//			2. Write a Java program to print the sum of two numbers.
//
//			Test Data:?.,
//
//			 74 + 36 
//
//			Expected Output:
//
//			110
			System.out.println(74+36);//110
//
//			 3. Write a Java program to print the division of two numbers.
//
//			k = 50/3
			
			System.out.println(50/3);
//
//			Expected Output :  16

			
//
//			4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
//
//			Test Data:
//
//			((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//
//			Expected Output
//
//			2.138888888888889
			
			System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//
//			5. Try to concat "Hello Selenium" with a character 't'
			System.out.println("Hello Selenium"+" "+"t");
//
//			6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//
//			"Your Total amount is. 3700".
			System.out.println("Your Total amount is :" + (100+200+3400));
			
//
//			7. Print the ASCII value of the character 'h'.
			char f='h';
			System.out.println((int) f);
//
//			Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
			int y='d';
			System.out.println(y+3);
//
//			Write a program to find the square of the number 3.9.
			System.out.println(3.9*3.9);


	}

}
