package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

//		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver=new FirefoxDriver();
//		SafariDriver driver=new SafariDriver();

		String browserName = "chrome";
		WebDriver driver=null;
		

		switch (browserName.toLowerCase()) {
		case "chrome": {

			driver=new ChromeDriver();
			break;
		}
		case "firefox": {

			driver=new FirefoxDriver();
			break;
		}
		case "safari": {

			driver=new SafariDriver();
			break;
		}
		default:
			System.out.println("pls pass the right browser....");
			break;
		}

		driver.click();
		driver.sendKeys();
		driver.findElement("login");
		driver.quit();

	}

}
