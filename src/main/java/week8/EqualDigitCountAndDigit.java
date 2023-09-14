package week8;

/*
* You are given a 0-indexed string num of length n consisting of digits.

Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.
Example 1:

Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.

* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class EqualDigitCountAndDigit {

//    @Test
    public void test1(){

        String num = "1210";
        boolean expected = true;
        boolean actual = digitCount(num);
        Assert.assertTrue(actual);

    }
    @Test
    public void test2(){

        String num = "030";
        boolean expected = false;
        boolean actual = digitCount(num);
        Assert.assertFalse(actual);

    }
//    @Test
    public void test3(){

        String num = "0123456789";
        boolean expected = false;
        boolean actual = digitCount(num);
        Assert.assertFalse(actual);

    }
//    @Test
    public void test4(){

        String num = "1";
        boolean expected = false;
        boolean actual = digitCount(num);
        Assert.assertFalse(actual);

    }
//    @Test
    public void test5(){

        String num = "5210010007";
        boolean expected = false;
        boolean actual = digitCount(num);
        Assert.assertFalse(actual);

    }

    public boolean digitCount(String num) {
        int occurence =0,  value =0;
        boolean count = false;
        String[] str = num.split("");
        for(int i=0;i<num.length();i++){
            occurence = 0;
//            count = false;
            value = Integer.parseInt(str[i]);
            for(int j=0;j< str.length;j++){
                if(i == Integer.parseInt(str[j])){
                    occurence++;
                }
            }
            if(value == occurence){
                count = true;
            }else{
                count = false;
                break;
            }

        }
        return count;
    }
}
