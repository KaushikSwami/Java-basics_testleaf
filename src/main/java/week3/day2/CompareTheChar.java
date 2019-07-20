package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class CompareTheChar {

	public static void main(String[] args) {

		String name="amazon";
		
		char[] charArray = name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		for (char c : charArray) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
			
			
			
			
			
		
			
			
		}
		System.out.println(map);
		
		
	}

}
