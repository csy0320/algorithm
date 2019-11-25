package cn.jjdcn.leecode.subject0003;

import java.util.HashSet;
import java.util.Set;


public class LengthOfLongestSubstring {
	Set<Character> set = new HashSet<>();

	public static void main(String[] args) {
		int length = lengthOfLongestSubstring("hello world!");

		System.out.println("length = " + length);
	}

	private static int lengthOfLongestSubstring(String s) {
		if ("".equals(s)) return 0;
		int n = s.length();
		int answer = 1;
		Set<Character> set = new HashSet<>();
		for (int i = 0,j = 0; j < n ;){
			if(!set.contains(s.charAt(j))) {
				answer = Math.max(j - i + 1, answer);
				set.add(s.charAt(j++));
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return answer;
	}
}
