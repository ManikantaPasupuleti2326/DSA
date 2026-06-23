# 268. Missing Number

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

## Example 1

**Input:**

```text
nums = [3,0,1]
```

**Output:**

```text
2
```

**Explanation:**

```text
n = 3 since there are 3 numbers.

All numbers should be in the range [0,3]:
[0,1,2,3]

The number 2 is missing.
```

---

## Example 2

**Input:**

```text
nums = [0,1]
```

**Output:**

```text
2
```

**Explanation:**

```text
n = 2 since there are 2 numbers.

All numbers should be in the range [0,2]:
[0,1,2]

The number 2 is missing.
```

---

## Example 3

**Input:**

```text
nums = [9,6,4,2,3,5,7,0,1]
```

**Output:**

```text
8
```

**Explanation:**

```text
n = 9 since there are 9 numbers.

All numbers should be in the range [0,9].

The number 8 is missing.
```

---

## Constraints

* `n == nums.length`
* `1 <= n <= 10^4`
* `0 <= nums[i] <= n`
* All the numbers in `nums` are unique.

---

## Approach

### Mathematical Formula

1. Calculate the expected sum of numbers from `0` to `n`.

```text
Expected Sum = n × (n + 1) / 2
```

2. Calculate the actual sum of all elements in the array.
3. The difference between the expected sum and actual sum is the missing number.

---

## Why It Works

```text
The array contains all numbers from 0 to n
except one.

Expected Sum - Actual Sum
gives the missing number directly.
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

## Alternative Approach

### XOR Method

```text
XOR all numbers from 0 to n.

XOR all elements in nums.

All matching numbers cancel out,
leaving only the missing number.
```

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

## Key Concept

```text
Expected Sum = n × (n + 1) / 2

Missing Number =
Expected Sum - Actual Sum
```

---

## Interview Insight

```text
This problem is commonly asked to test:

1. Mathematical optimization
2. XOR properties
3. Understanding of O(1) space solutions

The Math and XOR approaches are the
most preferred interview solutions.
```
