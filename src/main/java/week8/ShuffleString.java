package week8;

/*
* You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
* Example 1:
* Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
*
* Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShuffleString {

    @Test
    public void test1(){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String expected = "leetcode";
        String actual = restoreString(s,indices);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){
        String s = "abc";
        int[] indices = {0,1,2};
        String expected = "abc";
        String actual = restoreString(s,indices);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test3(){
        String s = "aidni";
        int[] indices = {4,3,2,1,0};
        String expected = "india";
        String actual = restoreString(s,indices);
        Assert.assertEquals(actual, expected);

    }

    public String restoreString(String s, int[] indices) {
        StringBuilder strBuild = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            strBuild.setCharAt(indices[i], s.charAt(i));
        }
        return strBuild.toString();
    }
}
