# Leetcode-Problems
Collection of LeetCode problem solutions with explanations and optimized approaches.

# Two Sum (Java)

Simple Java program to find indices of two numbers in an array that add up to a target.
Input:
nums = [2, 7, 11, 15], target = 9
Output:
[0, 1]
* Uses brute-force (nested loops)
* Time: O(n²), Space: O(1)
* Indices: 0, 1
---------------------------------------------------------
# Buy & Sell Stocks (Java)
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
# 🔍 Duplicate Finder (Java and Python)

## 📌 Overview
This project demonstrates how to efficiently detect duplicates in an array using a **HashSet (Java)** and **set (Python)**.
The approach ensures optimal performance with **O(n) time complexity**.

---
## ⚙️ How It Works:
* Traverse the array
* Store elements in a set
* Before inserting, check if the element already exists
* If yes → duplicate found
---

## 🚀 Java Implementation
Java code is available in the uploaded file!
---
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
---
## 📊 Complexity Analysis

| Operation        | Complexity |
| ---------------- | ---------- |
| Time Complexity  | O(n)       |
| Space Complexity | O(n)       |
---
## 💡 Key Concepts

* HashSet (Java) / set (Python)
* Constant time lookup → O(1)
* Efficient duplicate detection

---------------------------------------------------------
