package week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Truncate_040923 {

    @Test
    public void test1(){

        String str = "Hello how are you Contestant";
        String actual = truncateSentence(str, 4);
        String expected = "Hello how are you";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2(){

        String str = "What is the solution to this problem";
        String actual = truncateSentence(str, 4);
        String expected = "What is the solution";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test3(){

        String str = "chopper is not a tanuki";
        String actual = truncateSentence(str, 5);
        String expected = "chopper is not a tanuki";
        Assert.assertEquals(actual, expected);
    }


    /*Use the Index of String and use it to solve*/
    @Test
    public void test4(){

        String str = "Sunday";
        String actual = truncateSentence(str, 1);
        String expected = "Sunday";
        Assert.assertEquals(actual, expected);
    }


    public String truncateSentence(String s, int k) {

        if(k ==1){
            return s;
        }

        String str = "";
        String[] splitStr = s.split(" ");
        for(int i=0; i<k;i++){
            str = str + " "+ splitStr[i];
        }
        str = str.trim();

        return str;
    }
}
