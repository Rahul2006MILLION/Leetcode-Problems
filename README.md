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

BRUTE FORCE METHOD TAKES n^2 TIME COMPLEXITY SO WE USE HASHMAP<> TO SOLVE THIS 

## 📌 Problem
Find two indices such that:
```
arr[i] + arr[j] = target
```
## 🚀 Approach (HashMap / Dictionar)
* Store: `number → index`
* For each element:
  * Compute `y = target - arr[i]`
  * If `y` exists → return indices
  * Else → store current element
## ✅ Code
```python
def twoSum(arr, target):
    mp = {}

    for i in range(len(arr)):
        y = target - arr[i]

        if y in mp:
            return [mp[y], i]

        mp[arr[i]] = i

    return []
```

## ⏱ Complexity
* Time: O(n)
* Space: O(n)

## 💡 Key Idea
> Check first → then insert
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
---------------------------------------------------------
# 🔍 Search in Rotated Sorted Array (Basic Approach)

## 📌 Overview
This program searches for a target element in a rotated sorted array using a **linear search approach**.
A rotated sorted array is an array that was originally sorted but then shifted (rotated) at some pivot point.
**Example:**
```
Original: [0,1,2,4,5,6,7]
Rotated:  [4,5,6,7,0,1,2]
```
## ⚙️ Approach Used
This implementation uses a **simple linear scan**:

1. Traverse the array from start to end.
2. Compare each element with the target.
3. If found → return the index.
4. If not found → return `-1`.
   
## 🧠 Logic
* Loop through the array
* Check:
  ```
  if(arr[i] == target)
  ```
* Return index immediately when found
* If loop ends → target does not exist

## ⏱️ Time & Space Complexity
| Metric | Value |
| ------ | ----- |
| Time   | O(n)  |
| Space  | O(1)  |

## ✅ Example
**Input:**
```
nums = [4,5,6,7,0,1,2]
target = 1
```
**Output:**
```
5
```

## ⚠️ Note

* This is a **brute-force approach**
* It does **not utilize the sorted + rotated property**
* Optimal solution uses **Binary Search (O(log n))**

## 🚀 When to Use

* Small datasets
* When simplicity matters more than performance
* For learning / debugging purposes


## 💡 Key Takeaway
> This solution works correctly but is not optimal.
> The real challenge is solving it using binary search on a rotated array.
---------------------------------------------------------
# 🧩 3Sum Problem (Hashing Approach)
## 📌 Problem
Given an integer array `nums`, return all **unique triplets** `[a, b, c]` such that:
```
a + b + c = 0
```
## 🚀 Approach: Hashing (Set-Based 2Sum inside 3Sum)
Instead of using brute force `O(n³)`, we optimize to **O(n²)** by:
1. Fixing one element (`nums[i]`)
2. Solving a **2Sum problem** for the remaining elements using a set
## 🧠 Core Idea

For each `i`, we want:
```
nums[i] + nums[j] + third = 0
```
Rearrange:
```
third = -(nums[i] + nums[j])
```
Now the task becomes:
> Check if `third` already exists in previously seen elements

## ✅ Code

```python
def threeSum(self, nums: list[int]) -> list[list[int]]:
    st = set()

    for i in range(len(nums)):
        hset = set()

        for j in range(i + 1, len(nums)):
            third = -(nums[i] + nums[j])

            if third in hset:
                temp = [nums[i], nums[j], third]
                temp.sort()
                st.add(tuple(temp))

            hset.add(nums[j])

    return [list(x) for x in st]
```
## 🔁 Loop Breakdown
### 🔹 Outer Loop (`i`)
* Fixes one element
* Converts problem into **2Sum**

### 🔹 Inner Loop (`j`)
* Iterates over remaining elements
* Uses `hset` to track seen values

## 📦 Why `hset` is inside the loop?
```python
for i:
    hset = set()
```
Each `i` creates a **new 2Sum problem**, so:

* We need a **fresh set**
* Prevent mixing values from previous iterations

## ⚡ Why use a Set (`hset`)?
Set provides:
* **O(1) lookup time**

This avoids:
* Nested loops → reduces complexity from `O(n³)` → `O(n²)`

## 🔒 Why convert list → tuple?
```python
st.add(tuple(temp))
```
## ❌ Lists cannot be added to a set
* Lists are **mutable**
* Sets require **immutable (hashable)** elements
### ✅ Tuples are allowed
* Tuples are **immutable**
* Can be stored in a set

## 🔁 Why sort before adding?
```python
temp.sort()
```
Ensures:
```
[-1, 0, 1] == [0, -1, 1]
```
Without sorting:
* Duplicate triplets would be stored differently
## 📤 Why convert tuple → list in return?
```python
return [list(x) for x in st]
```
Because:
* Problem expects `List[List[int]]`
* But we stored results as `set[tuple]` for uniqueness
## 📊 Example
Input:
```
nums = [-1, 0, 1, 2, -1, -4]
```
Output:
```
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```

## ⏱ Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n²)      |
| Space | O(n)       |

## 🎯 Key Takeaways
* Convert 3Sum → multiple 2Sum problems
* Use `set` for fast lookup
* Use `tuple` for storing unique triplets
* Sort triplets to avoid duplicates

🧠 One-Line Summary Java Program

This solution uses Java’s `HashSet` to optimize the 3Sum problem from O(n³) to O(n²) by reducing it to multiple 2Sum problems. For 
each element `nums[i]`, we create a new `HashSet<Integer>` to track seen values and compute the required third value using `third =
(nums[i] + nums[j])`. The `set.contains(third)` operation provides O(1) lookup, making the approach efficient. To avoid duplicate 
triplets, we store results in a `Set<List<Integer>>`, ensuring uniqueness automatically. Before adding, we sort each triplet using 
`Arrays.sort()` so that different permutations map to the same representation. Since Java sets cannot store primitive arrays directly 
for uniqueness, we convert the sorted array into a list using `Arrays.asList()`. The inner `HashSet` is reinitialized for every `i` to 
ensure independent 2Sum computations. This approach leverages Java Collections Framework features like `HashSet`, `List`, and utility 
methods from `Arrays` for clean and efficient implementation.
---------------------------------------------------------

## 📌 Container With Most Water (Java)
This program solves the "Container With Most Water" problem using the two-pointer approach.

<img width="1066" height="561" alt="Screenshot 2026-04-07 at 23 15 02" src="https://github.com/user-attachments/assets/cccdf3b1-cfaa-4cd6-b778-8bb6e5542dc4" />

### 🧠 Approach
- Start with two pointers:
  - `left = 0` (beginning)
  - `right = n - 1` (end)
- Calculate area using:
  - width = right - left
  - height = min(arr[left], arr[right])
  - area = width * height
- Update maximum area.
- Move the pointer pointing to the smaller height:
  - If arr[left] < arr[right] → left++
  - Else → right--
- Repeat until left < right.

### ⏱️ Time Complexity
- O(n) → each element is visited at most once.
### 💾 Space Complexity
- O(1) → no extra space used.

### 🚀 Key Idea
Always move the smaller height pointer because the area is limited by the shorter line, and moving the taller one won’t help increase the area.
