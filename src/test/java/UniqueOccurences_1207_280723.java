import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.HashMap;

public class UniqueOccurences_1207_280723 {

//    @Test
    public void test1(){
        int[] arr = {1,2,2,1,1,3};
        boolean actual = uniqueOccurrences(arr);
        Assert.assertTrue(actual);
    }
//    @Test
    public void test2(){
        int[] arr = {1,2};
        boolean actual = uniqueOccurrences(arr);
        Assert.assertFalse(actual);
    }
    @Test
    public void test3(){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean actual = uniqueOccurrences(arr);
        Assert.assertTrue(actual);
    }

    public boolean uniqueOccurrences(int[] arr) {
        boolean isUnique = false;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i< arr.length;i++){
            int temp =0;
            for(int j = 0;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    temp++;
                    map.put(arr[i],temp);

                }
            }

        }
        Collection<Integer> nColl = map.values();
        Object[] nArr = nColl.toArray();
        for(int i=0;i<nArr.length-1;i++){
            if(nArr[i] == nArr[i+1]){
                isUnique = false;
            }else{
                isUnique = true;
            }
        }


        return isUnique;
    }



}
