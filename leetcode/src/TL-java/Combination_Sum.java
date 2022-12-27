package Tl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {

    public static void main(String args[]) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> combined = new ArrayList<List<Integer>>();

        backtracking(candidates, 0, target, new ArrayList<Integer>(), combined);

        return combined;
    }

    public static void backtracking(int[] candidates, int current, int target, ArrayList<Integer> list, List<List<Integer>> combined) {

        //backtracking(candidates, current+1, target);
        //backtrackimg(candidates, current+1, target-candidates[current])

        if(target < 0) {
            return;
        }
        if(target == 0) {
            combined.add(new ArrayList<>(list));
        }

        for(int i = current; i < candidates.length; i++) {
            list.add(candidates[i]);
            backtracking(candidates, i, target - candidates[i], list, combined);
            list.remove(list.size() - 1);
           // backtracking(candidates, current + 1, target, list, combined);
        }
    }
}
