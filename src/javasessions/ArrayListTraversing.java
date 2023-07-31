package javasessions;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {


		ArrayList<Integer> marksList=new ArrayList<Integer>();//object created with non primitive data
		marksList.add(100);
		marksList.add(200);
		marksList.add(300);
		marksList.add(400);
		marksList.add(500);
		
		System.out.println(marksList);//[100, 200, 300, 400, 500]
		System.out.println(marksList.get(2));//300
		
		//print arraylist using loops
		
		//1. Index based 
		
		for(int i=0;i<marksList.size();i++) {
			System.out.println(marksList.get(i));
			if(marksList.get(i).equals(300)) { //always use .equals for comparison for non primitive datatypes
				System.out.println("Hi");
				break;
			}
		}
		
		System.out.println("-------------------");
		
		//2. for each loop
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		//or
		System.out.println("-------------------");
		for(int e : marksList) {
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		
		ArrayList<String> monthsList=new ArrayList<String>();//vc=10,pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		
		for(String e : monthsList) {
			System.out.println(e);
		}

		System.out.println("-------------------");
		
		ArrayList<Object> empDataList=new ArrayList<Object>();
		empDataList.add(13);
		empDataList.add(30.3);
		empDataList.add("Navya");
		empDataList.add('F');
		empDataList.add(true);
		
		for(Object e: empDataList) {
			System.out.println(e);
			if(e.equals(30.3)) {
				System.out.println("age is greater than 30");
			}
		}
		
		
	}

}
