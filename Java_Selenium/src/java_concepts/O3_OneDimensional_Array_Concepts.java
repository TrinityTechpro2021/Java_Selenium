package java_concepts;

public class O3_OneDimensional_Array_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array: to store similar data type values in a array variable
		//disadvantages of array:
		//1. size is fixed  -- static array -- to overcome this problem -- we use collections - ArrayList, HashTable -- Dynamic array
		//2. stores similar datatypes -- to overcome of this problem, we use Object Array.
		
		//1. int array;
		//lowest bound index = 0
		//highest bound index = n - 1 (n is size of array)
		
		int i[] = new int[3];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		//i[3] = 40;
		
		//System.out.println(i[4]);
		
		//System.out.println(i.length);  //length of an array
		
		
		//print all values of array
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		//2. double array;
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 14.13;
		
		System.out.println(d[0]);
		
		//3. char array;
		char c[] = new char[3];
		
		c[0] = '$';
		c[1] = 'q';
		c[2] = 2;
		System.out.println(c[0]);
		
		//4. boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		
		
		//5. String array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "world";
		
		System.out.println(s.length);
		
		//6. Object Array: (Object is a class(super class)) -- is used to store different data types values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.23;
		ob[3] = "1/1/1990";
		ob[4] = 'N';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		

	}

}
