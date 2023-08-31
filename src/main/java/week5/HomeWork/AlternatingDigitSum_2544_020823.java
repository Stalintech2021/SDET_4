package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlternatingDigitSum_2544_020823 {

    @Test
    public void test1(){
        int n = 521;
        int output = 4;
        int actual = alternateDigitSum(n);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int n = 111;
        int output = 1;
        int actual = alternateDigitSum(n);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test3(){
        int n = 886996;
        int output = 0;
        int actual = alternateDigitSum(n);
        Assert.assertEquals(actual, output);
    }

    public int alternateDigitSum(int n) {

        int sum =0;
        String s = Integer.toString(n);
        String[] st = s.split("");
        for(int i=0;i< st.length;i++){
            if(i %2 ==0){
                sum = sum+Integer.parseInt(st[i]);
            }else{
                sum = sum+(Integer.parseInt(st[i])*-1);
            }
        }
        return sum;
    }
}
