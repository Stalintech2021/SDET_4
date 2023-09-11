package week8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.min;

public class ArrayPartition {

    @Test
    public void test1(){

        int[] nums = new int[]{1,4,3,2};
        arrayPairSum(nums);
//        int expected = 4;
//        Assert.assertEquals(actual, expected);

    }

    public void arrayPairSum(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        AtomicInteger sum = new AtomicInteger();
        Arrays.sort(nums);
        System.out.println(nums);
        for(int i=0;i< nums.length-1;i++){
            map.put(nums[i], nums[i+1]);
            i++;
        }
        System.out.println(map);

        map.forEach((k,v) -> {
            System.out.println();
        });

    }
}
