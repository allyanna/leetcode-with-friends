package Tl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Link: https://leetcode.com/problems/combination-sum-ii/
public class Combination_Sum_II {

    public static void main (String args[]) {
        combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combination(list, new ArrayList<Integer>(), 0, target, candidates);

        return list;
    }

    public static void combination(List<List<Integer>> list, ArrayList<Integer> l, int current, int target, int[] candidates) {

        if(target < 0) {
            return;
        }

        if(target == 0) {
                list.add(new ArrayList<>(l));
            return;
        }

        for(int i = current; i < candidates.length; i++) {
            if(i > current && candidates[i] == candidates[i-1]) { // removes duplicates?
                continue;
            }
            l.add(candidates[i]);
            combination(list, l, i+1, target - candidates[i], candidates);
            l.remove(l.size() - 1);
            //combination(list, l, i+1, target, candidates);
        }

    }
}
