package week8;

/*
* Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

Return the final string that will be present on your laptop screen.



Example 1:

Input: s = "string"
Output: "rtsng"
Explanation:
After typing first character, the text on the screen is "s".
After the second character, the text is "st".
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn".
After the sixth character, the text is "rtsng".
Therefore, we return "rtsng".

*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaultyKeyboard {

    @Test
    public void test1(){

        String s = "string";
        String expected = "rtsng";
        String actual = finalString(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){

        String s = "poiinter";
        String expected = "ponter";
        String actual = finalString(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test3(){

        String s = "ring";
        String expected = "rng";
        String actual = finalString(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test4(){

        String s = "joining";
        String expected = "njong";
        String actual = finalString(s);
        Assert.assertEquals(actual, expected);

    }

    public String finalString(String s) {

        String str = "";
        StringBuilder strBuild = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 'i'){
                strBuild.append(arr[i]);
            }else{
                strBuild.reverse();
            }
        }
        str = strBuild.toString();
        return str;
    }
}
