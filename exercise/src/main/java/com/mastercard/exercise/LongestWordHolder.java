package com.mastercard.exercise;

import java.util.ArrayList;
import java.util.List;

public class LongestWordHolder {
	private List<String> al;
	private int max_length;

	public LongestWordHolder(List<String> al, int max_length) {
		this.al = al;
		this.max_length = max_length;
	}

	public List<String> getLongestWords() {
		//Return a copy of the list to ensure idempotency
		return new ArrayList<String>(al);
	}

	public int getMaxLength() {
		return max_length;
	}
}
