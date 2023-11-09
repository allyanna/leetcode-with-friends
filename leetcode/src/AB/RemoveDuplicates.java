package AB;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates r = new RemoveDuplicates();
		
		int expected = 5;
		System.out.println(expected == r.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
	}
	
	public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if(!set.contains(nums[i])){
             set.add(nums[i]);
             nums[index] = nums[i];
             index++; 
            }
               

        } 

        return set.size();
    }

}
