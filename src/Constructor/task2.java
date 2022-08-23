package Constructor;

public class task2 {

	
	public task2(int a, String b) {
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		 task2 obj = new task2(1, "this is parametrized constructor");
	}
}
