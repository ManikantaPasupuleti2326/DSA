# 1470. Shuffle the Array

## Problem Statement

Given the array `nums` consisting of `2n` elements in the form:

```text
[x1, x2, ..., xn, y1, y2, ..., yn]
```

Return the array in the form:

```text
[x1, y1, x2, y2, ..., xn, yn]
```

---

## Example 1

**Input:**

```text
nums = [2,5,1,3,4,7], n = 3
```

**Output:**

```text
[2,3,5,4,1,7]
```

**Explanation:**

```text
x1 = 2, x2 = 5, x3 = 1
y1 = 3, y2 = 4, y3 = 7

After shuffling:
[x1, y1, x2, y2, x3, y3]
= [2,3,5,4,1,7]
```

---

## Example 2

**Input:**

```text
nums = [1,2,3,4,4,3,2,1], n = 4
```

**Output:**

```text
[1,4,2,3,3,2,4,1]
```

---

## Example 3

**Input:**

```text
nums = [1,1,2,2], n = 2
```

**Output:**

```text
[1,2,1,2]
```

---

## Constraints

* `1 <= n <= 500`
* `nums.length == 2 * n`
* `1 <= nums[i] <= 10³`

---

## Approach

1. Create a new array of size `2n`.
2. Traverse the first half of the array (`x` elements).
3. For each index `i`:

   * Place `nums[i]` in the result array.
   * Place `nums[i + n]` immediately after it.
4. Continue until all elements are processed.
5. Return the shuffled array.

---

## Time Complexity

```text
O(n)
```

## Space Complexity

```text
O(n)
```
