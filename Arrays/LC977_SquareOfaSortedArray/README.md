# 977. Squares of a Sorted Array

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, return an array containing the **squares of each number**, also sorted in **non-decreasing order**.

### Example 1

**Input**

```text
nums = [-4,-1,0,3,10]
```

**Output**

```text
[0,1,9,16,100]
```

**Explanation**

```text
Original Array : [-4,-1,0,3,10]
Squared Array  : [16,1,0,9,100]
Sorted Result  : [0,1,9,16,100]
```

---

### Example 2

**Input**

```text
nums = [-7,-3,2,3,11]
```

**Output**

```text
[4,9,9,49,121]
```

---

## Constraints

* `1 <= nums.length <= 10⁴`
* `-10⁴ <= nums[i] <= 10⁴`
* `nums` is sorted in non-decreasing order.

---

# Approach 1: Brute Force

## Algorithm

1. Traverse the array.
2. Square every element.
3. Sort the squared array.
4. Return the sorted array.

## Time Complexity

```text
O(n log n)
```

Sorting dominates the complexity.

## Space Complexity

```text
O(1)
```

(If sorting is performed in-place.)

---

# Approach 2: Optimal (Two Pointers)

## Intuition

The input array is already sorted.

Example:

```text
[-7,-3,-1,2,5,9]
```

After squaring:

```text
[49,9,1,4,25,81]
```

The **largest square** always comes from either:

* The leftmost negative number, or
* The rightmost positive number.

Therefore:

* Compare the absolute values at both ends.
* Place the larger square at the end of the result array.
* Move the corresponding pointer inward.
* Repeat until all elements are processed.

---

## Algorithm

1. Initialize two pointers:

   * `left = 0`
   * `right = n - 1`
2. Create a result array of size `n`.
3. Start filling the result array from the last index.
4. Compare the absolute values at both pointers.
5. Store the larger square.
6. Move the corresponding pointer.
7. Decrease the result index.
8. Repeat until the pointers cross.
9. Return the result array.

---

# Dry Run

## Input

```text
[-4,-1,0,3,10]
```

| Left | Right | Compare | Stored | Result         |
| ---- | ----- | ------- | ------ | -------------- |
| -4   | 10    | 4 < 10  | 100    | [0,0,0,0,100]  |
| -4   | 3     | 4 > 3   | 16     | [0,0,0,16,100] |
| -1   | 3     | 1 < 3   | 9      | [0,0,9,16,100] |
| -1   | 0     | 1 > 0   | 1      | [0,1,9,16,100] |
| 0    | 0     | Equal   | 0      | [0,1,9,16,100] |

**Final Output**

```text
[0,1,9,16,100]
```

---

# Why Compare Absolute Values?

Negative numbers become positive after squaring.

Example:

```text
(-8)² = 64
 8²  = 64
```

Therefore, comparing absolute values helps determine which number produces the larger square.

---

# Why Fill the Result Array from the End?

At every step, the **largest remaining square** is known.

Example:

```text
[-5,-2,1,4]
```

The largest square is:

```text
25
```

Since it belongs at the end of the sorted result, we fill the result array from **right to left**.

---

# Complexity Analysis

| Approach     | Time Complexity | Space Complexity |
| ------------ | --------------: | ---------------: |
| Brute Force  |      O(n log n) |             O(1) |
| Two Pointers |            O(n) |             O(n) |

---

# Key Concepts Learned

* Arrays
* Two Pointer Technique
* Absolute Value Comparison
* Sorted Arrays
* Time Complexity Optimization
* Space-Time Tradeoff

---

# Interview Tips

### Why can't we simply square the numbers?

Squaring changes the order of negative numbers.

Example:

```text
[-5,-3,-1]
```

becomes

```text
[25,9,1]
```

which is no longer sorted.

---

### Why use Two Pointers?

Since the array is already sorted, the largest square can only come from one of the two ends. By comparing both ends and filling the result array from the back, we achieve a linear-time solution without sorting.

---

# Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

---

# Tags

* Arrays
* Two Pointers
* Sorting
* LeetCode Easy
