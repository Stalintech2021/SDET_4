/*
* 1. Given a sorted character array and a target character,
find the next biggest character in the array.

Example:
char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’
Output -> h
* Did I understand the problem -- Yes
*
* Datasets -- As given above
*
* Constraints -- None
*
* Pseudocode: 1. declare char target = 'e';
* 2. Iterate the char array in a for loop
* 3. check if each element of the array is greater than the target
* 4. return the char > target
*
*
*
*
* */


import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggestCharacter {

    @Test
    public void checkGreaterTarget(){

        char target = 'e';
        char[] cha = {'b', 'd' , 'h'};
        char greater = getGreaterTarget(cha,target);
        Assert.assertEquals(greater, 'h');
    }

    public char getGreaterTarget(char[] cha, char target){

        char greater = 0;
        
        for(int i=0;i<cha.length;i++){
            
            if(cha[i] > target){
                greater = cha[i];
            }
            
        }
        
        
        return greater;
    }
}
