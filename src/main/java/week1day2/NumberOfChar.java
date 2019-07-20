package week1day2;

public class NumberOfChar {

	public static void main(String[] args) {

		String name="amaaazaaon";
		int count=0;
		
		char[] charArray = name.toCharArray();
		
		for (char c : charArray) {
			if(c =='a')
			{
				count=count+1;
			}
			
		}
		System.out.println(count);
		
	}

}
