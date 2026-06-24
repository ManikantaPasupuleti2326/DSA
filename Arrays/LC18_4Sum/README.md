# 18. 4Sum

## Problem Statement

Given an array `nums` of `n` integers, return an array of all the unique quadruplets:

```text
[nums[a], nums[b], nums[c], nums[d]]
```

such that:

* `0 <= a, b, c, d < n`
* `a`, `b`, `c`, and `d` are distinct.
* `nums[a] + nums[b] + nums[c] + nums[d] == target`

You may return the answer in any order.

---

## Example 1

**Input:**

```text
nums = [1,0,-1,0,-2,2]
target = 0
```

**Output:**

```text
[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

---

## Example 2

**Input:**

```text
nums = [2,2,2,2,2]
target = 8
```

**Output:**

```text
[[2,2,2,2]]
```

---

## Constraints

* `1 <= nums.length <= 200`
* `-10^9 <= nums[i] <= 10^9`
* `-10^9 <= target <= 10^9`

---

## Approach

### Sorting + Two Pointers

1. Sort the array.
2. Fix the first element using a loop.
3. Fix the second element using another loop.
4. Use two pointers:

   * `left = j + 1`
   * `right = n - 1`
5. Calculate:

```text
nums[i] + nums[j] + nums[left] + nums[right]
```

6. If the sum equals the target:

   * Add the quadruplet to the result.
   * Skip duplicate values.
7. If the sum is smaller than the target:

   * Move `left`.
8. If the sum is larger than the target:

   * Move `right`.
9. Continue until all unique quadruplets are found.

---

## Why It Works

```text
Sorting allows us to efficiently
use the Two Pointer technique.

After fixing two numbers,
the remaining two numbers can be found
using a linear search with two pointers.
```

---

## Time Complexity

```text
O(n³)
```

### Explanation

```text
First Loop  → O(n)

Second Loop → O(n)

Two Pointer Search → O(n)

Total:
O(n × n × n)
=
O(n³)
```

---

## Space Complexity

```text
O(1)
```

Ignoring the space used for storing the result.

---

## Key Concept

```text
4Sum = 2 Fixed Elements
     + Two Pointer Search

Sort Array
↓
Fix i
↓
Fix j
↓
Apply Two Pointers
```

---

## Example Walkthrough

### Input

```text
nums = [1,0,-1,0,-2,2]
target = 0
```

### Sorted Array

```text
[-2,-1,0,0,1,2]
```

### Valid Quadruplets

```text
[-2,-1,1,2]
[-2,0,0,2]
[-1,0,0,1]
```

---

## Interview Insight

```text
This problem is an extension of:

15. 3Sum

The approach remains similar:

Sort Array
+
Two Pointers

The only difference is that
two elements are fixed instead of one.
```

---

## Related Problems

```text
15. 3Sum
16. 3Sum Closest
167. Two Sum II
1. Two Sum
```
