package mandatoryHomeWork;/*
* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*
* Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*
* Understand -- Yes
* Dataset -- as given
*
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeros3 {

    @Test
    public void test1(){

        int[] arr = {0,1,0,3,12};
        int[] output = {1,3,12,0,0};
        int[] actual =checkZeros(arr);
        Assert.assertEquals(actual, output);
    }

    @Test
    public void test2(){

        int[] arr = {0};
        int[] output = {0};
        int[] actual =checkZeros(arr);
        Assert.assertEquals(actual, output);
    }

    public int[] checkZeros(int[] arr){

        if(arr.length == 0 && arr[0] == 0){
            return arr;
        }

        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == 0){
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }
}
