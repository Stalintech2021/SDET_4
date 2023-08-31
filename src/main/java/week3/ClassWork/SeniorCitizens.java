package week3.ClassWork;/*
* You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:

The first ten characters consist of the phone number of passengers.
The next character denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old.


*
*
Example 1:

Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
Output: 2
Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
*
* Pseudocode: 1. Iterate through the String[]
* int count, age
* 2. Get the subString of the element @ 11,13-- typeCast to int
* 3. Verify if age > 60
* 4. count++
* 5. return count
*  */



import org.testng.Assert;
import org.testng.annotations.Test;

public class SeniorCitizens {

    @Test
    public void test1(){

        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int output = 2;
        int actual = getSeniorNumbers(details);
        Assert.assertEquals(actual, output);

    }
    @Test
    public void test2(){

        String[] details = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        int output = 2;
        int actual = getSeniorNumbers(details);
        Assert.assertEquals(actual, output);

    }


    public int getSeniorNumbers(String[] details){

        int count =0;
//        int age =0;
        int age =0;
        String str ="";
        for(int i=0;i<details.length;i++){

            str = details[i].substring(11,13);
            age = Integer.parseInt(str);
//            age = '1'-'0';
            if(age > 60) count++;

        }

        return count;
    }


}
