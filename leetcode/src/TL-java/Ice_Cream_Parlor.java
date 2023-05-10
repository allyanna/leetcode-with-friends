package Tl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ice_Cream_Parlor {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        whatFlavors(list, 4);
    }

    public static void whatFlavors(List<Integer> cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < cost.size(); i++) {
           map.put(cost.get(i), i+1);
        }


        for(int i = 0; i < map.size(); i++) {
            if(map.containsKey(money-cost.get(i))) {
                int num1 = i+1;
                int num2 = map.get(money-cost.get(i));

                if(num1 != num2 && map.get(money-cost.get(i)) != -2 && map.get(cost.get(i)) != -2) {
                    System.out.println(i + 1 + " " + map.get(money - cost.get(i)));
                    map.put(money-cost.get(i), -2);
                    map.put(cost.get(i), -2);
                }

            }
        }
    }
}
