# 1929. Concatenation of Array

## Problem Statement

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where:

* `ans[i] == nums[i]`
* `ans[i + n] == nums[i]`

for `0 <= i < n` (0-indexed).

Specifically, `ans` is the concatenation of two `nums` arrays.

Return the array `ans`.

---

## Example 1

**Input:**

```text
nums = [1,2,1]
```

**Output:**

```text
[1,2,1,1,2,1]
```

**Explanation:**

```text
ans = [nums[0], nums[1], nums[2],
       nums[0], nums[1], nums[2]]

ans = [1,2,1,1,2,1]
```

---

## Example 2

**Input:**

```text
nums = [1,3,2,1]
```

**Output:**

```text
[1,3,2,1,1,3,2,1]
```

**Explanation:**

```text
ans = [nums[0], nums[1], nums[2], nums[3],
       nums[0], nums[1], nums[2], nums[3]]

ans = [1,3,2,1,1,3,2,1]
```

---

## Constraints

* `n == nums.length`
* `1 <= n <= 1000`
* `1 <= nums[i] <= 1000`

---

## Approach

1. Create a new array `ans` of size `2 * n`.
2. Traverse the original array `nums`.
3. Copy each element to:

   * `ans[i]`
   * `ans[i + n]`
4. Return the resulting array.

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(n)
```
