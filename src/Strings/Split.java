package Strings;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String str = "a::b::c::d::e";
		
		String[] split = str.split("::");
		System.out.println(split);
		
		String result = Arrays.toString(split);
		System.out.println(result);
				
	}
}
