package array;

//1.Write a function to add integer values of an array
//2. Write a function to calculate the average value of an array of integers

public class sum {

	int arr[] = {12,3,4,15};
	public int task() {

		int sum = 0;
		int length = arr.length;
		for(int i=0;i<length;i++) {
			sum = sum + arr[i];
		
		}
		System.out.println("sum :" + sum);
		int average = sum/length;
		System.out.println("average :"+ average);		
		return sum;
		
	}
	
	public static void main(String[] args) {
		sum obj = new sum();
		obj.task();
	}
}
