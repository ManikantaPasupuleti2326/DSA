# 169. Majority Element

## Problem Statement

Given an array `nums` of size `n`, return the majority element.

The **majority element** is the element that appears more than `⌊n / 2⌋` times.

You may assume that the majority element always exists in the array.

---

## Example 1

**Input:**

```text
nums = [3,2,3]
```

**Output:**

```text
3
```

---

## Example 2

**Input:**

```text
nums = [2,2,1,1,1,2,2]
```

**Output:**

```text
2
```

---

## Constraints

* `n == nums.length`
* `1 <= n <= 5 × 10^4`
* `-10^9 <= nums[i] <= 10^9`
* The input is generated such that a majority element will always exist.

---

## Approach

### Boyer-Moore Voting Algorithm

1. Initialize:

   * `candidate` as any element.
   * `count = 0`.
2. Traverse the array:

   * If `count == 0`, choose the current element as the new candidate.
   * If the current element equals the candidate, increment `count`.
   * Otherwise, decrement `count`.
3. After traversing the array, the candidate will be the majority element.
4. Return the candidate.

### Why It Works

```text
The majority element appears more than n/2 times.

Every occurrence of a non-majority element can cancel out
one occurrence of the majority element.

Since the majority element occurs more than all other
elements combined, it will remain as the final candidate.
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

## Alternative Approaches

### HashMap

```text
Store frequencies of all elements in a HashMap.

Return the element whose frequency is greater than n/2.
```

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

### Sorting

```text
Sort the array.

The majority element will always be present at index n/2.
```

**Time Complexity:** `O(n log n)`
**Space Complexity:** `O(1)` or `O(log n)` depending on sorting implementation.

---

## Key Concept

```text
Boyer-Moore Voting Algorithm is the optimal solution
because it achieves:

Time Complexity  : O(n)
Space Complexity : O(1)

and is frequently asked in coding interviews.
```
