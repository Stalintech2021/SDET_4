package week8;

/*
* You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

Return an array result of length 2 where:

    result[0] is the total number of lines.
    result[1] is the width of the last line in pixels.



Example 1:

Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class NoOfLinesToWriteString {

    //@Test
    public void test1(){

        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] expected = {3,60};
        int[] actual = numberOfLines(widths, s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){

        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        int[] expected = {2,4};
        int[] actual = numberOfLines(widths, s);
        Assert.assertEquals(actual, expected);

    }

    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        String str = "";
        int finalWidth=0;
        int count =0, row =0;
        for(int i=0;i<s.length();i++) {

            while (count <= 95 && i<=s.length()-1) {
                count = count + widths[i];
                str = str+Character.toString(s.charAt(i));
                if(i <= widths.length-1) i++;
            }
            i--;

            finalWidth = count;
            row++;
            count = 0;
            System.out.println(str);
            str="";

        }
        result[0] = row;
        result[1] = finalWidth;
        return result;

        }

    }

