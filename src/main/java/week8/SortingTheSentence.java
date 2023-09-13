package week8;

/*
* A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

Example 1:
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

Example 2:
Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTheSentence {

    @Test
    public void test1(){

        String s = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        String actual = sortSentence(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){

        String s = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        String actual = sortSentence(s);
        Assert.assertEquals(actual, expected);

    }

    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] str2 = new String[str.length];
        int n = 0;

        StringBuilder strBuild = new StringBuilder();
        for(int i=0;i<str.length;i++){

            n = Integer.parseInt(str[i].substring(str[i].length()-1));
            str2[n-1] = str[i].substring(0,str[i].length()-1);

        }
        for(int i=0;i<str2.length;i++){
            strBuild.append(str2[i]).append(" ");
        }
        return strBuild.toString().trim();
    }
}
