import org.testng.annotations.Test;

import java.util.Arrays;

public class MissingNumber3 {

    @Test
    public void checkMissing(){

        Integer[] data = {2,4,3,6};
        int missing = checkNumber(data);
        System.out.println("The missing number is "+missing);
    }

    public Integer checkNumber(Integer[] data){

        Arrays.sort(data);

        for(int i=0;i<data.length;i++){

            if(data[i] != i){

                return i;
            }
        }
        return data.length;
    }
}
