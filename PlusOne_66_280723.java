import org.testng.Assert;
import org.testng.annotations.Test;

public class PlusOne_66_280723 {

    @Test
    public void test1(){
        int[] digits = {1,2,3};
        int[] output = {1,2,4};
        int[] actual = plusOne(digits);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){
        int[] digits = {4,3,2,1};
        int[] output = {4,3,2,2};
        int[] actual = plusOne(digits);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test3(){
        int[] digits = {9};
        int[] output = {1,0};
        int[] actual = plusOne(digits);
        Assert.assertEquals(actual, output);

    }
    public int[] plusOne(int[] digits) {
        Long res = Long.MAX_VALUE;
        String s = "";
        for(int i=0;i< digits.length;i++){
            s=s+Integer.toString(digits[i]);
        }
        res = Long.parseLong(s);
        res++;
        String[] str = new String[digits.length];
        str = Long.toString(res).split("");
        if(str.length > digits.length){
            int[] out = new int[digits.length+1];
            for(int i=0;i< str.length;i++){
                out[i] = Integer.parseInt(str[i]);
            }
            return out;
        }else{
            int[] out = new int[digits.length];
            for(int i=0;i< str.length;i++){
                out[i] = Integer.parseInt(str[i]);
            }
            return out;
        }

    }
}






/*
* String s = "";
        Long res =Long.MAX_VALUE;
        for(int i=0;i<digits.length;i++) {
            s = s+Integer.toString(digits[i]);

//            res = res * 10 + digits[i];

        }
        res = Long.parseLong(s);
        res++;
        String[] str = new String[digits.length];
        str = Long.toString(res).split("");
        if(str.length > digits.length){
            int[] arr = new int[digits.length+1];
            for (int i=0;i<str.length;i++){
                arr[i] = Integer.parseInt(str[i]);
            }return arr;
        }else {
            int[] arr = new int[digits.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }return arr;
        }
*
*
*
* */

/*String s = "";
        for(int i=0;i< digits.length;i++){
            s = s+Integer.toString(digits[i]);
        }
        System.out.println(s);
//        int sum = Integer.parseInt(s);
        Long sum = Long.parseLong(s);
        sum++;
        s= Long.toString(sum);
        char[] ch = s.toCharArray();
        int[] plus = new int[s.length()];
        for(int i=0;i< ch.length;i++){
            plus[i] = Character.getNumericValue(ch[i]);
        }
        return plus;
*
* */
