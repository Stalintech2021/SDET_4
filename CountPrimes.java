import org.testng.Assert;
import org.testng.annotations.Test;

/*
* Given an integer n, return the number of prime numbers that are strictly less than n.
*
* Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*
* Example 2:

Input: n = 0
Output: 0
*
* Example 3:

Input: n = 1
Output: 0
*
* */
public class CountPrimes {

    @Test
    public void test1(){
        int n = 10;
        int output = 4;
        int nCount = countPrimes(n);
        Assert.assertEquals(nCount, output);
    }@Test
    public void test2(){
        int n = 12;
        int output = 5;
        int nCount = countPrimes(n);
        Assert.assertEquals(nCount, output);
    }@Test
    public void test3(){
        int n = 1;
        int output = 0;
        int nCount = countPrimes(n);
        Assert.assertEquals(nCount, output);
    }@Test
    public void test4(){
        int n = 0;
        int output = 0;
        int nCount = countPrimes(n);
        Assert.assertEquals(nCount, output);
    }

    public int countPrimes(int n) {

        if(n==0 || n==1) return 0;
        int nCount =0;
        //check if the number is prime or not
        for(int i=1;i<n-1;i++){
            int nu = i;
            for(int j=2;j<=nu-1;j++){
                if(nu%j ==0){
                    break;
                }else {
                    nCount++;
                    break;
                }
            }

        }



        return nCount+1;
    }

}
