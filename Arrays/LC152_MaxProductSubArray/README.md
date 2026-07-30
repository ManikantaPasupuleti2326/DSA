# 152. Maximum Product Subarray

## Problem Statement

Given an integer array `nums`, find the **contiguous subarray** within the array that has the **largest product**, and return that product.

A **subarray** is a sequence of **contiguous (adjacent) elements** within an array.

The product of a subarray containing only one element is the value of that element.

> **Note:** The test cases are generated so that the answer will fit in a 32-bit signed integer.

---

## Examples

### Example 1

**Input**

```text
nums = [2,3,-2,4]
```

**Output**

```text
6
```

**Explanation**

The subarray `[2,3]` has the largest product.

```text
2 × 3 = 6
```

---

### Example 2

**Input**

```text
nums = [-2,0,-1]
```

**Output**

```text
0
```

**Explanation**

The result cannot be `2` because `[-2,-1]` is **not a contiguous subarray**.

Valid subarrays are:

```text
[-2]
[0]
[-1]
[-2,0]
[0,-1]
[-2,0,-1]
```

The maximum product among these is `0`.

---

## Constraints

- `1 <= nums.length <= 2 × 10⁴`
- `-10 <= nums[i] <= 10`
- The product of any subarray fits within a **32-bit signed integer**.

---

## Function Signature

```java
public int maxProduct(int[] nums)
```

---

## Return

Return the **maximum product** of any contiguous subarray.

---

## Input Format (for local testing)

- First line: Integer `n` (size of the array)
- Second line: `n` space-separated integers

### Sample Input

```text
4
2 3 -2 4
```

### Sample Output

```text
6
```