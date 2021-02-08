package Pkg1;

//import static Pkg1.java_Concepts.Amount1;

public class java_Concepts2  extends java_Concepts {   
	
	public static void main (String[] args) { 
	
	
	String Name1 = "Mohan";
	String Name2 = "mohan";
	
	String Name3 = "Ram";
	String Name4 = "Ram";
	
	String Name5 = "apple";
	String Name6 = "Xat";
	
	String Name7 = Name5.concat(Name6);
	
	String Name8 = Name5 +", "+Name6;
	
	System.out.println(Name5.indexOf("le"));
	
	String Name9 = Name5.substring(3);//Name8.substring(0, 5);
	System.out.println(Name9);
	
	
	//char particularAlphabet = Name1.charAt(0);
	/* System.out.println("When values are not same " +Name1.compareTo(Name2));
	System.out.println("When values are same " +Name3.compareTo(Name3));
	
	System.out.println("When values are same " +Name5.compareTo(Name6));
	*/
	
	//System.out.println(Name5.substring(0, 3));
	
	/*
	char[] CharArray = Name1.toCharArray();
	
	for(int i = 0; i <= CharArray.length-1; i++ ) {
		System.out.println(CharArray[i]);
	} 
     */
	
	
	}
	


}
