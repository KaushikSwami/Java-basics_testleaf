package demo;

public class Demo {

	public static void main(String[] args) {
		
		int[] num= {5,4,1,6};
		int length = num.length;
		int total=0;
		System.out.println(length);
		
		for(int i=0;i<length;i++)
		{
			total=total+num[i];
		}
		System.out.println(total);

	}



}
