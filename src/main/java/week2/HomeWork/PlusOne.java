package week2.HomeWork;
/*
*
* Given an integer array arr, count how many elements x there are,
   such that x + 1 is also in arr.
   If there are duplicates in arr, count them separately.

   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x

   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input
* */


import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PlusOne {

    @Test
    public void test1(){

        int[] input = {1, 2, 3};
        int output = 2;
        int actual = getPlusOne(input);
        Assert.assertEquals(actual, output);
    }

    @Test
    public void test2(){

        int[] input = {1, 1, 3, 3, 5, 5, 7, 7};
        int output = 0;
        int actual = getPlusOne(input);
        Assert.assertEquals(actual, output);
    }

    @Test
    public void test3(){

        int[] input = {1, 1, 2};
        int output = 2;
        int actual = getPlusOne(input);
        Assert.assertEquals(actual, output);
    }

    public int getPlusOne(int[] input){

        int output = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


        for(int i=0;i<input.length;i++){
            list.add(input[i]);
        }

        for (int j=0;j<list.size();j++){

            if(list.contains(list.get(j)+1)){
                output++;
            }

        }
        return output;
    }

}

/*for(int i=0;i<input.length;i++){

            map.put(i, input[i]);


        }


        for(int j=0;j<map.size();j++){

            if( map.containsValue(map.get(j)+1)){
                output++;
            }

        }*/
