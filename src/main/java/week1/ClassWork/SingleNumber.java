package week1.ClassWork;/*[2,2,1]
* 1. Get the array nums
* 2. Iterate through the array i=1
* 3. Iterate again threough the array as j=i+1
* 4. check int[i] == int[j] ; add
* 5. If equal break; move to next element
* 6. find the occurences of each element
* 7. return the element with occurence =1
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleNumber {

    @Test
    public void test1(){

        int[] arr = {1,1,2};
        int single = findDuplicateCount(arr);
        Assert.assertEquals(single, 2);

    }
    @Test
    public void test2(){

        int[] arr = {4,1,2,1,2};
        int single = findDuplicateCount(arr);
        Assert.assertEquals(single, 4);

    }@Test
    public void test3(){

        int[] arr = {4};
        int single = findDuplicateCount(arr);
        Assert.assertEquals(single, 4);

    }

    public int findDuplicateCount(int arr[]) {

        int single = 0;
        if(arr.length == 1){

            return arr[0];
        }

        for (int i=0; i<arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }
            if(count ==1 ) {
                single = arr[i];
                break;
            }
        }
         return single;
    }

}
