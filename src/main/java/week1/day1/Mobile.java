package week1.day1;

public class Mobile {

	//String make;
	public static void main(String[] args) {

		Mobile m=new Mobile();
		String make =m.brand("samsung");
		System.out.println(make);
	}
	
	public String brand(String model)
	{
		//System.out.println(make);
		
		return "A7";
	}

}
