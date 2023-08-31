package mandatoryHomeWork;/*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*
* Example 1:

Input: nums = [-4,-1,0,3,10]
* [16,1,0,9,100]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
*
* Understood -- Yes
* Dataset -- as given
*
* Pseudocode:1. Get the array nums
* 2. declare a int temp vaiable
* 3. Iterate in a for loop
* 4. temp = num[i]*nums[i]
* 5. nums[i] = temp; exit for loop
* 6. Iterate in a for loop int i
* 7. Iterate in a for loop int j=i+1
* 8. if num[i]>num[j]
* 9. temp = nums[i]
* 10. nums[i] = nums[j]
* 11. nums[j] = temp
*
*
* */

public class SortedSquares {
}
