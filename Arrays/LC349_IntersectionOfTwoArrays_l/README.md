# 349. Intersection of Two Arrays

## Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must be **unique**, and you may return the result in any order.

---

## Example 1

**Input:**

```text
nums1 = [1,2,2,1]
nums2 = [2,2]
```

**Output:**

```text
[2]
```

---

## Example 2

**Input:**

```text
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
```

**Output:**

```text
[9,4]
```

**Explanation:**

```text
[4,9] is also accepted.
```

---

## Constraints

* `1 <= nums1.length, nums2.length <= 1000`
* `0 <= nums1[i], nums2[i] <= 1000`

---

## Approach

1. Store all elements of `nums1` in a HashSet.
2. Traverse `nums2`.
3. If an element exists in the HashSet:

   * Add it to a result HashSet.
4. The result HashSet automatically removes duplicates.
5. Convert the result HashSet to an array.
6. Return the resulting array.

---

## Time Complexity

```text
O(n + m)
```

where:

* `n = nums1.length`
* `m = nums2.length`

---

## Space Complexity

```text
O(n)
```

---

## Key Difference from LeetCode 350

```text
349. Intersection of Two Arrays
→ Only unique common elements are returned.
→ HashSet is commonly used.

350. Intersection of Two Arrays II
→ Elements appear as many times as they occur in both arrays.
→ HashMap (frequency counting) is commonly used.
```
