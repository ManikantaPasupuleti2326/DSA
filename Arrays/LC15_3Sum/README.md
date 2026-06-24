# 15. 3Sum

## Problem Statement

Given an integer array `nums`, return all the triplets:

```text
[nums[i], nums[j], nums[k]]
```

such that:

* `i != j`
* `i != k`
* `j != k`
* `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

You may return the answer in any order.

---

## Example 1

**Input:**

```text
nums = [-1,0,1,2,-1,-4]
```

**Output:**

```text
[[-1,-1,2],[-1,0,1]]
```

**Explanation:**

```text
(-1) + (-1) + 2 = 0

(-1) + 0 + 1 = 0

The distinct triplets are:
[-1,-1,2]
[-1,0,1]
```

---

## Example 2

**Input:**

```text
nums = [0,1,1]
```

**Output:**

```text
[]
```

**Explanation:**

```text
No triplet sums to 0.
```

---

## Example 3

**Input:**

```text
nums = [0,0,0]
```

**Output:**

```text
[[0,0,0]]
```

**Explanation:**

```text
0 + 0 + 0 = 0
```

---

## Constraints

* `3 <= nums.length <= 3000`
* `-10^5 <= nums[i] <= 10^5`

---

## Approach

### Sorting + Two Pointers

1. Sort the array.
2. Fix one element using a loop.
3. Use two pointers:

   * `left = i + 1`
   * `right = n - 1`
4. Calculate:

```text
sum = nums[i] + nums[left] + nums[right]
```

5. If:

   * `sum == 0` → Add the triplet.
   * `sum < 0` → Move `left`.
   * `sum > 0` → Move `right`.
6. Skip duplicate values to avoid duplicate triplets.
7. Continue until all valid triplets are found.

---

## Why It Works

```text
After sorting:

If sum is too small,
move left pointer to increase the sum.

If sum is too large,
move right pointer to decrease the sum.

This reduces the search space efficiently.
```

---

## Time Complexity

```text
O(n²)
```

### Explanation

```text
Sorting:
O(n log n)

Outer Loop:
O(n)

Two Pointer Search:
O(n)

Overall:
O(n²)
```

---

## Space Complexity

```text
O(1)
```

Ignoring the space required for storing the result.

---

## Key Concept

```text
Sort Array
↓
Fix One Element
↓
Apply Two Pointers
↓
Find Remaining Two Elements
```

---

## Example Walkthrough

### Sorted Array

```text
[-4,-1,-1,0,1,2]
```

### Valid Triplets

```text
[-1,-1,2]

[-1,0,1]
```

---

## Interview Insight

```text
This is one of the most important
Two Pointer problems.

It teaches:

1. Sorting
2. Duplicate Handling
3. Two Pointer Technique
4. Optimization from O(n³) to O(n²)

Frequently asked in:

- Amazon
- Microsoft
- Google
- Meta
- Adobe
```

---

## Related Problems

```text
16. 3Sum Closest
18. 4Sum
167. Two Sum II
1. Two Sum
```
