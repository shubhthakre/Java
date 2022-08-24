package Exception;

public class handleArthmatic {

	public void divide(int a, int b) {

		try {
			int res = a / b;
			System.out.println("Division process has been done successfully.");
			System.out.println("Result came after division is: " + res);
		} catch (java.lang.ArithmeticException ex) {
			System.out.println("Should avoid dividing by 0 " + ex);
		}

	}

	public static void main(String[] args) {
		handleArthmatic obj = new handleArthmatic();
		obj.divide(1, 0);
	}
}
