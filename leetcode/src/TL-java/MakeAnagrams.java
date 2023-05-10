package Tl;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;

public class MakeAnagrams {

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym",
                "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));

       System.out.println(makeAnagram("woman", "showman"));
        System.out.println(makeAnagram( "teacup", "teateatea"));

        System.out.println(makeAnagram("abc", "cde"));
    }

    public static int makeAnagram(String a, String b) {
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();

       for(int i = 0; i < a.length(); i++) {
           if(map.containsKey(a.charAt(i))) {
               int num = map.get(a.charAt(i));
               map.put(a.charAt(i), num+1);
           }
           else {
               map.put(a.charAt(i), 1);
           }
       }
        int total = 0;
       for(int i = 0; i < b.length(); i++) {
           if(map.containsKey(b.charAt(i))) {
               int num = map.get(b.charAt(i));
               map.put(b.charAt(i), num-1);
           }
           else {
               total += 1;
           }
       }

       for(Integer i : map.values()) {
           total += Math.abs(i);
       }

       /*for(int i = 0; i < map.size(); i++) {
           if(map.get(a.charAt(i)) != 0) {
               total += Math.abs(map.get(a.charAt(i)));
           }
       }*/
        return total;
    }
}

