# 9. Palindrome Number

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## Example 1

**Input:**

```text
x = 121
```

**Output:**

```text
true
```

**Explanation:**

```text
121 reads as 121 from left to right
and from right to left.
```

---

## Example 2

**Input:**

```text
x = -121
```

**Output:**

```text
false
```

**Explanation:**

```text
From left to right, it reads -121.

From right to left, it becomes 121-.

Therefore, it is not a palindrome.
```

---

## Example 3

**Input:**

```text
x = 10
```

**Output:**

```text
false
```

**Explanation:**

```text
Reads 01 from right to left.

Therefore, it is not a palindrome.
```

---

## Constraints

* `-2^31 <= x <= 2^31 - 1`

---

## Approach

### Reverse the Number

1. Negative numbers cannot be palindromes.
2. Store the original number.
3. Reverse the digits of the number.
4. Compare the reversed number with the original number.
5. If both are equal, return `true`; otherwise return `false`.

---

## Why It Works

```text
A palindrome remains the same
when its digits are reversed.

If:

originalNumber == reversedNumber

then the number is a palindrome.
```

---

## Time Complexity

```text
O(log10 n)
```

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
Reverse the digits of the number
and compare with the original value.

Example:

121 → Reverse → 121

Since both are equal,
the number is a palindrome.
```

---

## Edge Cases

```text
Negative Numbers:
-121 → false

Numbers ending with zero:
10 → false

Single Digit Numbers:
7 → true
```

---

## Interview Insight

```text
This is a classic number manipulation problem.

It tests:

1. Modulus (%)
2. Division (/)
3. Reversing a number
4. Handling edge cases

Frequently asked in coding interviews
for beginners.
```
