package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {


		Employee e1=new Employee();
		e1.setName("navya");
		e1.setAge(20);
		e1.setSal(12.33);
		
		System.out.println(e1.getName());//navya
		System.out.println(e1.getAge());//20
		System.out.println(e1.getSal());//12.33
		System.out.println(e1.getAmount(100));//110
		
		//Login page test
		LoginPage login=new LoginPage();
		login.setUsername("admin@gmail.com");
		login.setPassword("admin@123");
		login.doLogin();//login with: admin@gmail.com admin@123
		
		LoginPage login1=new LoginPage();
		login.setUsername("cust@.com");
		login.setPassword("admin@123");
		login.doLogin();//login with: cust@.com admin@123


	}

}
