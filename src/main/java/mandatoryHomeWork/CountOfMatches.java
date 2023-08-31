package mandatoryHomeWork;/*
* You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.
*
* Example 1:
Input: n = 7
Output: 6
*
* Example 2:
Input: n = 14
Output: 13
*
* Pseudocode:
* 1. Check if the number of teams is odd or even n%2 ==0
* 2. while n is odd -- matches = (n-1)/2; teams = (n-1)/2 +1
* 3. while n is even -- matches = n/2; teams = n/2
*
* */

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfMatches {

    @Test
    public void test1(){
        int input =7;
        int output =6;
        int matches = numberOfMatches(input);
        Assert.assertEquals(matches, output);
    }

    @Test
    public void test2(){
        int input =14;
        int output =13;
        int matches = numberOfMatches(input);
        Assert.assertEquals(matches, output);
    }

    public int numberOfMatches(int teams){

        int  matches=0;
        while(teams>1){
            if(teams%2 ==0){
                matches = matches+teams/2;
                teams = teams/2;
            }else {
                matches = matches+ ((teams-1)/2);
                teams = ((teams-1)/2) + 1;
            }
        }

        return matches;
    }


}


/*if(n%2 == 0){
        while(n != 1){
        matches = n/2;
        teams = n/2;

        }
        }else{
        while(n != 1) {
        matches = (n-1) / 2;
        teams = ((n-1) / 2)+1;
        }

        }*/
