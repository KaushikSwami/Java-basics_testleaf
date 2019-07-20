package demo;

public class String_ToChar {

	public static void main(String[] args) {


		String name="venkatesh";
		char[] charArray = name.toCharArray();
		int length = charArray.length;
		
		int count=0;
		
		for(int i=0;i<length;i++)
		{
			if(charArray[i]=='e')
			{
				count=count+1;
				System.out.println(charArray[i] + " is " + count);
			}
		}
		
	}

}
