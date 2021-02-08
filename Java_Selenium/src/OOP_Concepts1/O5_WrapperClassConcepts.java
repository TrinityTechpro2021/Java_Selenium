package OOP_Concepts1;

public class O5_WrapperClassConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		
		
		//data conversion: String to int;
		int i = Integer.parseInt(x);
		
		System.out.println(i+20);
		
		//Integer, Double, Character, Boolean.
		
		//String to double conversion;
		String y = "12.33";
		double d = Double.parseDouble(y);
		
		System.out.println(d+10);
		
		//String to boolean;
		String k = "true";
		boolean a = Boolean.parseBoolean(k);
		System.out.println(a);
		
		//int to String conversion;
		int t = 200;
		String s = String.valueOf(t);
		System.out.println(s+20);
		
		
		//NumberformatException
		String u = "100A";
		int e = Integer.parseInt(u); 
		

	}

}
