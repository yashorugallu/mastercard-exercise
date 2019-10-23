# mastercard-exercise
Assumptions:

If the input string is empty, returns 0, empty list
If the input string is null, returns null
String is expected to be delimited with spaces.
Whitespaces are trimmed.
Duplicate words in the input are not expected to be consolidated.


LongestWordHolder

Return a copy of the list to ensure idempotency

README

Usage:

LongestWordHolder longestWordHolder = LongestWord.findLongestWord(“A quick fox jumps over the lazy dog”);
int lengthOfLongestWord = longestWordHolder.getMaxLength()
List<String> listOfLongestWords = longestWordHolder.getLongestWords();
