# 16. 3Sum Closest

## Problem Statement

Given an integer array `nums` of length `n` and an integer `target`, find three integers at distinct indices in `nums` such that the sum is closest to `target`.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

---

## Example 1

**Input:**

```text
nums = [-1,2,1,-4]
target = 1
```

**Output:**

```text
2
```

**Explanation:**

```text
The sum closest to the target is:

(-1 + 2 + 1) = 2

Difference from target:
|2 - 1| = 1
```

---

## Example 2

**Input:**

```text
nums = [0,0,0]
target = 1
```

**Output:**

```text
0
```

**Explanation:**

```text
The only possible sum is:

0 + 0 + 0 = 0

Therefore, the closest sum is 0.
```

---

## Constraints

* `3 <= nums.length <= 500`
* `-1000 <= nums[i] <= 1000`
* `-10^4 <= target <= 10^4`

---

## Approach

### Sorting + Two Pointers

1. Sort the array.
2. Fix one element using a loop.
3. Use two pointers:

   * `left = i + 1`
   * `right = n - 1`
4. Calculate the current sum.
5. Update the closest sum if the current sum is closer to the target.
6. Move pointers:

   * If sum < target → move `left`.
   * If sum > target → move `right`.
   * If sum == target → return immediately.
7. Continue until all possibilities are checked.

---

## Why It Works

```text
Sorting allows us to efficiently adjust
the sum using two pointers.

If the current sum is too small,
move the left pointer to increase the sum.

If the current sum is too large,
move the right pointer to decrease the sum.
```

---

## Time Complexity

```text
O(n²)
```

* Sorting: `O(n log n)`
* Two Pointer Search: `O(n²)`

Overall:

```text
O(n²)
```

---

## Space Complexity

```text
O(1)
```

(ignoring sorting space used by the language implementation)

---

## Key Concept

```text
Sort the array first.

For every index i:

nums[i] + nums[left] + nums[right]

Use two pointers to move closer
to the target value.
```

---

## Interview Insight

```text
This problem is a variation of:

15. 3Sum

The difference is:

3Sum:
Find all triplets whose sum equals 0.

3Sum Closest:
Find the triplet whose sum is
closest to the target.

The optimal solution uses:
Sorting + Two Pointers.
```

---

## Related Problems

```text
15. 3Sum
18. 4Sum
167. Two Sum II
11. Container With Most Water
```
