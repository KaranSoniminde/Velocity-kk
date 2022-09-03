package programs;

public class ReverseString {

	public static void main(String[] args) {
		 
		String s="Karan";
		String rev="";
		 int leng =s.length();
		 for(int i=leng-1;i>=0;i--)
		 {
			 rev=rev+s.charAt(i);
			 
		 }
		 System.out.println(rev);
	}

}
