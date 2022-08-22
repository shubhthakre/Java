package Static;

public class Static {

	// Static variable
	static int a = 10;
	static int b = 20;

	// instance variable
	public int c = 30;
	public int d = 40;

	// Static method
	public static void task1() {
		System.out.println("we cannot access the instace varaible on static method ");
	}

	public static void task2() {

	}

	// instance method
	public void task3() {

		System.out.println(a);

	}

	public void task4() {
		System.out.println(b);

	}

	public static void main(String[] args) {
		Static obj = new Static();
		task1();
		obj.task3();
		obj.task4();
		

	}

}
