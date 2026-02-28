# Leetcode-Problems
A curated collection of LeetCode solutions implemented in Java with clean logic, edge-case handling, and structured explanations.

At the very beginning I am going to solve basic problems! which might help you to solve leetcode problems!

1)Problem
Return the total number of digits in a given integer n.
Approach
If n == 0, return 1.
Otherwise, repeatedly divide the number by 10 and count how many times it can be divided until it becomes 0.
Time Complexity
O(log₁₀ n)
Space Complexity
O(1)

---------------------------------------------------------

2)Problem Reverse a number 
Description
This function reverses the digits of a given positive integer using mathematical operations.
Logic
Extract last digit using % 10
Remove last digit using / 10
Build reverse using reverse = reverse * 10 + digit
Input: 1234
Output: 4321
Complexity
Time: O(d)
Space: O(1)


---------------------------------------------------------
3)Palindrome Number Check
Description
This function checks whether a given integer is a palindrome. A palindrome number reads the same forward and backward.
Logic
Store the original number
Reverse the number using % and /
Compare original and reversed numbers
If equal → palindrome, else → not palindrome
Input: 121
Output: true
Input: 123
Output: false
Complexity
Time: O(d)
Space: O(1)

---------------------------------------------------------
4) Armstrong Number Checker (Java)
An Armstrong number is a number equal to the sum of its digits raised to the power of the number of digits.
153 = 1³ + 5³ + 3³ = 153
Logic
  1. Count digits using while loop.
  2. Extract each digit using `% 10`.
  3. Calculate power using:
   * `Math.pow(digit, count)` or
   * for loop (multiply digit count times)
  4. Add results and compare with original number.
  ## Math.pow()
Built-in Java function to calculate power:
sum += (int)Math.pow(digit, count);
for loop method
Alternative without Math.pow():
power = 1;
for(int i=0;i<count;i++)
    power *= digit;
## Time Complexity
Let d = number of digits
Math.pow() method → O(d)
for loop method → O(d²)

---------------------------------------------------------







