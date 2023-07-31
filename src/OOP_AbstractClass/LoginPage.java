package OOP_AbstractClass;

public class LoginPage extends Page{

	//hidden constructor -- default constructor
	
	public LoginPage() {
		System.out.println("Login page --- default constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("Login page " + i);
	}
	
	@Override
	public void title() {
		System.out.println("LP --- title");
		
	}

	@Override
	public void url() {
		System.out.println("LP ---- url");
		
	}
	
	@Override
	public void defaultPageTimeOut() {
		System.out.println("page -- time out = 10sec");
	}

		
	public void doLogin() {
		System.out.println("LP --- login to app");
	}

}
