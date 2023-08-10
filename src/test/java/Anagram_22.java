/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram_22 {

    @Test
    public void test1(){
        String s = "anagram";
        String t = "nagaram";
        boolean actual = isAnagram(s,t);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){
        String s = "rat";
        String t = "car";
        boolean actual = isAnagram(s,t);
        Assert.assertFalse(actual);
    }

    public boolean isAnagram(String s, String t) {

        boolean anagram = false;
        int[] n = new int[26];
        int[] ch = new int[s.length()];
        int[] ch2 = new int[t.length()];
        for(int i=0;i<s.length();i++){
            n[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            n[t.charAt(i) - 'a']--;
        }
        for(int i=0;i<t.length();i++){
            if(n[i] ==0){
                anagram = true;
            }else {
                anagram = false;
            }
        }
        return anagram;
    }
}
