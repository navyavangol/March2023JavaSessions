package OOP_AbstractClass;

public abstract class Page {
	//can not create Object of abstract class
	//can i create the const of abstract class????---Yes but abstract class will not allow to create the object of this class
	//it will be called when we create the object of child class
	
	int loadingTime=10;//here in abstract class the defined vars wont be static or final in nature
	
	public Page() {
		this(5);
		System.out.println("Page ---- default constructor");
	}
	
	public Page(int i) {
		System.out.println("Page ----"+ i);
	}
	
	//explicity mention the abstract method name with abstract
	
	//no abstract methods -- 0% abstraction 
	//all abstract methods -- 100% abstraction
	//partial abstraction --- 0 to 100% abstraction
	
	public abstract void title();
	
	public abstract void url();
	
	public void defaultPageTimeOut() {
		System.out.println("page -- time out = 20sec");
	}
	
	public static  void displayFooters() {
		System.out.println("page --- display footers");
	}
	
	public final  void displayLogo() {
		System.out.println("page --- display logo");
	}

	//default methods are allowed only in interfaces
//	default void billing() {
//		
//	}
}
