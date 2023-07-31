package javasessions;

public class StringWithQuotes {

	public static void main(String[] args) {

		String str = "I love java and its concepts";

		System.out.println(str);// I love java and its concepts

		String str1 = "I love \"java\" and its concepts"; // \slash will ignore
		System.out.println(str1);// I love "java" and its concepts

		String st = "This is my \"java\" code and \"selenium\" code";

		System.out.println(st);

		String username = "admin";
		String password = "admin123";

		String url = "https://" + username + ":" + password + "@abc.com/login.html";
		System.out.println(url);

		// a[text()="Priya"]
		//String user="\"Priya\"";
//		String xpath1="//a[text()="+user+"]";
//		System.out.println(xpath1);
		
		
		
		// a[text()='Priya']

		String userName = "Naveen";
		String xpath = "//a[text()='" + userName + "']";
		System.out.println(xpath);

	}

}
