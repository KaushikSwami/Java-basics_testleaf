package week1.day1;

public class PrimeNumbers {

	
	public static void main(String[] args) {

		int i;
		for(i=1;i<=100;i++)
		{
			if((i%i==0) && (i%1==i))
			{
				System.out.println("the prime number within 100 are " + i);
			}
		}
		
	}

}
