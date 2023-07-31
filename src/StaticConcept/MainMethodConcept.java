package StaticConcept;

public class MainMethodConcept {

	// calling purpose
	// no business logic
	// no return
	// CMA
	// no need to create
	// PSVM - String[]
	public static void main(String a[]) {
		System.out.println("this is the main guy");

		MainMethodConcept.main(10);
		MainMethodConcept.main(10, "Naveen");
	}

	public static void main(int a) {
		System.out.println("hi");
		System.out.println(a);
	}

	public static void main(int a, String b) {
		System.out.println("hello");
		System.out.println(a + b);
	}

}
