package week5.HomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ColorOfChessboard {

    @Test
    public void test1(){

        String s = "a1";
        boolean actual =  squareIsWhite(s);
        Assert.assertFalse(actual);
    }
    @Test
    public void test2(){

        String s = "h3";
        boolean actual =  squareIsWhite(s);
        Assert.assertTrue(actual);
    }
    @Test
    public void test3(){

        String s = "c7";
        boolean actual =  squareIsWhite(s);
        Assert.assertFalse(actual);
    }

    public boolean squareIsWhite(String coordinates) {
        boolean isWhite = false;
        int sum =0;
        String[] s = coordinates.split("");
        sum = (s[0].charAt(0)-'a'+1) + Integer.parseInt(s[1]);
        if(sum % 2 != 0){
            isWhite = true;
        }
        return isWhite;
    }
}

/*HashMap<String, String> map = new HashMap<String, String>();
        map.put(s[0], s[1]);
        sum = charAtmap.keySet()*/
