package array;

import java.util.Arrays;

//Write a function to copy an array to another array

public class copy {


	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		//copying one array to another
		for(int i=0;i<a.length;++i){
		b[i]=a[i];
		}
		//printing array
		for(int i=0;i<b.length;++i){
		System.out.print(b[i]+" ");
		}
	}
}
