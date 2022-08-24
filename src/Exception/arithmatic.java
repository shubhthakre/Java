package Exception;

public class arithmatic {

	public void divide(int a, int b) {
		int res = a / b;
		System.out.println("Result came after division is: " + res);
	}

	
	public static void main(String argvs[]) {
		arithmatic obj = new arithmatic();
		obj.divide(1, 0);
	}

}
