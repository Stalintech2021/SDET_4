package week10;

/*
*Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
Example 1:
Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

Example 2:
Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubArrayOfSizeKAverageGreaterThanEquakToThresold {

    @Test
    public void test1(){
        int[] arr = {2,2,2,2,5,5,5,8};
        int exp = 3;
        int k= 3, threshold =4;
        int actual = numOfSubarrays(arr,k,threshold);
        Assert.assertEquals(actual, exp);
    }
    @Test
    public void test2(){
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int exp = 6;
        int k= 3, threshold =5;
        int actual = numOfSubarrays(arr,k,threshold);
        Assert.assertEquals(actual, exp);
    }
    @Test
    public void test3(){
        int[] arr = {1,1,1,1,1};
        int exp = 5;
        int k= 1, threshold =0;
        int actual = numOfSubarrays(arr,k,threshold);
        Assert.assertEquals(actual, exp);
    }

    public int average(int[] arr,int k,int sp, int ep){
        int sum =0, avg =0;
        for(int i=sp;i<ep;i++){
            sum += arr[i];
            avg = sum/k;

        }
        return avg;
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sp=0,ep=sp+k,count=0, n=arr.length;
        while(ep <= n){
            int avg = average(arr,k,sp,ep);
            if(avg >= threshold){
                count++;
                sp++;
                ep = sp+k;
            }
            else{
                sp++;
                ep = sp+k;
            }
        }
        return count;
    }
}
