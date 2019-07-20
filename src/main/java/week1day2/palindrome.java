package week1day2;

public class palindrome {

	public static void main(String[] args) {

		String original ="amazon";
		String reverse="";
		int length = original.length();
		//char charAt = original.charAt(0);
		
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		//System.out.println("original is : " + original);
	//	System.out.println("reverse is : " + reverse);
		
		
		  if(original.equals(reverse)) 
		  { System.out.println("palindrome");
		  }else
		  {
		  System.out.println("not a palindrome");
		  }
		 
	}

}  



