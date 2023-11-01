package AB;

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		
		boolean actual = pn.IsPalindrome(121);
		boolean expected = true;
		
		System.out.println(actual);
		System.out.println(expected);
		
	}

	   public boolean IsPalindrome(int x) {
	        
	        if(x < 0)
	            return false;
	            
	        String num = Integer.toString(x);
	        
	        int numLoop = 0;
	        
	        for(int i = 0; i < num.length()/2; i++)
	        {
	            //check if the item at that position is the same
	            //num[i]
	            if(num.charAt(i) != num.charAt(num.length() - 1 -i))
	                return false;
	            
	        }
	        
	    return true;
	        
	    }
}
