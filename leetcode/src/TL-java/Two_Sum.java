package Tl;

import java.util.HashMap;

//Link: https://leetcode.com/problems/two-sum/description/
public class Two_Sum {

    public static void main(String[] args) {
        twoSum(new int[]{3, 3}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }

        return null;
    }
}
