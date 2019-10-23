package com.mastercard.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class LongestWord {

	/*
	 * If the input string is empty, returns 0, empty list .
	 * If the input string is null, returns null. 
	 * String is expected to be delimited with spaces.
	 * White spaces are trimmed. 
	 * Duplicate words in the input are not expected to be consolidated. 
	 */
	public static LongestWordHolder findLongestWord(String input) {

		if (input == null) {
			return null;
		}
		input = input.trim();

		if (input.isEmpty()) {
			return new LongestWordHolder(Collections.EMPTY_LIST, 0);
		}
		String words[] = input.split(" ");
		ArrayList<String> al = new ArrayList<String>();
		int max_length = words[0].length();
		for (String s : words) {
			if (s.length() == max_length) {
				al.add(s);
			} else if (s.length() > max_length) {
				max_length = s.length();
				al.removeAll(al);
				al.add(s);
			}
		}

		return new LongestWordHolder(al, max_length);

	}
}
