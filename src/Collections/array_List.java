package Collections;

import java.util.ArrayList;

public class array_List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Prashant");
		list.add("Saurabh");
		list.add("vrushabh");
		list.add("Sahil");
		list.add("Ashish");
		list.add("yash");
		list.add("Shubham");
		list.add("Akshay");
		System.out.println(list);

		list.add(3, "Steve");
		System.out.println(list);

		list.remove("Steve");
		System.out.println(list);

		String obj = list.get(5);
		System.out.println(obj);
		
		// iterarting
				for (String str : list) {
					System.out.println(str);
			}


		int size = list.size();
		System.out.println(size);
		
		boolean remove = list.removeAll(list);
		System.out.println(list);
				
		
	}
}
