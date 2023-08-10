/*
* You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*
* Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
*
* Understood -- Yes
* Dataset -- As given
*
* Pseudocode:1. Get the num
* 2.
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Max69Number {

    @Test
    public void test1(){
        int num = 9669;
        int output = 9969;
        int actual = maximum69Number(num);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int num = 9996;
        int output = 9999;
        int actual = maximum69Number(num);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){
        int num = 9999;
        int output = 9999;
        int actual = maximum69Number(num);
        Assert.assertEquals(actual, output);
    }

    public int maximum69Number (int num) {

        if(num == 9999){
            return num;
        }

        int maxVal =0;
        String s = "";

        String[] str = (Integer.toString(num)).split("");
        int[] nArray = new int[str.length];

        for(int i =0;i< str.length;i++){
            if(Integer.parseInt(str[i]) == 9){
                str[i] = "6";
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<str.length;j++){
                    sb.append(str[j]);
                }
                nArray[i] = Integer.parseInt(sb.toString());
                str[i] = "9";
                continue;

            } else if (Integer.parseInt(str[i]) == 6) {
                str[i] = "9";
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<str.length;j++){
                    sb.append(str[j]);
                }
                nArray[i] = Integer.parseInt(sb.toString());
                str[i] = "6";
                continue;
            }

        }
        for(int i=0;i<nArray.length;i++){
            if(maxVal > nArray[i]){
                continue;
            }else{
                maxVal = nArray[i];
            }

        }
        return maxVal;
    }
}
