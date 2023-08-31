package week2.ClassWork;

import org.testng.annotations.Test;

public class PowerOfTwo {


    @Test
    public void test1(){

        int target = 16;
        checkPower(target);
    }

    public boolean checkPower(int n){

        boolean power = false;
        if(n==1){
            power = true;
        }

        while(n/2 !=0){
            if(n%2 !=1){
                power = false;
            }
            n=n/2;
            if(n%2 == 1){
                power = true;
            }
        }
        return power;
    }
}
