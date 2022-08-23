package Access_modifier;

public class privatee {

	private void task() {

		System.out.println("This is private method");

	}
	
	

	public static void main(String[] args) {

		privatee obj = new privatee();
		obj.task();
	}
}
