package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusTwo {

    @Test
    public void test1(){
        int[] input = {1, 2, 3};
        int output = 2;
        int count = getPlusOne(input);
        Assert.assertEquals(count, output);

    }
    @Test
    public void test2(){
        int[] input = {1, 1, 3, 3, 5, 5, 7, 7};
        int output = 0;
        int count = getPlusOne(input);
        Assert.assertEquals(count, output);

    }
    @Test
    public void test3(){
        int[] input = {1, 1, 2};
        int output = 1;
        int count = getPlusOne(input);
        Assert.assertEquals(count, output);

    }

    public int getPlusOne(int[] input){

        int count = 0;

        for(int i=0;i<input.length-1;i++){
            if(input[i]+1 == input[i+1]){
                count++;

            }

        }

        return count;
    }
}
