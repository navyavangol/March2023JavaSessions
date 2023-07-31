package BuilderPattern;

public class ShopTest {

	public static void main(String[] args) {

		// with the builder pattern we can call mutiple methods
		Shopping shop = new Shopping();

		// 1.
		shop.login("navya", "navya123@gmail.com").search("macbookpro").addToCart("macbookpro").doPayment("navya@gmail")
				.generateOrder().logout();// this is the example of builder class

		// 2.
		shop.login("navya", "navya123@gmail.com").search("Tshirt", 1000).addToCart("Tshirt").logout();

		// 3
		shop.login("navya", "navya123@gmail.com").search("Tshirt", 1000).search("macbook").addToCart("mackbook")
				.doPayment("kjh@gmail").logout();

		// 4
		shop.login("navya", "navya123@gmail.com").logout();
		
		

	}

}
