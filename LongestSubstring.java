package LongestSubstring;

import java.util.*;

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
	
		int i = 0;
		int j = 0;
		int length = 0;
		int longest = 0;
		char chr;
		ArrayList<Character> result = new ArrayList<Character>(); 
		while(i < s.length()) {
			chr = s.charAt(i);
			if (result.contains(chr)) {
				j = result.indexOf(chr);
				while (j >= 0) {
				result.remove(j);
					j--;
				}
			}
			result.add(chr);
			length = result.size();
			if (length > longest)
				longest = length;
			i++;
		}
		return longest;
	
	}
	
	public static void main(String[] args) {
		String input = "1abcd1abcdef1abcd";
		System.out.println(lengthOfLongestSubstring(input));
	
	}

}
