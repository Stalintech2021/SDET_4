import org.testng.Assert;
import org.testng.annotations.Test;

/*
* Check if a given string is an Isogram
* Covert the string to charArray
* Traverse therough the array and consider the element i
* Traverse through the sub-array and consider the element j
* check if the element i == j
* if Yes, the string is not an Isogram
* if No move to the next element j
* Exhaust the elements of j
* Exhaust the elements of i
* If still no matches the given string is an Isogram
* */

public class IsoGram {

    @Test
    public void checkIfIsogram(){

    boolean iso = checkIso("news");
        Assert.assertTrue(iso);
    }

    public boolean checkIso(String input){

        char[] data = input.toCharArray();
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i] == data[j]){

                    return false;
                }
            }
        }return true;


    }
}
