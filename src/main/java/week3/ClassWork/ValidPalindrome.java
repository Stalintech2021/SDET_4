package week3.ClassWork;/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
* */


import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPalindrome {

    @Test
    public void test2(){

        String s = "A man, a plan, a canal: Panama";
//        String s = "Asda";
        boolean actual = checkPalindrome(s);
        Assert.assertTrue(actual);

    }
    public boolean checkPalindrome(String s){

        String rev = "";
        boolean val = false;

        String replace = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] ch = replace.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev = rev+ch[i];


        }
        System.out.println(replace);
        System.out.println(rev);
        if(replace.equals(rev)) val = true;
        return val;
    }
}
