package OOP_Concepts1;

public class O3_MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		O3_MethodOverLoading obj = new O3_MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20, "john");
		

	}
	
	//you cannot create a method inside a method
	//duplicate methods - same method name wit same number of arguments are not allowed
	//we  can overload main method also.
	
	//method overloading when the method name is same with different arguments or input parameters within the same class.
	
	public static void main(int p) {
		
	}
	
	public static void main (int p, int q) {
		
	}
	
	public void sum() { //0 input parameters
		System.out.println("SUM method - zero param");
	}
	
	public void sum(double d) {
		System.out.println("SUM method -- 1 input param but different data type");
		
	}
	
	
	public void sum(int x) { //1 input parameter
		System.out.println("SUM method --1 input param");
		System.out.println(x);
	}
	
	public void sum(int y, String name) { //2 input parameters
		
		System.out.println("SUM method --2 input parameters");
		System.out.println(y +" " +name);
		
	}
	

}
