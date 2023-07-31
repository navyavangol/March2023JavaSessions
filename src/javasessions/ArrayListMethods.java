package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>(20);// vc=20,pc=0 -- here we changed the virtual capacity by
															// default 10 to 20

		ArrayList<Integer> marksList = new ArrayList<Integer>(5);
		marksList.add(1);
		marksList.add(2);
		marksList.add(3);
		marksList.add(4);

		marksList.remove(1);
		System.out.println(marksList);// [1, 3, 4]
		// if we want ot remove the number 2 not in the index 1 - remove method always
		// by default remove on index basis
		marksList.remove((Object) 3);
		System.out.println(marksList);// [1,4]
		
		//Array Literals
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome","firefox","edge","safari"));
		System.out.println(browserList);//[chrome, firefox, edge, safari]
		System.out.println(browserList.size());//4
		System.out.println(browserList.get(0));//chrome
		for(String e : browserList) {
			System.out.println(e);
		}
		
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("tom","peter","zoe","bye"));
		//print in reverese order
		System.out.println(empList);//[tom, peter, zoe, bye] - normal list
//		Collections.reverse(empList);//reveresed
//		System.out.println(empList);//[bye, zoe, peter, tom] - reverses list
//		
//		for(String e: empList) {
//			System.out.println(e);
//		}
		
		for(int i=empList.size()-1;i>=0;i--) {
			System.out.println(empList.get(i));
		}

		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,20,30,44,60,89));
		System.out.println(list);//[10, 20, 30, 44, 60, 89]
		Collections.reverse(list);
		System.out.println(list);//[89, 60, 44, 30, 20, 10]
		
		///convert static array to dynamic array
		int num[]= {1,2,4,3,6,4,3,9};
		List<int[]> numberList=Arrays.asList(num);
		System.out.println(numberList.size());//1 -- for integer static array it is giving size is 1
		
		Integer num1[]= {1,2,4,3,6,4,3,9};
		List<Integer> numberList1=Arrays.asList(num1);
		System.out.println(numberList1.size());//8 -- while passing in the list have to mention non primitive type i.e Integer then will give the right output
		
		String browser[]= {"chrome","firefox","edge","safari"};
		
		List<String> browserNamesList=Arrays.asList(browser);
		System.out.println(browserNamesList.size());//4
		
		//Another way of writing Arraylist
		
		ArrayList<String> proList=new ArrayList<String>() {
			{
				add("java");
				add("python");
			}
			
			
		};
		
		System.out.println(proList.size());//2
		proList.add("c#");
		System.out.println(proList.size());//3
		
		
		//List is an Interface
		//Inmutable list Example
		List<Integer> newList=List.of(1,2,3,4);// List.of means size is fixed we cannot be change/or we cannot add in to the list/or cannot be remove the value
		System.out.println(newList);//[1,2,3,4]
		
		System.out.println(newList.size());//4
//		newList.add(5);
//		System.out.println(newList.size());//Error - UnsupportedOperationException
//		newList.remove(1);
//		System.out.println(newList.size());//Error - UnsupportedOperationException
		
		ArrayList<String> monthsList=new ArrayList<String>();//vc=10,pc=0
		monthsList.add("JAN");
		monthsList.add("FEB");
		monthsList.add("Mar");
		monthsList.add("April");
		monthsList.add("May");
		monthsList.add("June");
		//vc=4,pc=6
		
		monthsList.trimToSize();//it will change the virtual capacity to the current physical capacity
		//vc=6,pc=6
		//vc=6/2=3
		
		monthsList.add(0,"Month");
		monthsList.add("July");
//		monthsList.add(10,"July");//IOB exception
		System.out.println(monthsList);//[Month, JAN, FEB, Mar, April, May, June, July]
		
		//swap two values in a list using collections class
		Collections.swap(monthsList, 0, 1);
		System.out.println(monthsList);//[JAN, Month, FEB, Mar, April, May, June, July]
		
		Collections.reverse(monthsList);
		System.out.println(monthsList);//[July, June, May, April, Mar, FEB, Month, JAN]
		
		List<Object> ls=Collections.emptyList();
		System.out.println(ls.size());//0
		System.out.println(ls);//[]
		
		Collections.sort(monthsList);
		System.out.println(monthsList);//[April, FEB, JAN, July, June, Mar, May, Month]
		
		//create a number list {1,4,5,2,6,87,5,487,87}
		//print in sorting order -- asc order
		//print in sorting --desc order
		
		ArrayList<Integer> numlist=new ArrayList<Integer>(Arrays.asList(1,4,5,2,6,87,5,487,87));
		
		Collections.sort(numlist);
		System.out.println(numlist);//[1, 2, 4, 5, 5, 6, 87, 87, 487]
		Collections.reverse(numlist);
		System.out.println(numlist);//[487, 87, 87, 6, 5, 5, 4, 2, 1]
		
		//add value in the middle of the array list
		//mid=size()/2
		
		ArrayList<Integer> midlist=new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,2,6,4,8));
		int midvalue=midlist.size()/2;
		midlist.add(midvalue, 10);
		System.out.println(midlist);//[1, 3, 5, 7, 10, 9, 2, 6, 4, 8]
		
		//Static array or dynamic array where memory allocation is continues
		
		
		//Hashmap,set objects etc... where values stored not in contionus memory allocation in java
		//Array list is an dynamic array, where we can add n number of values and can remove from the array also,and default virtual capacity defined as 10 
		//ArrayList ar=new ArrayList();- when we write this the current size is 0
		
		//if we want to replace any value in the arraylist 
		
		midlist.set(0, 4);
		
		
		
		
		}
		
	}


