package mandatoryHomeWork;/*
* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*
* Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*
* Understood -- Yes
* Datasets -- As given
*
* Pseudocode: 1. Get the array of integers
* 2. Declare a string arrString
* 3. Iterate the array through a for loop
* 4. for every i typecast it to a String and add it to arrString
* 5. After the iteration convert the arrString to int
* 6. add 1 to int(arrString)
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOne66 {

    @Test
    public void test1(){

        int[] input = {1,2,4};
        int[] output = {1,2,5};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){

        int[] input = {4,3,2,1};
        int[] output = {4,3,2,2};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){

        int[] input = {9};
        int[] output = {1,0};
        int[] actual = plusOne(input);
        Assert.assertEquals(actual, output);
    }

    public int[] plusOne(int[] digits) {


        String newStr = "";
        int newInt = 0;

        for(int i=0;i<digits.length;i++){
            if(i == digits.length-1){
                digits[i]++;
            }

        }
        int[] arr = new int[digits.length+1];
        if(digits.length == 1 && (digits[0]%10) ==0){
            String str = Integer.toString(digits[0]);
            String[] st2 = str.split("");
            for (int i=0;i<st2.length;i++){
                arr[i] = Integer.parseInt(st2[i]);
            }
            return arr;
        }

        return digits;
    }
}

    /*int[] fin = new int[2];
        if(digits.length == 1 && (digits[0]%10) ==0){
                int temp = digits[0];
                fin[0] = temp/10;
                fin[1] = temp%10;
                }

                return fin;*/
