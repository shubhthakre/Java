package Strings;

public class StartWithEndWith {

	public static void main(String[] args) {
		  String str = "This is a test string";
		  
		  System.out.println(str.startsWith("This"));

		  System.out.println(str.startsWith("test", 10));
		  

		  System.out.println(str.endsWith("test"));

		  System.out.println(str.endsWith("test string"));

		  System.out.println(str.endsWith("string")); 
		 }
}
