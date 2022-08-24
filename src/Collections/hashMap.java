package Collections;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> list = new HashMap<>();
		list.put(0, "Rahul");
		list.put(1, "Shail");
		list.put(2, "Shubham");
		list.put(3,"akshay");
		list.put(4, "yash");
		list.put(5, "Saurabh");
		list.put(6,"vrushabh");
		list.put(7, "Prashant");
		list.put(8, "Ashish");
		System.out.println(list); 
		
		String value = list.get(3);
		System.out.println("value : " +value);
		
		String replace = list.replace(2,"Ash");
		System.out.println(replace);
		System.out.println(list);
		
		String remove = list.remove(5);
		System.out.println(list);
		System.out.println("size of hashmap :" + list.size());
		
		list.clone();
		System.out.println(list);
		
		
		
	
	}
}
