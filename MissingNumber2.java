import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber2 {

    ArrayList<Integer> data = new ArrayList<Integer>();



    @Test
    public void checkMissingNumber(){

        Integer[] data2 = {2,4,3,6};

        data.add(2);
        data.add(4);
        data.add(3);
        data.add(6);
        System.out.println(data);
        int actual = checkMissing(data2);

    }

    public int checkMissing(Integer[] data2){

        Arrays.sort(data2);
        System.out.println(data2);

        for(int i=0;i<data2.length;i++){
            for(int j=i+1;j<data2.length;j++){

                if(data2[j] == (data2[i])+1){
                    System.out.println("No missing number");
                    break;
                }else {
                    System.out.println("The missing number is "+j);
                    return j;
                }
            }
        }
        return 0;
    }
}
