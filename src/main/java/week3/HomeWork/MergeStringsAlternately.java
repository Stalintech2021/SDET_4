package week3.HomeWork;/*
* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*
*
* Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*
* Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
*
* Understood -- Yes
* Datasets -- As given
*
* Pseudocode: 1. Get the strings str1, str2
* 2. Declare String append
* 3.
*
*
* */

import org.testng.annotations.Test;

public class MergeStringsAlternately {

    @Test
    public void test1(){
        String str1 = "abc";
        String str2 = "pqr";
        checkAppend(str1, str2);
    }

    @Test
    public void test2(){
        String str1 = "ab";
        String str2 = "pqrs";
        checkAppend(str1, str2);
    }

    @Test
    public void test3(){
        String str1 = "abcd";
        String str2 = "pq";
        checkAppend(str1, str2);
    }

    public void checkAppend(String str1, String str2){
        int diff = 0;
        String subStr1 = "";
        String subStr2 = "";
        String append = "";
        if(str1.length() > str2.length()){
            diff = str1.length()-str2.length();
            subStr1 = str1.substring(diff);
            for(int i=0;i<str2.length();i++){

                append = append+str1.charAt(i)+str2.charAt(i);

            }
            append = append+subStr1;

        }else{
            diff = str2.length()-str1.length();
            subStr2 = str2.substring(diff);
            for(int i=0;i<str1.length();i++){

                append = append+str1.charAt(i)+str2.charAt(i);

            }
            append = append+subStr2;
        }

    }
}
