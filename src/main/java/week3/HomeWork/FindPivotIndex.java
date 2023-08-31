package week3.HomeWork;/*Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.

Understood -- Yes
Datasets -- As given

    Pseudocode: 1. Get the array; int leftSum, rightSum =0;
    2. if i ==0; leftSum =0
    3. If array.length > 1;
    4. Iterate through the array

*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindPivotIndex {

    @Test
    public void test1(){
        int[] nums = {1,7,3,6,5,6};
        int output =3;
        int actual = pivotIndex(nums);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){
        int[] nums = {1,2,3};
        int output =-1;
        int actual = pivotIndex(nums);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test3(){
        int[] nums = {2,1,-1};
        int output =0;
        int actual = pivotIndex(nums);
        Assert.assertEquals(actual, output);

    }

    //Create an array sumLeft where sumLeft[i] is the sum of all the numbers to the left of index i.
    //Create an array sumRight where sumRight[i] is the sum of all the numbers to the right of index i.
    //For each index i, check if sumLeft[i] equals sumRight[i] return i. If no i found, return -1.

    public int pivotIndex(int[] nums) { //2,1,-1  //1,7,3,6,5,6 //

        int leftSum =0;
        int rightSum =0;

        for(int i=0;i< nums.length;i++){
            leftSum = 0;
            rightSum = 0;
            for(int j=0;j<nums.length;j++){

                if(j<i){
                    leftSum = leftSum + nums[j];
                }else if(j>i){
                    rightSum = rightSum + nums[j];
                }
            }
            if(leftSum == rightSum){
                return i;
            }


        }
        return -1;
    }
}


/*int leftSum =0;int rightSum =0;
        int n = nums.length/2;
        for(int i=0;i<n;i++){
            leftSum = leftSum + nums[i];
            for(int j=n+1;j< nums.length;j++){
                rightSum = rightSum + nums[i];
            }
            if(leftSum == rightSum){
                return n;
            } else if (leftSum > rightSum) {

            }

        }*/
