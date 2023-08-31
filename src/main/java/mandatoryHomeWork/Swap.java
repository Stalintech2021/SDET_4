package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Swap {

    @Test
    public void test1(){
        int[] arr = {0,1,0,3,12};
        int[] output = {1,3,12,0,0};
        int[] actual = checkSwap(arr);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int[] arr = {0};
        int[] output = {0};
        int[] actual = checkSwap(arr);
        Assert.assertEquals(actual, output);
    }
    public int[] checkSwap(int[] arr){

        if(arr.length == 1 && arr[0] == 0){
            return arr;

        }

        for(int i=0;i< arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                if(arr[i] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

}
