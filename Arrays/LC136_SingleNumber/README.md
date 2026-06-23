# 136. Single Number

## Problem Statement

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

You must implement a solution with a **linear runtime complexity** and use only **constant extra space**.

---

## Example 1

**Input:**

```text
nums = [2,2,1]
```

**Output:**

```text
1
```

---

## Example 2

**Input:**

```text
nums = [4,1,2,1,2]
```

**Output:**

```text
4
```

---

## Example 3

**Input:**

```text
nums = [1]
```

**Output:**

```text
1
```

---

## Constraints

* `1 <= nums.length <= 3 * 10^4`
* `-3 * 10^4 <= nums[i] <= 3 * 10^4`
* Each element in the array appears twice except for one element which appears only once.

---

## Approach

### Using XOR (Bit Manipulation)

1. Initialize a variable `result` with `0`.
2. Traverse the array.
3. XOR each element with `result`.
4. Since:

   * `a ^ a = 0`
   * `a ^ 0 = a`
5. All duplicate elements cancel each other out.
6. The remaining value is the element that appears only once.

### Why It Works

```text
2 ^ 2 = 0
1 ^ 1 = 0
0 ^ x = x

All pairs cancel out,
leaving only the unique element.
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

### HashSet

```text
Add elements to a HashSet.

If an element already exists,
remove it from the set.

At the end, the set contains
only the unique element.
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

## Key Concept

```text
XOR Properties:

a ^ a = 0
a ^ 0 = a
a ^ b ^ a = b

These properties allow all duplicate
numbers to cancel each other out,
leaving only the single number.
```

---

## Interview Insight

```text
This problem is one of the most important
Bit Manipulation interview questions.

The expected solution uses XOR because it
achieves:

Time Complexity  : O(n)
Space Complexity : O(1)
```
