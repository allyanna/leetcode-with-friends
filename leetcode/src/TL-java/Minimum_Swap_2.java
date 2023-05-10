package Tl;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Swap_2 {

    public static void main(String args[]) {
        minimumSwaps(new int[]{4, 3, 1, 2});
    }

    public static int minimumSwaps(int[] arr) {

        int count = 0;
        int i = 0;
        while (i<arr.length){
            if (arr[i]!=i+1){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                count ++;
            }else i++;
        }
        return count;

    }
}
