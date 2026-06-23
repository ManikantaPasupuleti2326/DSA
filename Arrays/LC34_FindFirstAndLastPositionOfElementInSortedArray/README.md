# 34. Find First and Last Position of Element in Sorted Array

## Problem Statement

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given target value.

If the target is not found in the array, return `[-1, -1]`.

You must write an algorithm with **O(log n)** runtime complexity.

---

## Example 1

**Input:**

```text
nums = [5,7,7,8,8,10], target = 8
```

**Output:**

```text
[3,4]
```

---

## Example 2

**Input:**

```text
nums = [5,7,7,8,8,10], target = 6
```

**Output:**

```text
[-1,-1]
```

---

## Example 3

**Input:**

```text
nums = [], target = 0
```

**Output:**

```text
[-1,-1]
```

---

## Constraints

* `0 <= nums.length <= 10^5`
* `-10^9 <= nums[i] <= 10^9`
* `nums` is a non-decreasing array.
* `-10^9 <= target <= 10^9`

---

## Approach

1. Use Binary Search to find the first occurrence of the target.
2. Use Binary Search again to find the last occurrence of the target.
3. If the target is not found, return `[-1, -1]`.
4. Otherwise, return `[firstPosition, lastPosition]`.

### First Occurrence

```text
If target is found,
continue searching on the left side
to find its first position.
```

### Last Occurrence

```text
If target is found,
continue searching on the right side
to find its last position.
```

---

## Time Complexity

```text
O(log n)
```

Two binary searches are performed:

```text
O(log n) + O(log n) = O(log n)
```

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
A normal Binary Search stops when
the target is found.

In this problem:

First Position:
Keep searching left after finding target.

Last Position:
Keep searching right after finding target.

This allows us to locate the complete range
of the target in logarithmic time.
```

---

## Interview Insight

```text
This is a classic Binary Search variation.

It is frequently asked by product-based
companies to test understanding of
Binary Search beyond simple searching.

Common pattern:
- First Occurrence
- Last Occurrence
- Lower Bound
- Upper Bound
```
