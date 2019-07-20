package week3.day1;

public class SBI implements RBI,Cibil{

	@Override
	public void cibil() {
       System.out.println("cibil");		
	}

	@Override
	public void rateOfinterest() {
       System.out.println("rate of interest");		
	}

	@Override
	public void score() {
        System.out.println("score");		
	}

}
