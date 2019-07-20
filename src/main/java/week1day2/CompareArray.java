package week1day2;

public class CompareArray {

	public static void main(String[] args) {

		String[] name1= {"venkatesh","ram","bala","somu"};
		String[] name2= {"gopi","balu","dinesh","bala","venkatesh","ram"};
		
		int length = name1.length;
		int length2 = name2.length;
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length2;j++)
			{
				if(name1[i].equals(name2[j])){
					System.out.println(name1[i]);
					
				}
			}
		}
	}

}
