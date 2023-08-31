package mandatoryHomeWork;/*Remove the target element in the array

	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array,
							output is [2, 4, 5]

	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/

Yes
Dataset as given

Pseudocode:
1. Get the array input = [2, 3, 3, 4, 5]
int s =0
2. Iterate through a for loop int i
3. Check the no of occurences of target in the array
4. Create a new array size = input.length - occurences
5. Check if int[k] != target -- > Add to newArray
6. s++


			   */

import org.testng.Assert;
import org.testng.annotations.Test;

public class TargetArray2 {

    @Test
    public void test1(){
        int[] input = {2, 3, 3, 4, 5};
        int target = 3;
        int[] output = {2,4,5};
        int[] actual = getNewArray(input, target);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int[] input = {2,2};
        int target = 2;
        int[] output = {};
        int[] actual = getNewArray(input, target);
        Assert.assertEquals(actual, output);
    }

    public int[] getNewArray(int[] input, int target){

        int count =0;
        int s=0;
        for(int i=0;i< input.length;i++){
            if(input[i] == target){
                count++;
            }
        }
        int[] newArr = new int[input.length-count];
        for(int k=0;k< input.length;k++){
            if (input[k] != target){
                newArr[s] = input[k];
                s++;
            }
        }
        return newArr;


    }
}
