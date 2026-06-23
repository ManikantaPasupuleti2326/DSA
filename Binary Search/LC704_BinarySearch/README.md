# 704. Binary Search

## Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search for `target` in `nums`.

If `target` exists, return its index. Otherwise, return `-1`.

You must write an algorithm with **O(log n)** runtime complexity.

---

## Example 1

**Input:**

```text
nums = [-1,0,3,5,9,12], target = 9
```

**Output:**

```text
4
```

**Explanation:**

```text
9 exists in nums and its index is 4.
```

---

## Example 2

**Input:**

```text
nums = [-1,0,3,5,9,12], target = 2
```

**Output:**

```text
-1
```

**Explanation:**

```text
2 does not exist in nums, so return -1.
```

---

## Constraints

* `1 <= nums.length <= 10^4`
* `-10^4 < nums[i], target < 10^4`
* All the integers in `nums` are unique.
* `nums` is sorted in ascending order.

---

## Approach

1. Initialize two pointers:

   * `left = 0`
   * `right = nums.length - 1`
2. Find the middle element using:

   * `mid = left + (right - left) / 2`
3. Compare `nums[mid]` with `target`:

   * If equal, return `mid`.
   * If target is greater, search the right half.
   * If target is smaller, search the left half.
4. Repeat until the target is found or the search space becomes empty.
5. Return `-1` if the target is not present.

---

## Time Complexity

```text
O(log n)
```

---

## Space Complexity

```text
O(1)
```
