package week2.HomeWork;

import org.testng.annotations.Test;

import java.util.HashMap;

public class FindSingleOne {


    @Test
    public void checkSingleOne(){

        int[] nums = {4,1,2,1,2};

        findSingle(nums);
    }

    public void findSingle(int[] nums){

        int iterator = 0;


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=1;i<=nums.length-1;i++){

            for (int j=i+1;j<=nums.length-1;j++){
                iterator = 1;
                if(nums[i] == nums[j]){
                    System.out.println("Equal");
                    iterator++;
                    map.put(i,iterator);
                    break;
                }else{
                    map.put(i,iterator);
                }

            }
            if(iterator == 0){
                System.out.println("Single One "+i);
            }
        }

    }
}
