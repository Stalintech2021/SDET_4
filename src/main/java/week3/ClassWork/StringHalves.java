package week3.ClassWork;/*
* You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
*
* Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
*
* Understand -- Yes
* Dataset -- As given
*
* Pseudocode:
* 1. Get the string str
* 2. Get int size = string.size
* 3. String a = str.subString(0,n/2) bo
* 4. String b = str.subString(n/2) ok
* 5. a = a.toLowerCase
* 6. b = b.toLowerCase
* 7. for(int i;i<a.length();i++)
* 8. if (a.charAt[i] is available in {a,e,i,o,u})
* 9. count1++
* 10. for(int i;i<a.length();i++)
* 11 if (b.charAt[i] is available in {a,e,i,o,u})
* 12. count2++
* 13. return count1 == count2
*
* */

import org.testng.annotations.Test;

public class StringHalves {

    @Test
    public void test1(){
        String s = "$book22";
        checkEquals(s);
    }

    public void checkEquals(String s){

        String newStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9\\s+]",  "");
        System.out.println(newStr);


    }
}
