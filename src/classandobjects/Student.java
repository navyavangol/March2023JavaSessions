package classandobjects;

public class Student {

	// class variables/ template variables

	String name;
	int marks;
	String grade;

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name="anu";
		s1.marks=99;
		s1.grade="A++";
		
		Student s2 = new Student();
		s2.name="abhi";
		s2.marks=90;
		s2.grade="A+";
		
		Student s3 = new Student();
		s3.name="john";
		s3.marks=80;
		s3.grade="B";
		
		System.out.println(s1.name + " "+s1.marks+" "+s1.grade);
		System.out.println(s2.name + " " + s2.marks + " " + s2.grade);
		System.out.println(s3.name + " " + s3.marks + " " + s3.grade);

		System.out.println(s1);//classandobjects.Student@3fee733d -- while printing always give objectreference.variablename
		
		//objects will create in Heap memory and object reference name will store in stack memory
		
		//no ref object:
		new Student().name = "Aman";
		new Student().marks = 80;
		new Student();
		
		//just the ref name:
		Student s4;
		s4 = new Student();
		s4.name = "Naveen";
		
		
		//Null Reference Object
		Student s5 = new Student();
		s5 = null;
		
		s5.name = "Peter";//NPE(Null Pointer Exception)
		System.out.println(s5.name);
		
		System.gc(); //Instruction will be given to remove objects with have no reference and null reference
		
		
		
		
		
	}

}
