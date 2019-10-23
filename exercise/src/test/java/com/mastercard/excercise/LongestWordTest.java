package com.mastercard.excercise;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import com.mastercard.exercise.LongestWord;
import com.mastercard.exercise.LongestWordHolder;

public class LongestWordTest {
	@Test
	public void testOneLongestWord()
	{
		LongestWordHolder lwh=LongestWord.findLongestWord("The cow jumped over the moon.");	
		Assert.assertEquals(Arrays.asList("jumped"),lwh.getLongestWords());
		Assert.assertEquals(6,lwh.getMaxLength());
		
	}
	@Test
	public void testOutputIdempotency()
	{
		LongestWordHolder lwh=LongestWord.findLongestWord("The cow jumped over the moon.");
		
		Assert.assertEquals(Arrays.asList("jumped"),lwh.getLongestWords());
		lwh.getLongestWords().removeAll(lwh.getLongestWords());
		Assert.assertEquals(Arrays.asList("jumped"),lwh.getLongestWords());
		Assert.assertEquals(6,lwh.getMaxLength());
		
	}
	@Test
	public void testEmptyString()
	{
		LongestWordHolder lwh=LongestWord.findLongestWord("");
		Assert.assertEquals(Collections.EMPTY_LIST,lwh.getLongestWords());
		Assert.assertEquals(0,lwh.getMaxLength());
	}
	@Test
	public void testNullString()
	{
		LongestWordHolder lwh=LongestWord.findLongestWord(null);
		Assert.assertNull(lwh);
	
	}
	@Test
	public void testMultipleLongestWords()
	{
		LongestWordHolder lwh=LongestWord.findLongestWord("cow jumped dog jumped in animal planet");
		Assert.assertEquals(Arrays.asList("jumped","jumped","animal","planet"),lwh.getLongestWords());
		Assert.assertEquals(6,lwh.getMaxLength());
	}
}
