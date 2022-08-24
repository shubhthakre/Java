package Exception;

public class StringIndexBound {

	public static void main(String[] args) {
		try {
			String str = "includehelp";

			System.out.println("Char: " + str.charAt(str.length()));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		}

		System.out.println("Program finished");
	}
}
