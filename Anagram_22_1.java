import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Anagram_22_1 {

    @Test
    public void test1(){
        String s = "anagram";
        String t = "nagaram";
        boolean actual = isAnagram(s,t);
        Assert.assertTrue(actual);
    }
    @Test
    public void test2(){
        String s = "rat";
        String t = "car";
        boolean actual = isAnagram(s,t);
        Assert.assertFalse(actual);
    }

    public boolean isAnagram(String s, String t) {

        boolean anagram = false;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);

        }
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        anagram = Arrays.equals(ch,ch2);

        return anagram;
    }
}
