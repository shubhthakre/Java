package oprators;

import java.util.Scanner;

//Program to equal operator and not equal operators

public class equal {

	private void task3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a ");
		int a = sc.nextInt();
		System.out.println("Enetr value of b");
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("values are eqaul");
		}else {
			System.out.println("values are not equal");
		}
		
	}
	
	public static void main(String[] args) {
		equal obj = new equal();
		obj.task3();
	}
}
