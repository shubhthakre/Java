package overloading;



public class multiple_method {

	public void task() {

		int rollno = 74;
		System.out.println("Roll no :" + rollno) ;
	}
	
	public void task(String name) {
	
		System.out.println("name :" +name);
	}
	

	public void task(float fees) {
	
		System.out.println("fees :" + fees);
	}
	
	public void task(int a,String address) {
		
		System.out.println("pincode :" + a);
		System.out.println("address :" + address);
	}

	public static void main(String[] args) {
		multiple_method obj = new  multiple_method();
		obj.task();
		obj.task("Shubham");
		obj.task(5000f);
		obj.task(441108,"Butibori");
	}
	

}
