package ConstructorConcept;

public class Testing {

	// no one can create the object of this class?
	// create a constructor with private keyword

	private Testing() {

	}

	public static void getApp() {

	}

	public static void getAppNumber() {

	}

	public static void getBrowserVersion() {

	}

	public static void main(String[] args) {

		Testing t1 = new Testing();// within a class everything is possible means we can create an object of this
									// class even private constructor is present
	}

}
