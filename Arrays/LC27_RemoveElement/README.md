# 27. Remove Element

## Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place.

The order of the elements may be changed.

Return the number of elements in `nums` which are not equal to `val`.

Let the number of elements not equal to `val` be `k`.

After removing all occurrences of `val`:

```text
The first k elements of nums
should contain all elements
that are not equal to val.
```

The remaining elements beyond index `k - 1` are not important.

---

## Example 1

**Input:**

```text
nums = [3,2,2,3]
val = 3
```

**Output:**

```text
k = 2

nums = [2,2,_,_]
```

**Explanation:**

```text
After removing all occurrences of 3,

Remaining elements:

[2,2]

Therefore:

k = 2
```

---

## Example 2

**Input:**

```text
nums = [0,1,2,2,3,0,4,2]
val = 2
```

**Output:**

```text
k = 5

nums = [0,1,4,0,3,_,_,_]
```

**Explanation:**

```text
After removing all occurrences of 2,

Remaining elements:

[0,1,0,3,4]

The order may vary.

Therefore:

k = 5
```

---

## Constraints

* `0 <= nums.length <= 100`
* `0 <= nums[i] <= 50`
* `0 <= val <= 100`

---

## Approach

### Two Pointers

1. Use a pointer `k` to track the position where the next valid element should be placed.
2. Traverse the array.
3. For each element:

   * If it is not equal to `val`,
     copy it to `nums[k]`.
   * Increment `k`.
4. After traversal:

   * The first `k` elements contain all valid elements.
5. Return `k`.

---

## Why It Works

```text
We overwrite elements equal to val
with elements that should remain.

This allows the operation to be
performed in-place without using
extra memory.
```

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
Read Pointer  → Scans the array

Write Pointer → Stores valid elements
```

---

## Example Walkthrough

### Input

```text
nums = [3,2,2,3]
val = 3
```

### Process

```text
k = 0

3 == val
Skip

2 != val
nums[0] = 2
k = 1

2 != val
nums[1] = 2
k = 2

3 == val
Skip
```

### Final Array

```text
[2,2,_,_]
```

### Result

```text
k = 2
```

---

## Interview Insight

```text
This problem teaches:

1. Two Pointer Technique
2. In-place Array Modification
3. Space Optimization
4. Efficient Traversal

Frequently asked in:

- Amazon
- Microsoft
- Google
- Adobe
- Oracle
```

---

## Related Problems

```text
26. Remove Duplicates from Sorted Array
80. Remove Duplicates from Sorted Array II
283. Move Zeroes
88. Merge Sorted Array
```
