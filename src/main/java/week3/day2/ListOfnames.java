package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListOfnames {

	public static void main(String[] args) {
		List<String> obj=new ArrayList();
		obj.add("ram");
		obj.add("jai");
		obj.add("shyam");
		obj.add("saravana");
		obj.add("kumar");

		int size = obj.size();
		System.out.println(size);
		
		for (String names : obj) {
			
			if((names.startsWith("s"))||(names.startsWith("j")))
			{
				System.out.println(names);
			}
		}
		
		
		
		



	}

}
