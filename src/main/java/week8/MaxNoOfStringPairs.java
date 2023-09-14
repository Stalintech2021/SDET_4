package week8;

/*
* You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:
    The string words[i] is equal to the reversed string of words[j].
    0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.
Note that each string can belong in at most one pair.

Example 1:
Input: words = ["cd","ac","dc","ca","zz"]
Output: 2
* */

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class MaxNoOfStringPairs {
    @Test
    public void test1(){
        String[] words = {"aa", "bb","aa","bb"};
        int expected = 2;
        int actual = maximumNumberOfStringPairs(words);
        Assert.assertEquals(actual, expected);
    }

    public int maximumNumberOfStringPairs(String[] words) {
        int pairCount =0, sumAscii = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i< words.length;i++){
            sumAscii = words[i].charAt(0) + words[i].charAt(1);
            set.add(sumAscii);
            if((set.size()) != (i+1)-pairCount){
                pairCount++;
            }
        }
        return pairCount;
    }
}
