package week1day2;

public class occuranceSpecChar {

	public static void main(String[] args) {

      String name ="testleaf";
      
          char[] charArray = name.toCharArray();
          
          for (char c : charArray) {
			
        	  if(c=='f')
        	  {
        		  System.out.println(c);
        	  }
		}
	}

}
