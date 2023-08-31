package mandatoryHomeWork;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros2 {

    @Test
    public void test1(){

        int[] nums = {0,1,0,3,12};
        moveAllZeros(nums);
    }

    public void moveAllZeros(int[] nums){

        int[] input = {2,3,4,5};

        List<Integer> list3 = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){

            if(nums[i] != 0){
                list3.add(nums[i]);
            }
            list3.add(nums[i]);
        }



        Integer[] input2 = Arrays.stream(input).boxed().toArray(Integer[]::new);
        System.out.println(input2);

//        List<Integer> list = Arrays.asList(1,5,7,8);
        List<Integer> list = Arrays.stream(input)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
//        HashSet<Integer> set = new HashSet<Integer>(nums);
        Collections.addAll(list, 2,3,4,5);
        for (int i=0;i<nums.length;i++){

            if(nums[i] != 0){
                list.add(nums[i]);
            }


        }




//        ArrayList<Integer> list = new ArrayList<>();
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
