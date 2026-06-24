# 238. Product of Array Except Self

## Problem Statement

Given an integer array `nums`, return an array `answer` such that:

```text
answer[i] = product of all elements of nums except nums[i]
```

The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in **O(n)** time and **without using the division operation**.

---

## Example 1

**Input:**

```text
nums = [1,2,3,4]
```

**Output:**

```text
[24,12,8,6]
```

---

## Example 2

**Input:**

```text
nums = [-1,1,0,-3,3]
```

**Output:**

```text
[0,0,9,0,0]
```

---

## Constraints

* `2 <= nums.length <= 10^5`
* `-30 <= nums[i] <= 30`
* The input is generated such that `answer[i]` fits in a 32-bit integer.

---

## Follow Up

Can you solve the problem in **O(1)** extra space complexity?

(The output array does not count as extra space.)

---

## Approach

### Prefix Product and Suffix Product

1. Create an answer array.
2. First pass:

   * Store the product of all elements to the left of each index.
3. Second pass:

   * Traverse from right to left.
   * Maintain a running suffix product.
   * Multiply the current answer value with the suffix product.
4. Return the answer array.

---

## Why It Works

```text
For each index i:

answer[i] =
(product of elements to the left of i)
×
(product of elements to the right of i)

Using prefix and suffix products allows us
to compute the result without division.
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

The output array is not counted as extra space.

---

## Key Concept

```text
Prefix Product:

nums = [1,2,3,4]

prefix:
[1,1,2,6]

Suffix Product:

suffix:
[24,12,4,1]

Result:

[24,12,8,6]
```

---

## Interview Insight

```text
This is one of the most important Array problems.

It teaches:

1. Prefix Product
2. Suffix Product
3. Space Optimization
4. Eliminating Division

Frequently asked in:

- Amazon
- Google
- Microsoft
- Meta
- Adobe
- Uber
```

---

## Related Problems

```text
724. Find Pivot Index
1480. Running Sum of 1D Array
560. Subarray Sum Equals K
303. Range Sum Query
```
