package mandatoryHomeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
* Check if a given string is an Isogram
* An Isogram is a text in which each letter is distinct i.e a letter does not appear more than one time
* //PSEUDOCODE//
* Convert the String to a charArray
* Traverse through the array with i as the first element of the charArray
* Traverse again with j as the second element of the array
* Compare if int[i] == int[j]
* if Yes -- The given string is not an isogram
* else repeat until both i & j are exhausted
* Then the given string is an isogram
* */

public class CheckIsoGram {

    String data = "isograms" ;

    @Test
    public void checkIsoGram(){

        boolean actual = checkISO(data);
        Assert.assertEquals(true, actual);
    }

    public boolean checkISO(String data){

        char[] dataChar = data.toCharArray();

        for (int i=0;i<dataChar.length;i++){
            for(int j=i+1;j<dataChar.length;j++){
                if(dataChar[i] == dataChar[j]){
                    System.out.println("The given string is not an Isogram");
                    return false;
                }
            }
        }
        return true;
    }
}