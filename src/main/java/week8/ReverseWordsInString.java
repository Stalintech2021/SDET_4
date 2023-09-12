package week8;

/*
* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"

Constraints:
    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.

* 1. Understood: Yes, 2.Soln: Yes, 3. Alt-Soln:No
* Dataset:
* Ex1	Let's	take	LeetCode	contest
* Ex2	God	    Ding
* Ex3	S
* Ex4	Jack	and	    jill	    went	up	the	hill
*
* 4. Pseudocode:
*   1. Declarations StringBuilder strBuild
*   2. Get the string in strBuild. Use the in-built method to reverse the string
*   3.Validate the output returned.
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsInString {

    @Test
    public void test1(){
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String actual = reverseWords(s);
        Assert.assertEquals(actual, expected);

    }

    public String reverseWords(String s) {

        String reverse = "";
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuilder strBuild = new StringBuilder(str[i]);
            strBuild.reverse();
            reverse = reverse + strBuild.toString() + " ";
        }
        reverse = reverse.trim();
        return reverse.trim();
    }
}
