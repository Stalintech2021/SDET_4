package week3.ClassWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShuffleString {

    @Test
    public void test1(){

        String s = "codeleet";
        String output = "leetcode";
        int[] indices = {4,5,6,7,0,2,1,3};
        String actual = checkShuffle(s, indices);
        Assert.assertEquals(actual, output);

    }

    public String checkShuffle(String s, int[] indices){

        String str = "";
        char[] charArray = new char[indices.length];
        for(int i=0;i< indices.length;i++){
            charArray[indices[i]] = s.charAt(i);
        }
        str = String.valueOf(charArray);
        System.out.println(str);
        return str;

    }











}
