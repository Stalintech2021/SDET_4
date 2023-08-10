import org.testng.Assert;
import org.testng.annotations.Test;

public class Anagram_242_290723 {

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
        int[] n = new int[26];
        for(int i=0;i<s.length();i++){
            n[s.charAt(i)-'a']++;
        }

        for(int j=0;j<t.length();j++){
            n[t.charAt(j)-'a']--;
        }
        for(int i=0;i<t.length();i++){
            if(n[i] ==0){
                anagram = true;
            }else{
                anagram = false;
            }
        }return anagram;

    }
}
