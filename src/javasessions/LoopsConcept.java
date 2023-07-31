package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//print from 1 to 10
		//1. While loop
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int l=1;
//		while(l<=100) {
//			if(l==5) {
//				System.out.println("hi");
//				break;// if we keep break here it will print 1234hi- break means come out of the entire while loop
//			}
//			System.out.println(l);
//			l++;
//		}
		
//		while(true) {
//			System.out.println("bye");//here bye will be keep printing infinite times
//		}
		
		int count=0;
		while(count<=100) {
			System.out.println(count);//01234...25.......50
			if(count==25) {
				System.out.println("25 runs");
			}
			if(count==50) {
				System.out.println("half century");
			}
			if(count==100) {
				System.out.println("century");
			}
			
			count++;
		}
		
		//use cases of while loop:
			//we have to use while loop when number of iterations are not fixed
			//wait for the element on the page: 0, 2, 5, 10, 20
			//wait for the page loading: 0, 5, 10, 20
			//drop down values: 
			//webtable pagination: 
			//calendar: 
			//carousel:
			
			System.out.println("--------");
			//1 to 10:
			//for loop: 
			for(int k=1; k<=10; k++) {
				System.out.println(k);//1
			}
			//
//			System.out.println("----");
//			for(int p=1; p<=10; ) {
//				System.out.println(p);//111111111
//			}
			
			//
			int g=1;
			for(; g<=10; ) {
				System.out.println(g);//1234
				g++;
			}
			System.out.println("------");
			//
			for(int m=1; m<=10; m++) {//11
				System.out.println(m);//13579
				m++;//10
			}
			
			//
			System.out.println("------");
			//keep printing bye infinite times without mention break statement inside for loop
			for(;;) {
				System.out.println("Bye");
				break;
			}
			
//			for(;true;) {//it will print bye infinite
//				System.out.println("Bye");
//				
//			}
			
//			for(;false;) {//it will show dead code
//				System.out.println("Bye");
//				
//			}
			
			
			//here it will print 0Duck...bye thats it becoz inside if break statement is there so it will come out of the entire for loop
			for(int run=0; run<=100; run++) {
				System.out.println(run);
					if(run == 0) {
						System.out.println("DUCK....bye");
						break;
					}
					
					System.out.println("Hello");
			}
			
			System.out.println("----");
			
			//use cases for loop:
			//use for loop when number of iterations are fixed
			//to fetch the values from the array 
			int arr[] = new int[4];
			//0 to 3
			arr[0] = 100;
			arr[1] = 200;
			arr[2] = 300;
			arr[3] = 400;

			for(int n=0; n<arr.length; n++) {
				System.out.println(arr[n]);//100 200 300 400 
			}
			//drop down -- month -- 1 to 12
			//country drop down
			//menu - sub menu
			
			
			//do-while
			//for each
			//streams - lambda
			
			
		
		
		
		
		
	}

}
