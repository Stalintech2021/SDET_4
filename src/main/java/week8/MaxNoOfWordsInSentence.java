package week8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MaxNoOfWordsInSentence {

    @Test
    public void test1(){

        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks so much"};
        int actual = mostWordsFound(sentences);
        int expected = 6;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test2(){

        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int actual = mostWordsFound(sentences);
        int expected = 3;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test3(){

        String[] sentences = {" Jack n jill", "went up the hill"};
        int actual = mostWordsFound(sentences);
        int expected = 4;
        Assert.assertEquals(actual, expected);

    }
    @Test
    public void test4(){

        String[] sentences = {"Humpty dumpty sat", "on a wall "};
        int actual = mostWordsFound(sentences);
        int expected = 3;
        Assert.assertEquals(actual, expected);

    }

    public int mostWordsFound(String[] sentences) {

        int count =0;

        String s = "  chennai";
        s = s.trim();

        List<String> arr = new ArrayList<String>();
        for(int i=0;i<sentences.length;i++){
            //"alice and bob love leetcode"
            if(Character.isWhitespace(sentences[i].charAt(0)) || Character.isWhitespace(sentences[i].charAt(sentences[i].length()-1))){
                continue;
            }
        String[] newAs = sentences[i].split(" ");
        int len = newAs.length;
        if(count < len){
            count = len;
        }

        }
        return count;
    }
}
