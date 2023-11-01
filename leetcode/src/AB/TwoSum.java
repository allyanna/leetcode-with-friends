package AB;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum  tSum = new TwoSum();
		
	int[] actual = tSum.twoSum(new int[]{2, 7, 11, 15},9);
	int[] expected = new int[] {0,1};
	Arrays.sort(actual);
	Arrays.sort(expected);
	
	 for (int i = 0; i < expected.length; i++)
         if (actual[i] != expected[i]) {
             System.out.println("incorrect");
             return;
         }
	 			
	 System.out.print("correct");
	}

	public int[] twoSum(int[] nums, int target) {

		int[] items = new int[2];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			// target - num,index
			if (map.containsKey(nums[i]) && nums[map.get(nums[i])] + nums[i] == target) {
				items[0] = i;
				items[1] = map.get(nums[i]);
				return items;
			} else {
				System.out.println((target - nums[i] + " " + i));
				map.put(target - nums[i], i);
			}
		}
		return items;
	}
}
