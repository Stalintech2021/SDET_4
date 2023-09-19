package week10;

/*
* A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".

Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubstringsofSizeThreeWithDistinctCharacters {

    @Test
    public void test1(){
        String s = "xyzzaz";
        int exp = 1;
        int actual = countGoodSubstrings(s);
        Assert.assertEquals(actual, exp);
    }
    @Test
    public void test2(){
        String s = "aababcabc";
        int exp = 4;
        int actual = countGoodSubstrings(s);
        Assert.assertEquals(actual, exp);
    }
    @Test
    public void test3(){
        String s = "aaaaa";
        int exp = 0;
        int actual = countGoodSubstrings(s);
        Assert.assertEquals(actual, exp);
    }
    @Test
    public void test4(){
        String s = "abcde";
        int exp = 3;
        int actual = countGoodSubstrings(s);
        Assert.assertEquals(actual, exp);
    }



    public int countGoodSubstrings(String s) {

        int count =0;
        int startPoint =0, endPoint =startPoint+3;
        int k = 3, n = s.length();

        while(endPoint <= n){
            if(s.charAt(startPoint) == s.charAt(startPoint+1) || s.charAt(startPoint+1) == s.charAt(startPoint+2) || s.charAt(startPoint) == s.charAt(startPoint+2)){
                startPoint++;
                endPoint = startPoint+3;

            }else {
                count++;
                startPoint++;
                endPoint = startPoint+3;

            }
        }

        return count;
    }
}
