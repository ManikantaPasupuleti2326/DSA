# 1749. Maximum Absolute Sum of Any Subarray

## Problem Statement

Given an integer array `nums`, find the **maximum absolute sum** of any contiguous subarray.

The absolute sum of a subarray is:

```text
abs(sum of all elements in the subarray)
```

Return the maximum possible absolute sum.

---

## Intuition

The maximum absolute sum can come from two cases:

1. A subarray with the **largest positive sum**.
2. A subarray with the **smallest (most negative) sum**.

Since the absolute value converts a negative sum into a positive value, both possibilities must be considered.

Example:

```text
Maximum Sum = 6
Minimum Sum = -10

Absolute Values

|6| = 6
|-10| = 10

Answer = 10
```

Therefore, the answer is:

```text
max(maximumSubarraySum, abs(minimumSubarraySum))
```

---

## Approach

Use Kadane's Algorithm twice in a single traversal.

### Find Maximum Subarray Sum

- Maintain the maximum sum ending at the current index.
- Update the overall maximum sum.

### Find Minimum Subarray Sum

- Maintain the minimum sum ending at the current index.
- Update the overall minimum sum.

Finally,

- Return the larger value between the maximum subarray sum and the absolute value of the minimum subarray sum.

---

## Algorithm

1. Initialize:
   - `currentMax` and `maxSum`
   - `currentMin` and `minSum`
2. Traverse the array once.
3. Update the current maximum and overall maximum.
4. Update the current minimum and overall minimum.
5. Return:

```text
max(maxSum, abs(minSum))
```

---

## Dry Run

### Input

```text
nums = [1, -3, 2, 3, -4]
```

| Index | Element | Current Max | Max Sum | Current Min | Min Sum |
|------:|---------:|------------:|--------:|------------:|--------:|
| 0 | 1 | 1 | 1 | 1 | 1 |
| 1 | -3 | -2 | 1 | -3 | -3 |
| 2 | 2 | 2 | 2 | -1 | -3 |
| 3 | 3 | 5 | 5 | 2 | -3 |
| 4 | -4 | 1 | 5 | -4 | -4 |

Final Answer:

```text
max(5, |-4|)

max(5, 4)

= 5
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

The array is traversed only once.

### Space Complexity

```text
O(1)
```

Only a constant amount of extra space is used.

---

## Key Takeaways

- Maximum absolute sum can originate from either:
  - the maximum subarray sum, or
  - the minimum subarray sum.
- A single traversal is sufficient to compute both values.
- The solution is an extension of Kadane's Algorithm with constant extra space.

---