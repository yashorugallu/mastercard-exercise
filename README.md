# mastercard-exercise

#Assumptions:

1.If the input string is empty, returns 0, empty list
2.If the input string is null, returns null
3.String is expected to be delimited with spaces.
4.Whitespaces are trimmed.
5.Duplicate words in the input are not expected to be consolidated.


LongestWordHolder

Return a copy of the list to ensure idempotency

README

Usage:

LongestWordHolder longestWordHolder = LongestWord.findLongestWord(“A quick fox jumps over the lazy dog”);
int lengthOfLongestWord = longestWordHolder.getMaxLength()
List<String> listOfLongestWords = longestWordHolder.getLongestWords();
