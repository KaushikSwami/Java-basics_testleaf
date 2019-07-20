package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dups {

	public static void main(String[] args) {

		/*
		 * Creating an object for List
		 */		
		List<String>obj=new ArrayList<>();
		
		/*
		 * creating an object for set
		 */		
		Set<String>obj1=new LinkedHashSet<>();
		
//		adding all the values in a list
		
		obj.add("ram");
		obj.add("jai");
		obj.add("shyam");
		obj.add("saravana");
		obj.add("kumar");
		obj.add("ram");
		obj.add("jai");
		
		/*
		 * another way of converting from one collection to another
		 * Set<String>obj1=new LinkedHashSet<>(obj);
		 */
		
//		printing all the values inside the list
		
		for (String names : obj) {
			System.out.println(names);
		}
		
		/*
		 * Converting a list into set to remove all the duplicates,Set will not allow
		 * duplicates
		 */
		
		obj1.addAll(obj);
		
		System.out.println("*****************************************************");
		
//		printing the values in the set
		
		
		for (String names : obj1) {
			System.out.println(names);
		}
		
		/*
		 * to find the count of the duplicates in the list
		 */		
		int sizeOfList = obj.size();
		int sizeOfSet = obj1.size();
		int count=sizeOfList-sizeOfSet;
		
		System.out.println("duplicates are : " + count);
		
		
		
	}

}
