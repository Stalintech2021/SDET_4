import org.testng.Assert;
import org.testng.annotations.Test;

public class SignOfProductOfArray_1822_030823 {

    /*@Test
    public void test1(){
        int[] nums = {-1,-2,-3,-4,3,2,1};
        int output =1;
        int actual = arraySign(nums);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int[] nums = {1,5,0,2,-3};
        int output =0;
        int actual = arraySign(nums);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){
        int[] nums = {-1,1,-1,1,-1};
        int output =-1;
        int actual = arraySign(nums);
        Assert.assertEquals(actual, output);
    }*/
    //@Test
    public void test4(){
        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int output =-1;
        int actual = arraySign(nums);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test5(){
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int output =-1;
        int actual = arraySign(nums);
        Assert.assertEquals(actual, output);
    }

    public int arraySign(int[] nums) {

        Long sum = 1L;
        int result =0;
        for(int i=0;i< nums.length;i++){
            sum *= nums[i];
        }
        int x = sum.intValue();
        result = signFunc(sum);
        return result;
    }
    public int signFunc(Long x){
        int re =0;
        if(x ==0) re = 0;
        if(x < 0) re = -1;
        if(x > 0) re = 1;
        return re;
    }
}
