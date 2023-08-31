package week2.HomeWork;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class MoveZeros {

    @Test
    public void test1(){

        int[] nums = {0,1,0,3,12};
        moveAllZeros(nums);
    }

    public void moveAllZeros(int[] nums){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0) {
                list.add(nums[i]);
            }
            if (nums[i] == 0){
                list2.add(nums[i]);
            }

        }
        list.addAll(list2);
        System.out.println(list);

    }
}
