import org.testng.Assert;
import org.testng.annotations.Test;

public class IsThree_1952_090823 {

    @Test
    public void test1(){
        int n =15;
        boolean actual = isThree(n);
        Assert.assertFalse(actual);

    }

    public boolean isThree(int n) {

        int count =0;
        boolean th = false;
        if(n==1 || n==2 || n==3 || n>=10){
            th = false;
        }
        for(int i=1;i<=9;i++){
            if(n%i == 0) count++;
        }
        if (count == 3){
            th = true;
        }else if(count > 3){
            th = false;
        }
        return th;
    }
}
