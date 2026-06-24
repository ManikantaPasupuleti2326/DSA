# 4. Median of Two Sorted Arrays

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return the median of the two sorted arrays.

The overall runtime complexity should be:

```text
O(log(m + n))
```

---

## Example 1

**Input:**

```text
nums1 = [1,3]
nums2 = [2]
```

**Output:**

```text
2.00000
```

**Explanation:**

```text
Merged array = [1,2,3]

Median = 2
```

---

## Example 2

**Input:**

```text
nums1 = [1,2]
nums2 = [3,4]
```

**Output:**

```text
2.50000
```

**Explanation:**

```text
Merged array = [1,2,3,4]

Median = (2 + 3) / 2

Median = 2.5
```

---

## Constraints

* `nums1.length == m`
* `nums2.length == n`
* `0 <= m <= 1000`
* `0 <= n <= 1000`
* `1 <= m + n <= 2000`
* `-10^6 <= nums1[i], nums2[i] <= 10^6`

---

## Approach

### Binary Search on Partition

1. Always perform Binary Search on the smaller array.
2. Partition both arrays such that:

```text
Left Part Size = Right Part Size
```

or

```text
Left Part Size = Right Part Size + 1
```

3. Check partition validity:

```text
maxLeft1 <= minRight2

and

maxLeft2 <= minRight1
```

4. If valid:

   * Compute the median.
5. Otherwise:

   * Adjust Binary Search boundaries.
6. Continue until the correct partition is found.

---

## Why It Works

```text
The median divides the combined
sorted arrays into two equal halves.

Binary Search helps locate the
correct partition efficiently
without merging the arrays.
```

---

## Time Complexity

```text
O(log(min(m, n)))
```

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
Partition both arrays such that:

Left Half
≤
Right Half

Median depends only on:

max(left elements)

and

min(right elements)
```

---

## Example Walkthrough

### Input

```text
nums1 = [1,2]
nums2 = [3,4]
```

### Combined Sorted Array

```text
[1,2,3,4]
```

### Median

```text
(2 + 3) / 2

= 2.5
```

---

## Optimal vs Brute Force

### Brute Force

```text
Merge both arrays
Find median
```

**Time Complexity**

```text
O(m + n)
```

---

### Optimal Solution

```text
Binary Search Partition
```

**Time Complexity**

```text
O(log(min(m,n)))
```

---

## Interview Insight

```text
This is one of the most important
Hard Binary Search problems.

It teaches:

1. Binary Search on Answer Space
2. Array Partitioning
3. Divide and Conquer
4. Advanced Median Concepts

Frequently asked in:

- Google
- Amazon
- Microsoft
- Meta
- Adobe
```

---

## Related Problems

```text
35. Search Insert Position
34. Find First and Last Position of Element
69. Sqrt(x)
153. Find Minimum in Rotated Sorted Array
```
