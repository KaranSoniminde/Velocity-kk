package programs;

public class SpacesInString {

	public static void main(String[] args) {
	    String str= " k a r a n ";
	    int spCount=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)==' ')
	    	{
	    		spCount++;
	    	}
	    
	    
	    }
	    System.out.println(spCount);
	    	

	}

}
