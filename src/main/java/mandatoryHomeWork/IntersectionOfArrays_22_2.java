package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionOfArrays_22_2 {

    @Test
    public void test1(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] output = {2};
        int[] actual = intersection(nums1, nums2);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] output = {9,4};
        int[] actual = intersection(nums1, nums2);
        Assert.assertEquals(actual, output);

    }


    public int[] intersection(int[] nums1, int[] nums2) {

        int k=0;
        //check which array is longer
        if(nums1.length>nums2.length)
        {
            k=nums1.length;
        }else k=nums2.length;
        //create a new int[] with value of k
        int[] arr=new int[k];
        int x=0;
        //Iterate through new array
        for(k=0;k<arr.length;k++){
            //
            arr[k]=Integer.MAX_VALUE;

        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int count=0;
                    for(k=0;k<arr.length;k++){
                        if(arr[k]==nums1[i]){
                            count++;
                        }
                    }if(count==0){
                            arr[x]=nums1[i];
                            x++;
                    }
                }
            }
        }
        int[] nums4 = new int[x];
        for(int i=0;i<x;i++){
            nums4[i]=arr[i];
        }
        return nums4;
    }
}
