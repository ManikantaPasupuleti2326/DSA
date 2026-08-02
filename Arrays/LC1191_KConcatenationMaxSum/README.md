# 1191. K-Concatenation Maximum Sum

## Problem Statement

You are given:

- An integer array `arr`
- An integer `k`

Create a new array by concatenating `arr` exactly `k` times.

Example:

arr = [1, 2]
k = 3

Modified array:

[1, 2, 1, 2, 1, 2]

Your task is to find the **maximum sum of any contiguous subarray** in the modified array.

A subarray can also be **empty**, whose sum is **0**.

Return the answer modulo **10^9 + 7**.

---

## Examples

### Example 1

Input

arr = [1,2]
k = 3

Modified array

[1,2,1,2,1,2]

Output

9

---

### Example 2

Input

arr = [1,-2,1]
k = 5

Output

2

---

### Example 3

Input

arr = [-1,-2]
k = 7

Output

0

---

## Constraints

- 1 <= arr.length <= 100000
- 1 <= k <= 100000
- -10000 <= arr[i] <= 10000

---

## Things to Observe

- The modified array is formed by repeating the original array `k` times.
- The maximum subarray may:
  - lie completely inside one copy,
  - or span across multiple copies.
- Since `k` can be as large as `100000`, constructing the complete array directly may not be efficient.
- The answer should be returned modulo `1000000007`.
- An empty subarray is allowed, so the minimum possible answer is `0`.

---

## Function Signature

```java
public int kConcatenationMaxSum(int[] arr, int k)
```

---

## Input

- `arr` → integer array
- `k` → number of concatenations

## Output

- Maximum contiguous subarray sum after concatenating the array `k` times.
- Return the result modulo `1000000007`.

---

## Notes

- A subarray must be contiguous.
- The empty subarray has sum `0`.
- Be careful with large values of `k`.
- Consider integer overflow while computing sums.