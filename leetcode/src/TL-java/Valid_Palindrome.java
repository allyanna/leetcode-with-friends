package Tl;

public class Valid_Palindrome {

    public static void main(String[] args) {
        isPalindrome("aa");
    }

    public static boolean isPalindrome(String s) {

        if(s == "" || s == " ") {
            return true;
        }

        String newstr = s.replaceAll("[^A-Za-z]+", "").toLowerCase();

        char[] array = newstr.toCharArray();

        if(array.length == 1) {
            return false;
        }

        int front = 0;
        int back = array.length -1;

        for(int i = 0; i < array.length; i++) {


            if(front != back && array[front] != array[back]) {
                return false;
            }
            else if(front == back) {
                return true;
            }

            front++;
            back--;
        }

        return false;

    }
}
