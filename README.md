# Leetcode-Problems
Collection of LeetCode problem solutions with explanations and optimized approaches.

# 1 Two Sum (Java)

Simple Java program to find indices of two numbers in an array that add up to a target.
Input:
nums = [2, 7, 11, 15], target = 9
Output:
[0, 1]
* Uses brute-force (nested loops)
* Time: O(n²), Space: O(1)
* Indices: 0, 1
---------------------------------------------------------
# 121 Buy & Sell Stocks (Java)
This Java program calculates the **maximum profit** from buying and selling a stock given its daily prices.

## Example
Input:
`[10, 7, 5, 8, 11, 9]`
Output:
`6`
( Buy at 5, Sell at 11 )

## Approach
* Track the **minimum buying price** so far
* Calculate profit at each step
* Update maximum profit if higher profit is found

### Complexity
* Time: **O(n)**
* Space: **O(1)**
---------------------------------------------------------
# 🔍 287 Duplicate Finder (Java and Python)

## 📌 Overview
This project demonstrates how to efficiently detect duplicates in an array using a **HashSet (Java)** and **set (Python)**.
The approach ensures optimal performance with **O(n) time complexity**.

## ⚙️ How It Works:
* Traverse the array
* Store elements in a set
* Before inserting, check if the element already exists
* If yes → duplicate found
* 
## 🚀 Java Implementation
Java code is available in the uploaded file!

## 🐍 Python Implementation
```python
def has_duplicate(nums):
    s = set()
    
    for i in range(len(nums)):
        if nums[i] in s:
            return True
        s.add(nums[i])
    
    return False


# Example usage
nums = [1, 2, 3, 1]
print(has_duplicate(nums))
```
## 📊 Complexity Analysis

| Operation        | Complexity |
| ---------------- | ---------- |
| Time Complexity  | O(n)       |
| Space Complexity | O(n)       |

## 💡 Key Concepts:
* HashSet (Java) / set (Python)
* Constant time lookup → O(1)
* Efficient duplicate detection

---------------------------------------------------------
# 238 Product of Array Except Self (Java)

## 📌 Overview
This project implements the classic **"Product of Array Except Self"** problem in Java.
Given an integer array, the goal is to return a new array such that each element at index `i` is the product of all elements in the original array except `arr[i]`.
## 🚀 Example
### Input
```java
arr = {2, 1, 3, 4}
```
### Output
```java
[12, 24, 8, 6]
```
## 🧠 Approach
The solution avoids division and uses two auxiliary arrays:

### 1. Left Product Array
* Stores product of all elements to the **left** of each index

### 2. Right Product Array
* Stores product of all elements to the **right** of each index

### 3. Final Result
* Multiply corresponding values:
```text
result[i] = left[i] * right[i]
```
## ⏱️ Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)

## 💡 Key Concepts
* Prefix products (left array)
* Suffix products (right array)
* Array traversal
* Avoiding division
---------------------------------------------------------
# 53 Kadane’s Algorithm – Maximum Subarray Sum (Java)

## 📌 Overview
This program implements **Kadane’s Algorithm** to find the **maximum sum of a contiguous subarray** in a given integer array.
It efficiently solves the problem in **O(n)** time by iterating through the array only once.

## 🧠 Problem Statement
Given an integer array `arr`, find the contiguous subarray (containing at least one element) which has the **largest sum**, and return that sum.
## 🚀 Approach (Kadane’s Algorithm)

We maintain two variables:
* `cur_sum` → stores the current subarray sum
* `max_sum` → stores the maximum sum found so far

### Steps:

1. Traverse the array.
2. Add each element to `cur_sum`.
3. Update `max_sum` if `cur_sum` is greater.
4. If `cur_sum` becomes negative, reset it to `0`.

## 📊 Example

### Input:
```
[-2, -3, -7, -2, -10, -4]
```
### Output:
```
-2
```
### Explanation:
All numbers are negative, so the maximum subarray is the **least negative number**.

## ⚡ Time & Space Complexity
* **Time Complexity:** O(n)
* **Space Complexity:** O(1)
  
## 🔑 Key Insight
* If the current sum becomes negative, it will only decrease future sums → reset it.
* Always update `max_sum` **before resetting** to handle all-negative arrays.

## 🧪 Try More Test Cases
```
[2, 3, 5, -2, 7, -4] → Output: 15
[-1, 2, 3, -1, 2, -6, 5] → Output: 6
```
---------------------------------------------------------
# 152 Maximum Subarray Product (Java)

## Problem

Find the contiguous subarray with the maximum product.

## Approach

* Traverse left → right and right → left
* Maintain running products
* Reset to `1` when encountering `0`
* Take the maximum from both passes

## Complexity

* Time: O(n)
* Space: O(1)
---------------------------------------------------------
# 📘 153 Find Minimum in Rotated Sorted Array
This Java program finds the **minimum element** in a rotated sorted array using a simple linear scan.

## ⚙️ Approach
- Initialize `min = 0`
- Traverse the array
- Update `min` whenever a smaller element is found

## 🧪 Example
Input:
[4, 5, 6, 7, -7, 1, 2, 3]

Output:
-7

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

## ⚠️ Note
- This is a brute-force approach
- Optimal solution exists using Binary Search (O(log n))

