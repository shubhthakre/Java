package Strings;

public class str_matches {
	 public static void main(String args[]) {
	      String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)Tutorials(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Tutorials"));
	 }

}
