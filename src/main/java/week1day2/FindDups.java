package week1day2;

public class FindDups {

	public static void main(String[] args) {
	int [] values= {10,20,30,10,40};
	int length = values.length;
	
	
	
for(int i=0;i<length;i++) 
{
	for (int j=i+1;j<length;j++)
		{
			if(values[i]==values[j])
			{
				System.out.println(values[i]);
			}
		}
	}
	
}
}
