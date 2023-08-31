package mandatoryHomeWork;

import org.testng.annotations.Test;

public class ArrangeCoins_25 {
    @Test
    public void test1(){
        int coins = 8;
        checkWays(coins);
    }

    public int checkWays(int coins){

        int steps =0;
        if(coins == 1)return 1;

        for(int i=2;i<steps;i++){
            steps = (coins-i);
            coins--;
        }


        return steps;
    }

}
