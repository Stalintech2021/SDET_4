/*
*
* Did we understand the problem -- Yes
*
* Datasets -- As given in the problem
* 121, -121, 10
*
* Pseudocode:
* * 1. Check if the no is < 10
* 2. If n >10, apply palindrome logic
* * 3. declare int reverse, int y
* 4. Consider 121
* 5.  get the input
* 6. while n > 0
* 7. y = n%10 = 1 2 1
*8. n=n/10 = 12 1
*9 1%10=1
* 10
* reverse =0
* while n>0
reverse=(n%10)+reverse*10
n=n/10
* */


import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeNumber {

    @Test
    public void test1(){

        int n = 121;
        boolean reverse = checkPalindrome(n);
        Assert.assertTrue(reverse);
    }

    @Test
    public void test2(){

        int n = -121;
        boolean reverse = checkPalindrome(n);
        Assert.assertFalse(reverse);
    }

    @Test
    public void test3(){

        int n = 10;
        boolean reverse = checkPalindrome(n);
        Assert.assertFalse(reverse);
    }

    public boolean checkPalindrome(int n){

        int reverse = 0;
        int y=n;
        while (n>0){
            reverse=(n%10)+reverse*10;
            n=n/10;
        }
        if(y == reverse){
            return true;
        }

        return false;
    }
}
