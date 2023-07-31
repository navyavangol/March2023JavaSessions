package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
	BMW b=new BMW();
	
	
	b.stop();//car --- stop//inherited
	b.refuel();//car --- refuel//inherited
	b.start();//BMW --- start//overridden
	b.autoparking();//BMW ---- autoParking //individual method
	b.engine();//BMW ------ turbo engine
	BMW.billing(); //car ----- billing --here billing method is not present in BMW class but it is present in parent car class
	b.power(); /// this is inherited method
	
	System.out.println("-----------------------");
	
	Audi d=new Audi();
	d.start();//Audi --- start
	d.theftSafety();//Audi --- theftSafety
	d.stop();//car --- stop
	d.refuel();//car --- refuel
	Audi.billing();//car ----- billing
	d.power();//car---- Power
	d.ABS();//car---- ABS
	
	System.out.println("-----------------------");
	
	Car c=new Car();
	c.start();//car --- start
	c.stop();//car --- stop
	c.refuel();//car --- refuel
	c.engine();//vehicle--- engine
	
	System.out.println("-----------------------");
	
	//child class object can be referred by parent class ref variable
	//top/up casting 
	//reference type will fail here because indivisual methods in BMW we cannot able to call because of reference check
	Car c1=new BMW();
	c1.start();//BMW --- start -- here will call overridden method - will call from child class this will happen during runtime
	c1.stop();//car --- stop
	c1.refuel();//car --- refuel
	c1.engine();//vehicle--- engine
	
	
	
	System.out.println("-----------------------");
	
	//can we do top casting with grand parent class ref variable
		Vehicle v=new BMW();
		v.engine();//we can access only the methods available in grand parent class
		
		
	
	//can we do down casting? - will not allow
	//BMW b1=new Car(); --Not possible
	//parent class object can be referred by child class ref variable using down casting? No ClassCastException will come on run time
//	BMW b1=(BMW) new Car();//ClassCastException error at run time
//	b1.start();//ClassCastException error
	
		//downcasting by grand parent - not possible
		//BMW v1= new Vehicle();--not possible - //ClassCastException error
		
	
	
	

	
	
	
	
	}

}
