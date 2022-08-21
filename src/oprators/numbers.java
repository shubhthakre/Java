package oprators;

import java.util.Scanner;

public class numbers {

   private void task4() {

	   Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a ");
		int a = sc.nextInt();
		System.out.println("Enetr value of b");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("a is greater");
			
		}else {
			System.out.println("b is greater");
		}
}
   
   public static void main(String[] args) {
	numbers obj = new numbers();
	obj.task4();
}
}
