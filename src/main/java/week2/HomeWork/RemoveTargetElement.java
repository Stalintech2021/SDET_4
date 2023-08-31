package week2.HomeWork;/*
* 4. Remove the target element in the array

	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array,
							output is [2, 4, 5]

	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/
*
*
* */


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RemoveTargetElement {

    @Test
    public void test1(){

        int[] input = {2,3,3,4,5};
        int[] output = {2,4,5};
        int target = 3;
        ArrayList<Integer> list = removeTarget(input, target);
        System.out.println(list);

    }

    @Test
    public void test2(){

        int[] input = {2,2};
        int target = 2;
        ArrayList<Integer> list = removeTarget(input, target);
        Assert.assertTrue(list.isEmpty());

    }

    public ArrayList<Integer> removeTarget(int[] input, int target){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int num:input) {
            if(num != target){
                list.add(num);
            }
        }
        return list;
    }
}
