# 69. Sqrt(x)

## Problem Statement

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use:

```text
pow(x, 0.5)
```

or

```text
x ** 0.5
```

---

## Example 1

**Input:**

```text
x = 4
```

**Output:**

```text
2
```

**Explanation:**

```text
The square root of 4 is 2,
so we return 2.
```

---

## Example 2

**Input:**

```text
x = 8
```

**Output:**

```text
2
```

**Explanation:**

```text
The square root of 8 is 2.82842...

Since we round down to the nearest integer,
the answer is 2.
```

---

## Constraints

* `0 <= x <= 2^31 - 1`

---

## Approach

### Binary Search

1. Search within the range `[0, x]`.
2. Calculate the middle value `mid`.
3. Compare `mid × mid` with `x`.
4. If:

   * `mid × mid == x`, return `mid`.
   * `mid × mid < x`, move to the right half.
   * `mid × mid > x`, move to the left half.
5. Continue until the search space is exhausted.
6. Return the largest integer whose square is less than or equal to `x`.

---

## Why It Works

```text
The square root of x must lie
between 0 and x.

Since the search space is sorted,
Binary Search can efficiently find
the integer square root.
```

---

## Time Complexity

```text
O(log x)
```

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
Instead of searching an array,
Binary Search is applied on the answer space.

Range:
0 to x

Condition:
mid × mid <= x
```

---

## Interview Insight

```text
This is a classic "Binary Search on Answer" problem.

It teaches:

1. Binary Search fundamentals
2. Avoiding integer overflow
3. Searching in a numerical range

Frequently asked in coding interviews.
```

---

## Common Pitfall

```text
Use long while calculating:

mid * mid

because:

(2^31 - 1)^2

can overflow an int.
```
