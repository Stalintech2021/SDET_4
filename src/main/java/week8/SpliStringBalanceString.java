package week8;

/*
*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

    Each substring is balanced.

Return the maximum number of balanced strings you can obtain.



Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpliStringBalanceString {

    @Test
    public void test1(){

        String s = "LLLLRRRR";
        int expected =1;
        int actual = balancedStringSplit(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){

        String s = "RLRRLLRLRL";
        int expected =4;
        int actual = balancedStringSplit(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test3(){

        String s = "RLRRRLLRLL";
        int expected =2;
        int actual = balancedStringSplit(s);
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test4(){

        String s = "LRRL";
        int expected =2;
        int actual = balancedStringSplit(s);
        Assert.assertEquals(actual, expected);

    }

    public int balancedStringSplit(String s) {
        int bal=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                bal++;
            }else if(s.charAt(i) == 'L'){
                bal--;
            }
            if(bal ==0){
                count++;
            }
        }
        return count;
    }
}
