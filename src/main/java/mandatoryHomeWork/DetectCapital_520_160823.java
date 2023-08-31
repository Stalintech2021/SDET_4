package mandatoryHomeWork;/*
* We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
*
*
Example 1:
Input: word = "USA"
Output: true
*
*
Example 2:
Input: word = "FlaG"
Output: false
*
* Understood: Yes
* Dataset: Yes
*
* Pseudocode: 1. Get the word as string
* 2. Convert the word into a char[]
* 3. Check the mandatoryHomeWork.ASCII value for the first letter for capital (mandatoryHomeWork.ASCII value range between 65-90)
* 3. If Yes move on to the next char
* 4. If the next char happens to be lower case (mandatoryHomeWork.ASCII value range between 97-122); verify if all the characters are lower case
* 5. If Yes return true; else return false;
* 6. Else keep iterating till the end of the loop if all characters happens to be Uppercase return true
*6. If all the characters happens to be lower case return true
*
*
*
* */


import org.testng.annotations.Test;

public class DetectCapital_520_160823 {

    @Test
    public void test1(){

        String w = "USA";
        String s = "anagram";
        detectCapitalUse(w, s);

    }


    public boolean detectCapitalUse(String w, String s) {

        boolean capital = false;
        int[] n = new int[26];

        for(int i=0;i<s.length();i++){
            n[s.charAt(i)-'a']++;
        }

        for(int i=0;i<w.length();i++){

            System.out.println( n[w.charAt(i)-'a']++);

        }
        return capital;
    }

}
