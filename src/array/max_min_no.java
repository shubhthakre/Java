package array;

public class max_min_no {

	static int getMin(int arr[], int n) {
		int res = arr[0];
		for (int i = 1; i < n; i++)
			res = Math.min(res, arr[i]);
		return res;
	}

	static int getMax(int arr[], int n) {
		int res = arr[0];
		for (int i = 1; i < n; i++)
			res = Math.max(res, arr[i]);
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 1234, 45, 67, 1 };
		int n = arr.length;
		System.out.println("Minimum element of array: " + getMin(arr, n));
		System.out.println("Maximum element of array: " + getMax(arr, n));
	}
}
