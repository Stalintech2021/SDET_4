/*
* Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
*
*
* Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelColumnNumber {

    @Test
    public void test1(){
        String columnTitle = "A";
        int output = 1;
        int actual = titleToNumber(columnTitle);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        String columnTitle = "AB";
        int output = 28;
        int actual = titleToNumber(columnTitle);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){
        String columnTitle = "ZY";
        int output = 701;
        int actual = titleToNumber(columnTitle);
        Assert.assertEquals(actual, output);
    }

    public int titleToNumber(String columnTitle) {
        int colNumber = 0;
        //A-65, B-66
        for(int i=0;i<columnTitle.length();i++){
            colNumber = colNumber *26 +(columnTitle.charAt(i)-'A')+1;
        }
        return colNumber;
    }


}
