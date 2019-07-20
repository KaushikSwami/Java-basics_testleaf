package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EampleOfSet {

	public static void main(String[] args) {

		List<String>friends=new ArrayList<>();
		friends.add("sudharsan");
		friends.add("pradheep");
		friends.add("prasanth");
		
		Set <String>set_obj=new HashSet<>(friends);
		
		//set_obj.addAll(friends);
		
		System.out.println("the set is : " + set_obj);
	}

}
