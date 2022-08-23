package inheritance;



public class department extends student {
	
String dept;
	
	public void s_dept() 
	{
		System.out.println("Enter Department :");
		dept = sc.next();
		System.out.println("Student Name" + s_name);
		System.out.println("Roll No:" + Rollno);
		System.out.println("Department :" + dept);

	}
	
	public static void main(String[] args) {
		department obj = new department();
		obj.S_detail();
		obj.s_dept();
		obj.c_detail();
	}


}
