package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		//break keyword use only when have switch and loops are there,it will not allow to use in if statement and if-else statement
	
		//switch case cannot be use for double,float,boolean,long but ,it will allow only for int,string,short and characters
		
		// switch - case: int, short, byte, string, char
		
		String browser="chrome";
		double version=111.11;
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome browser");
			if(version == 111.11) {
				System.out.println("launch chrome 111.11 ver");
				break;
			}
			break;
		case "firefox":
			System.out.println("Launch firefox browser");
			break;
		case "safari":
			System.out.println("Launch safari browser");
			break;
		case "edge":
			System.out.println("Launch edge browser");
			break;

		default:
			System.out.println("pls pass the right browser.." + browser);
			break;
		}

		
		//
		int marks = 95;
		switch (marks) {
		case 10:
			System.out.println("grade D");
			break;
		case 90:
			System.out.println("grade A");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		//
//		double bmi = 12.33;
//		switch (bmi) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}

		//
		char c = 'e';
		switch (c) {
		case 'a':
			break;
		
		}

		// NA
//		boolean flag = true;
//		switch (flag) {
//		case true:
//			
//			break;
//
//		default:
//			break;
//		}

		short s = 12;
		switch (s) {
		case 10:

			break;

		default:
			break;
		}

		// NA
//		long l = 10000;
//		switch (l) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
	}

}
