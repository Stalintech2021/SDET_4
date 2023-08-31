package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DividingNumbers_728_310723 {


    @Test
    public void test1(){

        int left = 47;
        int right = 85;
        List<Integer> output = new ArrayList<>(Arrays.asList(48,55,66,77));
        List<Integer> actual = selfDividingNumbers(left, right);
        System.out.println(actual);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){

        int left = 1;
        int right = 22;
        List<Integer> output = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22));
        List<Integer> actual = selfDividingNumbers(left, right);
        System.out.println(actual);
        Assert.assertEquals(actual, output);
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<Integer>();
        boolean b = false;
        for (int i=left;i<=right;i++){
            String s = Integer.toString(i);
            if(s.length() == 1){
                list.add(i);
            }else{
                String[] sh = s.split("");

                try {
                    for (int j = 0; j < sh.length; j++) {
                        if (i % Integer.parseInt(sh[j]) == 0) {
                            b = true;
                        } else {
                            b = false;
                            break;
                        }

                    }
                    if (b == true) {
                        list.add(i);
                    }
                }catch (ArithmeticException e){
                    continue;
                }
            }
        }return list;
    }
}
