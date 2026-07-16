# Add Binary

## Problem Statement

Given two binary strings `a` and `b`, return their sum as a binary string.

The input strings contain only the characters `'0'` and `'1'`, representing binary numbers.

---

## Examples

### Example 1

**Input**

```text
a = "11"
b = "1"
```

**Output**

```text
100
```

**Explanation**

```text
  11   (3 in decimal)
+  1   (1 in decimal)
----
100   (4 in decimal)
```

---

### Example 2

**Input**

```text
a = "1010"
b = "1011"
```

**Output**

```text
10101
```

**Explanation**

```text
  1010   (10 in decimal)
+ 1011   (11 in decimal)
------
 10101   (21 in decimal)
```

---

## Constraints

* `1 <= a.length, b.length <= 10⁴`
* `a` and `b` consist only of `'0'` or `'1'`.
* Each string does not contain leading zeros except for the number `0` itself.

---

## Approach

This problem can be solved by simulating the process of binary addition, similar to how decimal addition is performed manually.

### Algorithm

1. Initialize two pointers:

   * One at the end of string `a`.
   * One at the end of string `b`.
2. Initialize a variable `carry` to `0`.
3. Traverse both strings from right to left:

   * Add the current bits from both strings (if available).
   * Add the carry from the previous step.
   * Append the resulting bit (`sum % 2`) to the answer.
   * Update the carry (`sum / 2`).
4. Continue until both strings are fully processed and no carry remains.
5. Reverse the constructed result to obtain the final binary sum.

---

## Complexity Analysis

* **Time Complexity:** `O(max(n, m))`
* **Space Complexity:** `O(max(n, m))`

where:

* `n` = length of string `a`
* `m` = length of string `b`

---

## Key Concepts

* Binary Arithmetic
* String Traversal
* Carry Handling
* Two Pointers
* StringBuilder

---

## Tags

* String
* Math
* Bit Manipulation
* Simulation
* Easy
* LeetCode 67
