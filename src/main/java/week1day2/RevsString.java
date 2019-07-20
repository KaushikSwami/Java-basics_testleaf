package week1day2;


/* Algoritm

step 1 : initialize a String in a variable as "testleaf"
step 2 : declare an empty string revs
step 3 : get the length of the "name" variable and store it in a variable 
step 4 : construct a for loop
         for(int i=length-1;i>=0;i--) 
         why length-1 ?
         the array starts at 0 the highest index is the amount of elements - 1 ==> .length() -1
         ex : "t e s t l e a f"
        	   0 1 2 3 4 5 6 7
         name.length will o/p as 8 and the index will end at 7 (last char)
step 5 : inside the loop adding the empty revs and calling the charAt(i) method with the iterative parameter i
         The Java String charAt(int index) method returns the character at the specified index in a string.
step 6 : if condition with .equals (revs.equals(name))  */


public class RevsString {

	public static void main(String[] args) {

		String name="testleaf";
		String revs="";
		int length = name.length();
		System.out.println("the length is : " + length);

		for(int i=length-1;i>=0;i--)
		{
			revs=revs+name.charAt(i);
		}
		System.out.println("the original is : " + name);
		System.out.println("the reverse is : " + revs);
		
		if(revs.equals(name))
		{
			System.out.println("it is a plaindrome");
		}else
		{
			System.out.println("not a palindrome");
		}
		
	}

}


