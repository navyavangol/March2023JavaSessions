package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList class --default virtual capacity is 10 -- we can add all different kinds of datatype values
		//In normal array we use length where as in arraylist use size 
		
		//Dynamic array
		//create the object of ArrayList class
		
		ArrayList ar=new ArrayList();//ArrayList is a raw type means store any type of data
		//Array list is a index based/order based  array
		
		System.out.println(ar.size());//0 - the physical capacity=0
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());//3 -- where as in normal array we use length keyword
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());//5
		
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());//7
		
		ar.add("navya");
		ar.add(19.3);
		System.out.println(ar.size());//9
		System.out.println(ar.get(0));//100
		
		System.out.println(ar.get(8));//19.3
		//System.out.println(ar.get(-1));//IOB(Index out of bound exception) exception
//		System.out.println(ar.get(9));//IOB exception
		
		//default value of virtual capacity is 10 and physical capacity is zero(0)
		
		//restrict the arraylist :Generics is AL - Arraylist is non-primitive data
		//integer data  :arraylist
		
		ArrayList<Integer> marksList=new ArrayList<Integer>();//vc=10,pc=0
		marksList.add(100);
		marksList.add(80);
		
		ArrayList<Double> bmiList=new ArrayList<Double>();
		bmiList.add(100.3);
		bmiList.add(20.9);
		
		//int -->Integer
		//double -->Double
		
		//different types of data in arraylist
		ArrayList<Object> empDataList=new ArrayList<Object>();
		empDataList.add(13);
		empDataList.add(30.3);
		empDataList.add("Navya");
		empDataList.add('F');
		empDataList.add(true);
		
		System.out.println(empDataList);//[13, 30.3, Navya, F, true]
		
		ArrayList<String> monthsList=new ArrayList<String>();//vc=10,pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		
		
		
		
		
				

	}

}
