# 35. Search Insert Position

## Problem Statement

Given a sorted array of distinct integers `nums` and a target value `target`, return the index if the target is found.

If not, return the index where it would be inserted in order.

You must write an algorithm with **O(log n)** runtime complexity.

---

## Example 1

**Input:**

```text
nums = [1,3,5,6]
target = 5
```

**Output:**

```text
2
```

**Explanation:**

```text
Target 5 exists in the array at index 2.
```

---

## Example 2

**Input:**

```text
nums = [1,3,5,6]
target = 2
```

**Output:**

```text
1
```

**Explanation:**

```text
Target 2 does not exist.

It should be inserted between
1 and 3 at index 1.
```

---

## Example 3

**Input:**

```text
nums = [1,3,5,6]
target = 7
```

**Output:**

```text
4
```

**Explanation:**

```text
Target 7 is greater than all elements.

It should be inserted at the end
of the array at index 4.
```

---

## Constraints

* `1 <= nums.length <= 10^4`
* `-10^4 <= nums[i] <= 10^4`
* `nums` contains distinct values sorted in ascending order.
* `-10^4 <= target <= 10^4`

---

## Approach

### Binary Search

1. Initialize:

   * `left = 0`
   * `right = nums.length - 1`
2. Perform Binary Search:

   * Calculate `mid`.
   * If `nums[mid] == target`, return `mid`.
   * If `nums[mid] < target`, search the right half.
   * If `nums[mid] > target`, search the left half.
3. If the target is not found:

   * The insertion position will be `left`.
4. Return `left`.

---

## Why It Works

```text
Binary Search narrows the search space
by half in every iteration.

When the search ends:

left points to the exact position
where the target should be inserted.
```

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

---

## Key Concept

```text
Target Found
→ Return its index

Target Not Found
→ Return insertion position (left)
```

---

## Example Walkthrough

### Input

```text
nums = [1,3,5,6]
target = 2
```

### Process

```text
left = 0
right = 3

mid = 1 → nums[1] = 3

2 < 3
Move right

Search ends

left = 1
```

### Result

```text
Return 1
```

---

## Interview Insight

```text
This problem introduces the concept of:

Lower Bound

The insertion position is exactly the
first position where the target can be
placed while maintaining sorted order.

This concept is heavily used in advanced
Binary Search problems.
```

---

## Related Problems

```text
704. Binary Search
34. Find First and Last Position of Element in Sorted Array
69. Sqrt(x)
744. Find Smallest Letter Greater Than Target
```
