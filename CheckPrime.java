import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPrime {

    @Test
    public void test1(){

        int num =5;
        boolean isPrime = checkPrime(num);
        Assert.assertTrue(isPrime);

    }

    @Test
    public void test2(){

        int num =6;
        boolean isPrime = checkPrime(num);
        Assert.assertFalse(isPrime);

    }

    public boolean checkPrime(int num){

        boolean s = true;
        for(int i=2;i<num;i++){
            if(num % i == 0){
                s=false;
            }
        }
        return s;
    }
}
