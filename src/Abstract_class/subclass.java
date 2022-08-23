package Abstract_class;

public class subclass extends task {

	String name = "shubham";
	int age = 24;
	
	
	
	public static void main(String[] args) {
		subclass obj = new subclass();
		obj.test1();
		obj.display();
	}



	@Override
	void display() {

		System.out.println("My name is :" + name);
		System.out.println("i am " + age +" "+ "year old");
		
	}
	

}
