/*
* Pseudocode:
Example 1:

Input: candyType = [1,1,2,2,3,3]
Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

* * 1. Get the candyType as in[]
* 2. n = candyType.length
* 3. candiesOption = n/2
*
* Iterate through for loop for int[i] i=0
* int count = 0;
* Iterate through for loop for int[j] j=i+1
* Check int[i] != int[j]
* count++
*
* */

import org.testng.annotations.Test;

public class Candies {

    @Test
    public void test1(){

//        int[] candyType = {1,1,2,2,3,3};
        int[] candyType = {1,1,2};
        int output = 3;
        int count = getCandyNumber(candyType);
    }

    public int getCandyNumber(int[] candyType){
        int n = candyType.length;
        int[] second = new int[n];
        int in =0;

        for(int i = 0;i<n;i++){
            int count =0;

            for(int j=i+1;j<n;j++){

                if(candyType[i] == candyType[j]){

                    continue;
                }else{
                    second[in] = candyType[i];
                    in++;
                }

            }

        }
        int noOfCandies = second.length/2;
        System.out.println(noOfCandies);


        return 0;
    }
}
