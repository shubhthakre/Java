package array;

import java.util.Arrays;

public class add_index {

	 private static int[] insert(int[] a, int key, int index)
	    {
	        int[] result = new int[a.length + 1];
	 
	        System.arraycopy(a, 0, result, 0, index);
	        result[index] = key;
	        System.arraycopy(a, index, result, index + 1, a.length - index);
	 
	        return result;
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] a = { 1, 2, 4, 5 };
	        int key =  3;
	        int index = 2;
	 
	        a = insert(a, key, index);
	        System.out.println(Arrays.toString(a));
	    }
}
