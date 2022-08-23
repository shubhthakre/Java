package ThisSuper;

public class studentr {

	int rollno;
	String name;
	float fee;

	void m() {
		System.out.println("hello i am admin ");
		this.detail();
	}
	
	void detail() {
		System.out.println("Following are the student information ");
	}

	public studentr(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		this.m();
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String args[]) {
		studentr s1 = new studentr(87, "shubh", 50000f);

		studentr s2 = new studentr(112, "sumit", 6000f);

		s1.display();
		s2.display();
		

	}
}