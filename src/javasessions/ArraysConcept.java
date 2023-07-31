package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {


		int i=10;
		i=20;
		i=30;
		
		System.out.println(i);//30
		
		//If we want to store multiple values in a single variable use arrays
		
		//Static array - size is fixed,store only similar type of data
		// In java not allowed to use negative index
		
		//1. int array
		int k[]=new int[4];
		//lowest-index of this array=0
		//highest index = 3
		//length of this array is 4
		//range : 0 to 3
		
		//k[-1]=60;//this will give ArrayIndexOutOfBounds Exception - this is an runtime error
		//complile error means syntax error
		k[0]=10;
		k[1]=20;
		k[2]=30;
		k[3]=40;
		//k[4]=50;//ArrayIndexOutOfBounds Exception- when array size is going beyond the size
		
		System.out.println(k[0]);//10
		System.out.println(k[3]);//40
		
		//System.out.println(k[4]);//ArrayIndexOutOfBounds Exception
		
		//2. Double array
		double d[]=new double[2];
		d[0]=1.1;
		d[1]=3.2;
		
		//3. Char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		//4. String array
		String browsers[]=new String[3];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="edge";
		
		System.out.println(browsers[0]);
		
		

	}

}
