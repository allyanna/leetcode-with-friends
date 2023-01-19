
public class Solution {
    public int LongestConsecutive(int[] nums) {

        HashSet<int> setOfNums = new HashSet<int>(nums);
        int longestSoFar = 0;

        foreach(int x in setOfNums) 
        {
            if(!setOfNums.Contains(x-1)){
                int len = 0;
                while(setOfNums.Contains(x + len))
                    len++;
                longestSoFar = Math.Max(longestSoFar, len);
            }
        }
        return longestSoFar; 
    }
}