package OOP_AbstractClass;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage(10);
		//when we create the object of the parent abstract class then will call the default constructor
		
		lp.title();//LP --- title
		lp.url();//LP ---- url
		lp.defaultPageTimeOut();//page -- time out = 10sec
		lp.doLogin();//LP --- login to app
		lp.displayLogo();//page --- display logo
		Page.displayFooters();//page --- display footers
		lp.loadingTime=30;//
		
		//top casting
		
		System.out.println("--------");

		Page p = new LoginPage();
		p.title();//LP --- title
		p.url();//LP ---- url
		p.defaultPageTimeOut();//page -- time out = 10sec -- here preference will give to child class only even we do top casting
		
		
		//Page p1 = new Page();
		
		//down casting: Not allow to create object for abstract class 

	}

}
