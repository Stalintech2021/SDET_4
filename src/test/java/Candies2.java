import org.testng.Assert;
import org.testng.annotations.Test;

public class Candies2 {

    @Test
    public void test1(){

        int[] arr = {1,1,2,3};
        int output = 2;
        int candies = getDistinct(arr);
        Assert.assertEquals(candies, output);
    }
    @Test
    public void test2(){

        int[] arr = {1,1,2,2,3,3};
        int output = 3;
        int candies = getDistinct(arr);
        Assert.assertEquals(candies, output);
    }
    @Test
    public void test3(){

        int[] arr = {6,6,6,6};
        int output = 1;
        int candies = getDistinct(arr);
        Assert.assertEquals(candies, output);
    }

    public int getDistinct(int[] arr){
//        1,1,2,3
        int flag =0;
        int counter =0;
        for(int i=0;i< arr.length;i++){
            flag=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
                if(flag !=0){
                    counter++;
                }
            }
        }
        if(arr.length/2 < counter) {
            return counter;
        }
        return arr.length/2;
//        return counter-1;

    }
}
