package AB;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		LongestCommonPrefix l = new LongestCommonPrefix();
		
		String[] strs = new String[] {"flower","flow","flight"};

		String expected = "fl";
		
		System.out.println(expected.equals(l.longestCommonPrefix(strs)));
	}

	public String longestCommonPrefix(String[] strs) {
        String[] broken = new String[strs[0].length()];

        for(int i = 1; i <= strs[0].length(); i++){
            broken[i-1] = strs[0].substring(0,i);
        }

        for(int i = broken.length-1; i >= 0; i--)
        {
            boolean isAllSame = false;
            for(int j = 0; j < strs.length; j++)
            {

                if(strs[j].startsWith(broken[i]))
                {
                    if(j == strs.length-1)
                    {
                        return broken[i];
                    }
                }
                else
                {
                    break;
                }
            }
        }

    return "";
    }
}
