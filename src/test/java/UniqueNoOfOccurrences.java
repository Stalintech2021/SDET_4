/*
* Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
*
* Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
*
* Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
*
* Understood -- Yes
* Dataset -- As Given
*
*
* Pseudocode: 1. Get the array
* 2. declare an int count =0
* 3. Iterate through the array ti verify the occurence of the ith element
* 4. Add the count in an int[]
* 5. Compare if the count in int[] are unique
*
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class UniqueNoOfOccurrences {

    @Test
    public void test1(){

        int[] arr = {1,2,2,1,1,3};
        boolean actual = uniqueOccurrences(arr);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){

        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean actual = uniqueOccurrences(arr);
        Assert.assertTrue(actual);
    }

        public boolean uniqueOccurrences(int[] arr) {

            int count =0;
            HashMap<Integer, Integer> nMap = new HashMap<Integer, Integer>();
            for(int i=0;i< arr.length;i++){
                count =0;
                for (int j =0;j< arr.length;j++){

                    if(arr[i] == arr[j]){
                        count++;

                    }
                }
                nMap.put(arr[i],count);
            }
            System.out.println(nMap.values());
            Collection<Integer> arrNew = nMap.values();
            Object[] ar = arrNew.toArray();
            for(int i=0;i<arrNew.size()-1;i++){
                if(ar[i]  == ar[i+1]){
                    return false;
                }
            }
            return true;
        }
}
