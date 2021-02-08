package Pkg1;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringBuffer sb = new StringBuffer("Hello");  //Hello All Welcome to Java
		
		System.out.println(sb);
		
		sb.append(" Java");
		
		System.out.println(sb);
		
		//sb.reverse();
		//System.out.println(sb);
		
		sb.insert(6, "All Welcome to ");
		System.out.println(sb);
		

	}

}
