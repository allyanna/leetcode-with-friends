package AB;

public class RomanToInteger {

	public static void main(String[] args) {
		RomanToInteger r = new RomanToInteger();
		
		int actual = r.RomanToInt("LVIII");
		int expected = 58;
		System.out.println(actual == expected);
	}

    public int RomanToInt(String s) {
        int total = 0;
        
        char prev = 'A';
        
        
        for(int i = 0; i < s.length(); i++)
        {
            
            if(s.charAt(i) == 'M') //1000
            {
                total += 1000;
                //CM this case 900
                if(prev == 'C')
                    total = total - 200;
                
            }
            else if(s.charAt(i) == 'D')
            {
                total += 500;
                //CD this case 400
                if(prev == 'C')
                    total = total - 200;
            }
            else if(s.charAt(i) == 'C')
            {
                total += 100;
                 //XC this case 90
                if(prev == 'X')
                    total = total - 20;
            }
            else if (s.charAt(i) == 'L')
            {
                total += 50;
                 //XL this case 40
                if(prev == 'X')
                    total = total - 20;
            }
            else if (s.charAt(i) == 'X')
            {
                total += 10;
                    //IX this case 9
                if(prev == 'I')
                    total = total -2;
            }
            else if (s.charAt(i) == 'V')
            {
                total += 5;
                      //IV this case 4
                if(prev == 'I')
                    total = total - 2;
            }
            else if(s.charAt(i) == 'I')
            {
                total++;
            }
            prev = s.charAt(i);
        }
        
        
        
        
        
        return total;
    }
}
