package inheritance;

import java.util.Scanner;

public class student extends college {
	
	String s_name;
	int Rollno;
	Scanner sc = new Scanner(System.in);
	
	public void S_detail()
	{
		System.out.println("Enter Student Name " );
		s_name = sc.next();
		System.out.println("Enter Roll no.");
		Rollno = sc.nextInt();
	}
	
	@Override
	public void c_detail() {
		// TODO Auto-generated method stub
		super.c_detail();
	}

}
