import org.testng.annotations.Test;

public class DigitsFromInteger {

    @Test
    public void test1(){
        int n = 11022;
        int actual = getDigits(n);
        System.out.println(actual);
    }

    public int getDigits(int n){

        int reminder;
        while(n > 9){
            reminder = n%10;

            n = n/10;
        }return n;
    }
}
