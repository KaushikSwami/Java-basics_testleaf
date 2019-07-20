package demo;

import java.util.ArrayList;
import java.util.List;

public class exampleForList {

	public static void main(String[] args) {

		/*
		 * Syntax for creating a list as below .
		 * String is the gereric that is used in
		 * this program
		 */
		
		List<String>friends=new ArrayList<>();
		
//		.add() will add all the String into the list
		
		friends.add("sudharsan");
		friends.add("pradheep");
		friends.add("prasanth");
		
		System.out.println(friends);
	}

}
