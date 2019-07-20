package week1day2;

public class Replace {

	public static void main(String[] args) {

		String name="12345 good $$$$";
		//String replaceAll = name.replaceAll("[^A-Za-z]", "");
		String replaceAll = name.replaceAll("[$]", "");

		System.out.println(replaceAll);
	}

}
