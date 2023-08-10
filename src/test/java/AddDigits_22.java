import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDigits_22 {

    @Test
    public void test1(){
        int num = 38;
        int output = 2;
        int actual = addDigits(num);
        Assert.assertEquals(actual, output);
    }
    @Test
    public void test2(){
        int num = 10;
        int output = 1;
        int actual = addDigits(num);
        Assert.assertEquals(actual, output);
    }

    public int addDigits(int num) {

        if(num <10){
            return num;
        }
        while (num >=10){
            num = (num/10) + (num%10);

        }
        return num;
    }
}
