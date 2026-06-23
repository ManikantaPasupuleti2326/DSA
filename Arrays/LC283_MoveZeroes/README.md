# 283. Move Zeroes

## Problem Statement

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this **in-place** without making a copy of the array.

---

## Example 1

**Input:**

```text
nums = [0,1,0,3,12]
```

**Output:**

```text
[1,3,12,0,0]
```

---

## Example 2

**Input:**

```text
nums = [0]
```

**Output:**

```text
[0]
```

---

## Constraints

* `1 <= nums.length <= 10^4`
* `-2^31 <= nums[i] <= 2^31 - 1`

---

## Approach

1. Use a pointer `index` to track the position where the next non-zero element should be placed.
2. Traverse the array:

   * If the current element is non-zero, place it at `nums[index]` and increment `index`.
3. After all non-zero elements are moved to the front, fill the remaining positions with `0`.
4. This preserves the relative order of non-zero elements and satisfies the in-place requirement.

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
