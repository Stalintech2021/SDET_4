import org.testng.annotations.Test;

public class MoneyInLeetCodeBank_1716_020823_2 {

    @Test
    public void test1(){

        totalMoney(10);
    }
    public int totalMoney(int n) {

        int ans =0;
        for(int i=0;i<n;i++){
            ans += (i/7) +1 + (i%7);
        }
        return ans;
    }
}
