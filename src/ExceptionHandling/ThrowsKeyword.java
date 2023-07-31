package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}

	//below method is just throwing the exception but not handling 
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i = 9 / 0;
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();

		System.out.println("bye");

	}

}