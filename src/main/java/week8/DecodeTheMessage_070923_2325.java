package week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DecodeTheMessage_070923_2325 {

    @Test
    public void test1(){

        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String output = "this is a secret";
        String actual = decodeMessage(key, message);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){

        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String output = "the five boxing wizards jump quickly";
        String actual = decodeMessage(key, message);
        Assert.assertEquals(actual, output);

    }

    public String decodeMessage(String key, String message) {

        String str = "";
        key = key.replaceAll(" ", "");
        char[] newKey = key.toCharArray();
        String newStr = "";
        for(int i=0;i<newKey.length;i++){

            String a = String.valueOf(key.charAt(i));
            if(!newStr.contains(a)){
                newStr = newStr+a;
            }

        }
        for(int i=0;i<message.length();i++){

            str = str+Character.toString((char)newStr.indexOf(message.charAt(i))+97);

        }
        str = str.replaceAll("\uD800\uDC60", " ");
        return str;

    }

}
