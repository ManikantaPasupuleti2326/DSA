# 918. Maximum Sum Circular Subarray

## Problem Statement

Given a **circular integer array** `nums` of length `n`, return the **maximum possible sum** of a **non-empty subarray**.

In a circular array:

- The element after the last element is the first element.
- The element before the first element is the last element.

A subarray can wrap around the end of the array, but each element can be included **at most once**.

---

## Examples

### Example 1

**Input**

```text
nums = [1, -2, 3, -2]
```

**Output**

```text
3
```

**Explanation**

The maximum subarray is:

```text
[3]
```

---

### Example 2

**Input**

```text
nums = [5, -3, 5]
```

**Output**

```text
10
```

**Explanation**

The maximum circular subarray is:

```text
[5, 5]
```

which wraps around the array.

---

### Example 3

**Input**

```text
nums = [-3, -2, -3]
```

**Output**

```text
-2
```

**Explanation**

The maximum subarray consists of the single element:

```text
[-2]
```

---

## Constraints

- `1 <= nums.length <= 3 × 10⁴`
- `-3 × 10⁴ <= nums[i] <= 3 × 10⁴`

---

## Concepts Used

- Arrays
- Circular Arrays
- Kadane's Algorithm
- Dynamic Programming

---

## Observations

- The maximum subarray may be:
  - A normal subarray (does not wrap around).
  - A circular subarray (wraps around the array).
- Since the array is circular, the last element is connected to the first.
- Every element can be used only once in the chosen subarray.

---

## Approach

To solve this problem efficiently:

- Handle the normal maximum subarray case.
- Handle the circular maximum subarray case.
- Compare both results and return the larger value.
- Consider the edge case where all elements are negative.

---

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## Java Solution

```java
// Add your solution here.
```