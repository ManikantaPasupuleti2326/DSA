# 88. Merge Sorted Array

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, along with two integers `m` and `n`.

- The first `m` elements of `nums1` are valid.
- `nums1` has a total size of `m + n`, where the last `n` elements are placeholders (`0`) to accommodate elements from `nums2`.
- `nums2` contains `n` valid elements.

Merge `nums2` into `nums1` so that the final array is sorted in non-decreasing order.

> **Note:** Modify `nums1` in-place. Do not return a new array.

---

## Example

### Example 1

**Input**

```text
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
```

**Output**

```text
[1,2,2,3,5,6]
```

---

### Example 2

**Input**

```text
nums1 = [1]
m = 1
nums2 = []
n = 0
```

**Output**

```text
[1]
```

---

### Example 3

**Input**

```text
nums1 = [0]
m = 0
nums2 = [1]
n = 1
```

**Output**

```text
[1]
```

---

## Approach

Instead of merging from the beginning, we merge from the **end** of the arrays.

### Why?

The end of `nums1` already has enough empty space to store all elements. By comparing the largest remaining elements from both arrays and placing the larger one at the last available position, we avoid overwriting useful values.

### Steps

1. Initialize three pointers:
   - `i = m - 1` → Last valid element in `nums1`
   - `j = n - 1` → Last element in `nums2`
   - `k = m + n - 1` → Last position of `nums1`

2. Compare `nums1[i]` and `nums2[j]`.
3. Place the larger value at `nums1[k]`.
4. Move the corresponding pointer backward.
5. Repeat until all elements of `nums2` are merged.

---

## Algorithm

1. Start from the end of both arrays.
2. Compare the current largest elements.
3. Insert the larger element into the last available position.
4. Continue until all elements from `nums2` are copied.

---

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Merge | **O(m + n)** |

---

## Space Complexity

| Complexity |
|------------|
| **O(1)** (In-place algorithm) |

---

## Dry Run

### Input

```text
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
```

| i | j | k | Action | nums1 |
|---|---|---|--------|--------|
|2|2|5|6 > 3 → place 6|[1,2,3,0,0,6]|
|2|1|4|5 > 3 → place 5|[1,2,3,0,5,6]|
|2|0|3|3 > 2 → place 3|[1,2,3,3,5,6]|
|1|0|2|2 == 2 → place 2|[1,2,2,3,5,6]|

Final Output

```text
[1,2,2,3,5,6]
```

---

## Key Learning

- Two Pointer Technique
- In-place Array Manipulation
- Backward Traversal
- Optimizing Space Complexity
- Efficient Merge Strategy

---

## Interview Tips

- Do **not** merge from the beginning because it overwrites existing elements.
- Always start from the last index.
- This is one of the most common applications of the **Two Pointer** technique.

---

## Complexity Summary

- **Time Complexity:** `O(m + n)`
- **Space Complexity:** `O(1)`

---

## Tags

- Array
- Two Pointers
- Sorting
- In-place Algorithm
- Easy