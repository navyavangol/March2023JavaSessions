package classandobjects;

import java.util.ArrayList;
import java.util.Arrays;

public class Browser {

	// WAF (Write A Function)
	// getEmployeeDevices (String empName)
	// you have to collect all the devices and return
	// Return :ArrayList<String>

	public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("Getting the device list for :" + empName);

		empName = empName.trim().toLowerCase();
		ArrayList<String> devicesList = new ArrayList<>();

		if (empName.equals("Vinayak")) {
			devicesList.add("iPhone14");
			devicesList.add("Macbook Pro");
			devicesList.add("Apple mouse");
			devicesList.add("Airtel sim");
		} else if (empName.equals("ram")) {
			devicesList.add("samsung s13");
			devicesList.add("HP Mouse");
		} else if (empName.equals("sita")) {
			devicesList.add("samsung s14");
			devicesList.add("Apple Mouse");
		}
		else {
			System.out.println("Please pass the right emp name ...emp not found " + empName);
		}

		return devicesList;
	}
	
	//using static array
	public String[] getEmployeeDevice(String empName) {
		System.out.println("Getting the device list for :" + empName);

		empName = empName.trim().toLowerCase();
		String[] devicesList = new String[4];

		if (empName.equals("vinayak")) {
			devicesList[0]="Mac book";
			devicesList[1]="Apple mouse";
			devicesList[2]="Apple Keyboard";
			devicesList[3]="Airtel sim";
			
		} else if (empName.equals("ram")) {
			devicesList[0]="samsung s13";
			devicesList[1]="HP Mouse";
			devicesList[2]="Apple Keyboard";
			
		} else if (empName.equals("sita")) {
			devicesList[0]="samsung s13";
			devicesList[1]="HP Mouse";
		}
		else {
			System.out.println("Please pass the right emp name ...emp not found " + empName);
		}

		return devicesList;
	}

	public static void main(String[] args) {

		Browser obj=new Browser();
		ArrayList<String> ramDevList=obj.getEmployeeDevices("Ram");
		System.out.println(ramDevList);//[samsung s13, HP Mouse]
		
		System.out.println("Total number of devices :"+ ramDevList.size() );
		
		
		//using static array
		String[] list=obj.getEmployeeDevice("vinayak");
		for(String e: list) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(list));//[Mac book, Apple mouse, Apple Keyboard, Airtel sim]
	}

}
