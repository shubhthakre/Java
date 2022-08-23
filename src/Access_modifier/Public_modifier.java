package Access_modifier;

public class Public_modifier {
	
//public is accessible in all the classes in project 
	//but you need to import package also
	public void task() {

		System.out.println("This is publiv method");

	}
	
	public static void main(String[] args) {
		Public_modifier obj = new Public_modifier();
		obj.task();
	}

}
