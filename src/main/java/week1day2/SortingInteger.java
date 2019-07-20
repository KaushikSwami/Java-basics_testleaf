package week1day2;


/*
step 1 : create an array 
step 2 : get the length of the array
step 3 : use for inside for to compare the values
step 4 : use an if condition to check num[i] is greater tahn num[j]
*/

public class SortingInteger {

	public static void main(String[] args) {

		int[] num= {10,12,11,14,18};
		
		int length = num.length;
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(num[i]<num[j])
				{
					System.out.println(num[i]);
					break;
				}
			}
		}
		
	}

}
