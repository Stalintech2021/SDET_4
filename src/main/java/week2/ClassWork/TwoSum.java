package week2.ClassWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSum {

    @Test
    public void test1(){

        int[] arr = {2,7,11,15};
        int target = 9;
        int[] indices = returnIndices(arr, target);
        Assert.assertEquals(new int[] {0,1}, indices);

    }

    @Test
    public void test2(){

        int[] arr = {3,2,4};
        int target = 6;
        int[] indices = returnIndices(arr, target);
        Assert.assertEquals(new int[] {1,2}, indices);
    }

    @Test
    public void test3(){

        int[] arr = {3,3};
        int target = 6;
        int[] indices = returnIndices(arr, target);
        Assert.assertEquals(new int[] {0,1}, indices);
    }

    public int[] returnIndices(int[] arr, int target){

        int[] indices = new int[2];

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j] == target)){
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
                break;
            }
        }
        return indices;
    }
}
