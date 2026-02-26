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

2)Problem
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






