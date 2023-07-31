package OOP_Encapsulation;

public class RegTest {

	public static void main(String[] args) {

		// CRUD- create read update delete

		// POST call-create a user
		Register reg = new Register("tom", 25, 6789876544L, "dvg", true);

		// check my user profile
		// GET call
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getCity());
		System.out.println(reg.getPhoneNumber());

		System.out.println("--------------------------");

		// In order to update the value - then setter will help
		// PUT
		reg.setCity("bng");
		reg.setPhoneNumber(2345678765L);

		// check my user profile
		// GET call
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getCity());
		System.out.println(reg.getPhoneNumber());

		System.out.println("--------------------------");

		Register reg1 = new Register("jerry", 3456728901L);
		// check my user profile
		// GET call
		System.out.println(reg1.getName());
		System.out.println(reg1.getPhoneNumber());
		
		
		reg1.setAge(30);
		reg1.setPerm(false);
		reg1.setCity("bng");
		System.out.println(reg1.getAge());
		System.out.println(reg1.isPerm());
		System.out.println(reg1.getCity());

	}

}
