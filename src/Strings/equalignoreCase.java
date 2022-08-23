package Strings;

public class equalignoreCase {

	public static void main(String[] args) {
		String str = "This is a test string";
		String str1 = new String("This");
		System.out.println("String for comparison -- " + str.substring(0, 4));

		System.out.println(str.substring(0, 4).equals("This"));

		System.out.println(str.substring(0, 4).equals("this"));

		System.out.println(str.substring(0, 4).equalsIgnoreCase("this"));
		System.out.println(str1.equalsIgnoreCase("this"));
	}
}
