package oprators;

import java.util.Scanner;

// Write a method for increment and decrement operators(++, --)

public class increment_decrement {

	private void task2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
				
		if(a<=5) {
			count++;
		}else {
			count--;
		}
		
		System.out.println("count ="+count);

	}
	
	public static void main(String[] args) {
		increment_decrement obj = new increment_decrement();
		obj.task2();
	}
}
