/*
* Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
*
* Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
*
*
* Understood -- Yes
* Dataset -- As given
*
* Pseudocode: 1. Get the Array string
* 2. In a for loop check if each element of the array is palindrome
* 3. If one of the element is palindrome return the element
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPalindromicStringInArray {

    @Test
    public void test(){
        String[] words = {"abc","car","ada","racecar","cool"};
        String output = "ada";
        String actual =checkFirstPalindrome(words);
        Assert.assertEquals(actual, output);
    }
    public String checkFirstPalindrome(String[] words){

        String str = "";

        for(int i=0;i< words.length;i++){
            str = words[i];
            String rev = "";

            for(int j=str.length()-1;j>=0;j--){
                rev = rev+str.charAt(j);
            }
            if(str.equals(rev)) return str;
        }
        return "";
    }
}
