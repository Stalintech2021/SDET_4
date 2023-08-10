import org.testng.Assert;
import org.testng.annotations.Test;

/*
* Check if the given string has "fizzbuzz"
*
* In an If condition check if the string contains "fizz" && "buzz"
* return true
* In an else-if condition check if the string contains "fizz"
* return true
* In an else-if condition check if the string contains "buzz"
* return true
* else return false
*
* */


public class FizzBuzz {

    String data = "buzz";

    @Test
    public void testFizzBuzz() {

        boolean actual = checkFizzBuzz(data);
        Assert.assertEquals(true, actual);
    }


    public boolean checkFizzBuzz(String data) {

        if (data.contains("fizz") && data.contains("buzz")) {
            System.out.println("The string has FizzBuzz");
            return true;
        } else if (data.contains("fizz")) {
            System.out.println("The string has Fizz");
            return true;
        } else if (data.contains("buzz")) {
            System.out.println("The string has Fizz");
            return true;
        }
        return false;

    }
}
