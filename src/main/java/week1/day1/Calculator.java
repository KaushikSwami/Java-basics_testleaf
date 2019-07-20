package week1.day1;

public class Calculator {

 
 
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(10,20);
		calc.subtract(10, 20);
		calc.multiply(10, 20);
		calc.divide(10, 20);

	}
	
	public int add(int a , int b)
	{
		int c=a+b;
		System.out.println("the sum is : " + c);
		return c;
	}
	public int subtract(int a , int b)
	{
		int c=a-b;
		System.out.println("the difference is : " + c);
		return c;
	}
	public int multiply(int a, int b)
	{
		int c=a*b;
		System.out.println("the prod is : " + c);
		return c;
	}
	public int divide(int a, int b)
	{
		int c=a/b;
		System.out.println("the div is : " + c);
		return c;
	}

}
