package javasessions;

public class ConditionalOperatorsConcept {

	public static void main(String[] args) {

		// == is equal for comparison operator but not the right way to use in syso
		
//		System.out.println(10==10);//true
//		System.out.println(10==20);//false
		
		int x=10;
		int y=20;
		if(x==y) {
			System.out.println("x is equal to y");
		}
		else {
			System.out.println("x is not equal to y");
		}
		
		if(x>=y) {
			System.out.println("x is equal or greater than y");
		}
		else {
			System.out.println("bye");
		}
		
		// >,>=,<,<=,==,!=
		if(x!=y) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		if(true) { //output is hii
			System.out.println("hii");
		}
		else {//dead code - unreachable code becoz here delibrately written in if(true)
			System.out.println("bye");
		}
		
		if(false) {//output is bye and this become dead code 
			System.out.println("hii");
		}
		else {
			System.out.println("bye");
		}
		
		boolean flag=true;
		if(flag) {//here dead code warning is not coming becoz it is dependent on the flag variable value and print hi
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		double d1=12.33;
		double d2=12.34;
		if(d1==d2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		// == comparison operator 	is applicable for all primitive data types
		
		char c1='a';//ascii value is 97
		char c2='b';
		if(c1==97) {//it will compare with the ascii and give c1 and c2 are equal
			System.out.println("c1 and c2 are equal");
		}
		else {
			System.out.println("c1 and c2 are not equal");
		}
		
		
		//nested if-else statements
		//we cannot write else without if condition
		
		int marks=73;
		if(marks<=100) {
			if(marks>=90) {
				System.out.println("A Grade");
				if(marks>=95) {
					System.out.println("Eligible for scholarship");
				}
				else {
					System.out.println("not eligible for scholarship");
				}
			}
			else {
				System.out.println("B grade");
				if(marks>=70) {
					System.out.println("you got 20% discount on fee");
				}
				
			}
		}
		else {
			System.out.println("Incorrect marks");
			
		}
		
		
		//if - if - if -if
//		String browser="chrome"; //here it will output as launch chrome and pls pass the right browser... also
//		if(browser.equals("chrome")) {
//			System.out.println("Launch chrome");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("Launch safari");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("Launch edge");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}
//		else {
//			System.out.println("pls pass the right browser...." + browser);
//		}
		
		//if-elseif
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}
		else if(browser.equals("firefox")){
			System.out.println("Launch firefox browser");
		}
		else if(browser.equals("edge")) {
			System.out.println("Launch edge browser");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch safari browser");
		}
		else {
			System.out.println("pls pass the right browser...." + browser);
		}
		
		
		
		
		
		

	}

}
