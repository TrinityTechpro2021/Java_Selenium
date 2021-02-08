package OOP_Concepts1;

public class O1_FunctionsInJava {
	
	//main method is starting point of execution

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		O1_FunctionsInJava obj = new O1_FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
		
		obj.test();
		int a1 = obj.pqr();
		System.out.println(a1);
		
		String str = obj.qa();
		System.out.println(str);
		
		int div1 = obj.division(20, 10);
		System.out.println(div1);
		
		
		//main method is void it never returns a value
	}
	
	//non static methods
	
	
	//void - does not return any value
	//return type is void
	public void test() {    //no input, no output
		System.out.println("test method");
	}
	
	
	//return type is int
	public int pqr() {  //no input, some output
		System.out.println("PQR method");
		int a  = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
	
	//return type is String
	public String qa() {  //no input and some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	//x, y --> input parameters/arguments
	//return type is int
	public int division(int x, int y) {  //
		System.out.println("division method");
		int d = x/y;
		return d;
		
		
		
	}
	

}
