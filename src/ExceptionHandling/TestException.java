package ExceptionHandling;

public class TestException {
	public static void main(String[] args) {
		int i[] = new int[2];
		i[2] = 10;
		// here we get AIOB exception(Array Index Out of Bound)- this is runtime exception

	}
}
