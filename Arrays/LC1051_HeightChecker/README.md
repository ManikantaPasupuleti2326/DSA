# 1051. Height Checker

## Problem Statement

A school wants students to stand in **non-decreasing order of height** for the annual photograph.

You are given an integer array **heights**, which represents the current order of students.

Your task is to determine **how many students are not standing in the positions they would occupy if the array were sorted in non-decreasing order**.

Return the number of indices where:

**`heights[i] != expected[i]`**

where **expected** is the sorted version of the original array.

---

# Examples

## Example 1

**Input**

```text
heights = [1,1,4,2,1,3]
```

**Expected Order**

```text
[1,1,1,2,3,4]
```

Comparison:

| Index | Current | Expected | Match |
| ----: | ------: | -------: | :---: |
|     0 |       1 |        1 |   ✅   |
|     1 |       1 |        1 |   ✅   |
|     2 |       4 |        1 |   ❌   |
|     3 |       2 |        2 |   ✅   |
|     4 |       1 |        3 |   ❌   |
|     5 |       3 |        4 |   ❌   |

**Output**

```text
3
```

---

## Example 2

**Input**

```text
heights = [5,1,2,3,4]
```

**Expected Order**

```text
[1,2,3,4,5]
```

Every position is different.

**Output**

```text
5
```

---

## Example 3

**Input**

```text
heights = [1,2,3,4,5]
```

**Expected Order**

```text
[1,2,3,4,5]
```

All positions match.

**Output**

```text
0
```

---

# Approach 1: Sorting

## Idea

1. Create a copy of the original array.
2. Sort the copied array.
3. Compare the original array with the sorted array.
4. Count the number of positions where the elements differ.
5. Return the count.

---

# Algorithm

1. Copy the original array.
2. Sort the copied array in non-decreasing order.
3. Initialize a counter to **0**.
4. Traverse both arrays.
5. If the values at the same index are different, increment the counter.
6. Return the final count.

---

# Dry Run

### Input

```text
heights = [1,1,4,2,1,3]
```

### Step 1

Original

```text
[1,1,4,2,1,3]
```

Sorted Copy

```text
[1,1,1,2,3,4]
```

### Step 2

Compare each index.

| Index | Original | Sorted |   Result  |
| ----: | -------: | -----: | :-------: |
|     0 |        1 |      1 |    Same   |
|     1 |        1 |      1 |    Same   |
|     2 |        4 |      1 | Different |
|     3 |        2 |      2 |    Same   |
|     4 |        1 |      3 | Different |
|     5 |        3 |      4 | Different |

Mismatch Count

```text
3
```

Return

```text
3
```

---

# Optimized Approach: Counting Sort

## Why Counting Sort?

The constraints specify:

* **1 ≤ heights[i] ≤ 100**

Since the range of values is very small, Counting Sort is more efficient than comparison-based sorting.

### Steps

1. Find the maximum height.
2. Create a frequency (count) array.
3. Count the occurrences of each height.
4. Reconstruct the sorted order using the count array.
5. Compare it with the original array and count mismatches.

---

# Time Complexity

## Sorting Approach

* Copy Array: **O(n)**
* Sort Array: **O(n log n)**
* Compare Arrays: **O(n)**

**Overall Time Complexity**

```text
O(n log n)
```

---

## Counting Sort Approach

* Count Frequencies: **O(n)**
* Reconstruct Sorted Order: **O(n + k)**
* Compare Arrays: **O(n)**

Where:

* **n** = Number of students
* **k** = Maximum height value (≤ 100)

Since **k** is a constant (100),

**Overall Time Complexity**

```text
O(n)
```

---

# Space Complexity

## Sorting Approach

Extra copy of the array:

```text
O(n)
```

---

## Counting Sort Approach

Frequency array of size **101**:

```text
O(k)
```

Since **k = 100**, this is effectively **constant extra space**.

---

# Key Concepts Used

* Array Traversal
* Sorting
* Counting Sort
* Frequency Array
* Array Comparison

---

# Edge Cases

* Array already sorted.
* Array completely unsorted.
* All elements are the same.
* Only one student.
* Duplicate heights.
* Maximum allowed height values.

---

# Interview Takeaways

* The expected order is simply the **sorted version** of the original array.
* Count only the positions where the original and sorted arrays differ.
* Always check the constraints before choosing a sorting algorithm.
* Because the height values are limited to **1–100**, Counting Sort is the optimal solution with **O(n)** time complexity.
* When the value range is small and fixed, a frequency array is often more efficient than comparison-based sorting.

---

# Summary

The **Height Checker** problem compares the current arrangement of students with their sorted arrangement and counts the number of mismatched positions.

* **Sorting Approach:** Simple and intuitive with **O(n log n)** time.
* **Counting Sort Approach:** Optimal for the given constraints with **O(n)** time.

This problem is an excellent example of choosing an algorithm based on the input constraints rather than using a general-purpose sorting algorithm in every situation.
