# 66. Plus One

## Problem Statement

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the `iᵗʰ` digit of the integer.

The digits are ordered from most significant to least significant in left-to-right order.

The large integer does not contain any leading zeros.

Increment the large integer by one and return the resulting array of digits.

---

## Example 1

**Input:**

```text
digits = [1,2,3]
```

**Output:**

```text
[1,2,4]
```

**Explanation:**

```text
The array represents the integer 123.

123 + 1 = 124

Result = [1,2,4]
```

---

## Example 2

**Input:**

```text
digits = [4,3,2,1]
```

**Output:**

```text
[4,3,2,2]
```

**Explanation:**

```text
The array represents the integer 4321.

4321 + 1 = 4322

Result = [4,3,2,2]
```

---

## Example 3

**Input:**

```text
digits = [9]
```

**Output:**

```text
[1,0]
```

**Explanation:**

```text
The array represents the integer 9.

9 + 1 = 10

Result = [1,0]
```

---

## Constraints

* `1 <= digits.length <= 100`
* `0 <= digits[i] <= 9`
* `digits` does not contain any leading zeros.

---

## Approach

1. Traverse the array from right to left.
2. If the current digit is less than `9`:

   * Increment it by `1`.
   * Return the array immediately.
3. If the digit is `9`:

   * Change it to `0`.
   * Continue moving left.
4. If all digits are `9`:

   * Create a new array of size `n + 1`.
   * Set the first element to `1`.
   * Remaining elements stay `0`.
5. Return the new array.

---

## Why It Works

```text
Adding one affects the least significant digit first.

If a digit becomes 10,
a carry is generated and propagated
towards the left.

This process continues until
no carry remains.
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

For the normal case.

Worst case:

```text
O(n)
```

when a new array is created (e.g., [9,9,9]).

---

## Key Concept

```text
Case 1:

[1,2,3]

→ [1,2,4]

No carry propagation.

Case 2:

[1,2,9]

→ [1,3,0]

Carry propagates once.

Case 3:

[9,9,9]

→ [1,0,0,0]

New array required.
```

---

## Example Walkthrough

### Input

```text
digits = [9,9,9]
```

### Process

```text
[9,9,9]

↓

[9,9,0]

↓

[9,0,0]

↓

[0,0,0]
```

Carry still exists.

Create new array:

```text
[1,0,0,0]
```

---

## Interview Insight

```text
This is a classic Array Simulation problem.

It teaches:

1. Carry Handling
2. Reverse Traversal
3. Edge Cases
4. Array Manipulation

Frequently asked in coding interviews
for beginners and intermediate candidates.
```

---

## Related Problems

```text
67. Add Binary
415. Add Strings
989. Add to Array-Form of Integer
2. Add Two Numbers
```
