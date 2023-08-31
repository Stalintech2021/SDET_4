package mandatoryHomeWork;/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*
* Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*
* Understood -- Yes
* Dataset -- As given
*
* Pseudocode: 1. Get the arrays num1, nums2
* 3. Iterate through the arrays to find common integer -->
* 4. Remove the duplicates from resulting array
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class IntersectionOfArrays {


    @Test
    public void test1(){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] output = {2};
        int[] actual = intersection(nums1, nums2);
        Assert.assertEquals(actual, output);
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        int[] unique = new int[nums1.length];
        int[] numsUnique1 =  removeDuplicates(nums1);
        int[] numsUnique2 =  removeDuplicates(nums2);



        return unique;
    }

    public int[] removeDuplicates(int[] arr){
        boolean flag = true;
        int[] narr = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                    break;

                }else {
                    flag = true;

                }

            }
            if(flag == true){

                narr[k] = arr[i];
                k++;
            }
        }
        narr = Arrays.copyOf(narr,k);

        return narr;
    }
}
