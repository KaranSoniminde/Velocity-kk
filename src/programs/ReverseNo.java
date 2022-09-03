package programs;

public class ReverseNo {
	
	public static void main(String[] args) {
		
		int n=12345,rem,rev=0;
		
		while(n!=0)
		{
			rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;
		
	}
		System.out.println(rev);
         
}
}