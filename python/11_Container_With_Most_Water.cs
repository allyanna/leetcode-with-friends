public class Solution {
    public int MaxArea(int[] height) {

        int left = 0;
        int right = height.Length - 1;
        int result = 0; 

        while(left < right){
            int area = (Math.Min(height[left], height[right])) * (right - left);
            result = Math.Max(area, result);
            
            if(height[left] < height[right])
            {
                left++;
            }
            else {
                right--; 
            }
        }
        return result; 
        
    }
}