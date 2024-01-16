public class Solution {
    public void Rotate(int[] nums, int k) {
        k = k % nums.Length; 
        if(k < 0) {
            k+= nums.Length; 
        }

        reverse(nums, 0, nums.Length - k - 1); 
        reverse(nums, nums.Length - k, nums.Length - 1);
        reverse(nums, 0, nums.Length - 1);
    }

    public void reverse(int [] nums, int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
    }
}
