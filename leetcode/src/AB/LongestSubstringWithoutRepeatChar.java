package AB;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatChar {

	public static void main(String[] args) {

		LongestSubstringWithoutRepeatChar o = new LongestSubstringWithoutRepeatChar();
		int actual = o.lengthOfLongestSubstring("abcabcbb");
		int expected = 3;

		System.out.println((actual == expected));

	}

	public int lengthOfLongestSubstring(String s) {

		HashSet<Character> items = new HashSet<>();

		int max = 0;
		int left = 0;
		int right = 0;

		while (right < s.length()) {

			if (!items.add(s.charAt(right))) {
				// when an existing char can't be added, remove it from the very left
				items.remove(s.charAt(left));
				// then shift it
				left++;
			} else {
				// if it can be added, then add, increment right
				right++;
				// then set the current max
				max = Math.max(max, items.size());
			}
		}

		return max;
	}
}
