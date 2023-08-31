package week3.HomeWork;/*
* Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits.
*
* Example 1:

Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2:

Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit.
*
* Understood -- Yes
* Datasets -- As given
*
* Pseudocode: 1. get the alphanumeric string str
* 2. Get a substring with just the numbers
* 3. Iterate through a for loop and vreate a String[]
* 4. Get the values of the String[] into an int[]
* 5. Find the second largest and return
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondLargest {

    @Test
    public void test1(){

        String str = "dfa12321afd";
        int output = 2;
        int actual = secondHighest(str);
        Assert.assertEquals(actual, output);


    }
    @Test
    public void test2(){

        String str = "abc1111";
        int output = 0;
        int actual = secondHighest(str);
        Assert.assertEquals(actual, output);

    }



    public int secondHighest(String s) {

        s=s.replaceAll("[a-zA-Z]", "");//1,2,3,2,1 //1,1,1,1,
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'>=max){
                max=s.charAt(i)-'0';
            }
        }
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)-'0'>sMax)&&(s.charAt(i)-'0'!=max)){
                sMax=s.charAt(i)-'0';
            }
        }
        if(sMax == Integer.MIN_VALUE)
        {
            return 0;
        }
        return sMax;
    }
}

/*s = s.replaceAll("[a-zA-Z]", ""); //12321
        s = s.replaceAll("^[123]", "");
        int[] arr = new int[s.length()];
        int count =0;
        for(int i = 0;i< arr.length;i++){
            arr[i] = s.charAt(i)-'0';
            if(arr[i] > count){
                count = arr[i];
            }
        }
        //1,2,3,2,1
        count--;
        for(int i=0;i< arr.length;i++){

            if(arr[i] == count ){
                return arr[i];
            }


        }*/


/*if(sMax!=Integer.MIN_VALUE)
        {
            return sMax;
        }
        return -1;*/

        /*s = s.replaceAll("[a-zA-Z]", ""); //1,2,3,2,1
        String[] str = s.split("");
        int[] arr = new int[s.length()];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j] && (i!=j)){

                }
            }
        }



        return -1;*/
