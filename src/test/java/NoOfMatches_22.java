import org.testng.annotations.Test;

public class NoOfMatches_22 {

    @Test
    public void test(){
        int n = 7;
        int output = 6;
        numberOfMatches(n);
    }
    @Test
    public void test2(){
        int n = 14;
        int output = 13;
        numberOfMatches(n);
    }


    public int numberOfMatches(int n) {

        int matches = 0;
        while (n>1){
            if(n%2 ==0){
                n = n/2;
                matches = matches +n;
            }else{
                n = (n-1)/2;
                matches = matches+n;
                n++;

            }

        }
        return matches;
    }
}
