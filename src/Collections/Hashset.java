package Collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("six");
		set.add("seven");
		set.add("eight");
		set.add("nine");
		set.add("ten");

		System.out.println(set);
		
		set.remove("ten");
		System.out.println(set);
		
		set.add("rahul");
		System.out.println(set);
		
		int size = set.size();
		System.out.println("Size of hashset :" + size);
	}
}
