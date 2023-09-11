package week8;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckStringAcronym {

    @Test
    public void test1(){
        List<String> words = new ArrayList<String>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        boolean actual = isAcronym(words,s);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){
        List<String> words = new ArrayList<String>();
        words.add("an");
        words.add("apple");
        String s = "a";
        boolean actual=isAcronym(words,s);
        Assert.assertFalse(actual);
    }
    @Test
    public void test3(){
        List<String> words = new ArrayList<String>();
        words.add("never");
        words.add("gonna");
        words.add("give");
        words.add("up");
        words.add("on");
        words.add("you");
        String s = "ngguoy";
        boolean actual=isAcronym(words,s);
        Assert.assertTrue(actual);
    }
    @Test
    public void test4(){
        List<String> words = new ArrayList<String>();
        words.add("bear");
        words.add("aardvark");
        String s = "ab";
        boolean actual=isAcronym(words,s);
        Assert.assertFalse(actual);
    }


    public boolean isAcronym(List<String> words, String s) {

        String newStr = "";
        boolean acr = false;
        for(int i=0;i<words.size();i++){
            newStr = newStr + (words.get(i).charAt(0));
        }
        if(newStr.equals(s)){
            acr=true;
        }else acr = false;
        return acr;

    }
}
