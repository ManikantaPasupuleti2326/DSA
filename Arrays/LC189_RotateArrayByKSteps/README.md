# 189. Rotate Array

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

---

## Examples

### Example 1

**Input**

```text
nums = [1,2,3,4,5,6,7]
k = 3
```

**Output**

```text
[5,6,7,1,2,3,4]
```

---

### Example 2

**Input**

```text
nums = [-1,-100,3,99]
k = 2
```

**Output**

```text
[3,99,-1,-100]
```

---

## Approaches

### 1. Standard (Brute Force) Approach

**Idea**

Rotate the array one step to the right repeatedly until `k` rotations are completed.

**Steps**

* Find the length of the array.
* Reduce unnecessary rotations using `k % n`.
* Repeat the rotation `k` times.
* During each rotation:

  * Save the last element.
  * Shift all remaining elements one position to the right.
  * Place the saved element at the beginning.

**Time Complexity:** `O(n × k)`

**Space Complexity:** `O(1)`

---

### 2. Reversal Algorithm (Optimal)

**Idea**

Instead of rotating one step at a time, reverse different parts of the array.

**Steps**

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n - k` elements.

This rearranges the elements into the required rotated order.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

## Why Do We Use `k = k % n`?

If the array length is `n`, then after every `n` rotations the array returns to its original arrangement.

For example:

```text
Array Length = 7
k = 10

10 % 7 = 3
```

Rotating the array 10 times gives the same result as rotating it only 3 times. This optimization avoids unnecessary work and improves performance.

---

## Complexity Comparison

| Approach           | Time Complexity | Space Complexity |
| ------------------ | --------------- | ---------------- |
| Standard Rotation  | `O(n × k)`      | `O(1)`           |
| Reversal Algorithm | `O(n)`          | `O(1)`           |

---

## Key Learnings

* Array rotation techniques
* In-place array manipulation
* Modulo optimization (`k % n`)
* Reversal technique
* Time and space complexity analysis

---

## Conclusion

The standard approach is simple and easy to understand but becomes inefficient for large values of `k`.

The reversal algorithm is the optimal solution because it performs the rotation in linear time while using constant extra space, making it the preferred approach for coding interviews and production-quality solutions.
