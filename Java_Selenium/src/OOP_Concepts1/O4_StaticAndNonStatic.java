package OOP_Concepts1;

public class O4_StaticAndNonStatic {
	
	//global variables: the scope of global variables will be available across all the function with some conditions
	
	String name = "John"; //non static global variable
	static int age = 30; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to call static methods and vars?
		//direct calling;
		
		sum();
		
		//calling by classname;
		O4_StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(O4_StaticAndNonStatic.age);
		
		//how to call non static methods and vars:
		O4_StaticAndNonStatic obj1 = new O4_StaticAndNonStatic();
		obj1.sendMail();
		System.out.println(obj1.name);
		
		//can I access static methods by using object reference? yes
		obj1.sum(); //warning will be given - no point in creating object and calling static method. we can call static method directly.
		
		
		

	}
	
	public void sendMail( ) { //non static method
		
		System.out.println("Send mail method");
		
	}
	
	public static void sum() {  //static method
		System.out.println("Sum method");
	}

}
