package classandobjects;

public class Testing {

	// Launch a Browser --->chrome/safari/edge...
	// statement : browser is launched
	// return true:false -- boolean
	// launchBrowser (browserName(String))

	public boolean launchBrowser(String browserName) {
		System.out.println("Launching the Browser ..." + browserName);
		boolean flag = true;
		switch (browserName.trim().toLowerCase()) {
		case "chrome": {

			System.out.println("Launch Chrome");
			break;
		}
		case "edge": {

			System.out.println("Launch edge");
			break;
		}
		case "firefox": {

			System.out.println("Launch firefox");
			break;
		}
		case "safari": {

			System.out.println("Launch safari");
			break;
		}
		default:
			System.out.println("please pass the right browser :" + browserName);
			flag = false;
			break;
		}
		return flag;
	}

	// with multiple returns
	public boolean launchBrowserTest(String browserName) {
		System.out.println("Launching the Browser ..." + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome": {

			System.out.println("Launch Chrome");
			return true;
		}
		case "edge": {

			System.out.println("Launch edge");
			return true;
		}
		case "firefox": {

			System.out.println("Launch firefox");
			return true;
		}
		case "safari": {

			System.out.println("Launch safari");
			return true;
		}
		default:
			System.out.println("please pass the right browser :" + browserName);
			return false;
		}

	}

	public static void main(String[] args) {

		Testing test = new Testing();
//		if (test.launchBrowser("opera")) {
//			System.out.println("enter the url");
//		}
		
		boolean f=test.launchBrowserTest("opera");
		System.out.println(f);
			

	}

}
