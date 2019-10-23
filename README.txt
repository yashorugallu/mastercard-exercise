# mastercard-exercise

#Assumptions:

1.If the input string is empty, returns  0 for max_length  and empty list for listoflongestwords
2.If the input string is null, returns null
3.String is expected to be delimited with spaces.
4.Whitespaces are trimmed.
5.Duplicate words in the input are not expected to be consolidated.

#Usage:

LongestWordHolder longestWordHolder = LongestWord.findLongestWord(“A quick fox jumps over the lazy dog”);
int lengthOfLongestWord = longestWordHolder.getMaxLength()
List<String> listOfLongestWords = longestWordHolder.getLongestWords();

#Main Classes

Here is the path for main classes : mastercard-exercise/exercise/src/main/java/com/mastercard/exercise/

LongestWord.java     ------> this class is responsible for main logic      
LongestWordHolder.java  ----> This class is responsible for holding the output


#Test Class & Unittestcases:

Following is the path for Test Class : mastercard-exercise/exercise/src/test/java/com/mastercard/excercise/LongestWordTest.java

JUnit is used for writing the unit testcases.

Run this class as junit test to execute all the unit test cases.
