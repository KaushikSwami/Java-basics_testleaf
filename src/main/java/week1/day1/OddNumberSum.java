package week1.day1;

public class OddNumberSum {
	
	public static void main(String[] args) {

		
		int sum=0;
		for (int i=1;i<=100;i++)
		{
			if(i%2 !=0)
			{
				sum=sum+i;
				//System.out.println(sum);
				
			}
			System.out.println(sum);
		}
		//System.out.println("the sum of odd numbers from 1 to 100 is " + sum);
	}

}
