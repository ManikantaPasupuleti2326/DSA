# 350. Intersection of Two Arrays II

## Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must appear as many times as it shows in both arrays, and you may return the result in any order.

---

## Example 1

**Input:**

```text
nums1 = [1,2,2,1]
nums2 = [2,2]
```

**Output:**

```text
[2,2]
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
[4,9]
```

**Explanation:**

```text
[9,4] is also accepted.
```

---

## Constraints

* `1 <= nums1.length, nums2.length <= 1000`
* `0 <= nums1[i], nums2[i] <= 1000`

---

## Follow Up

### 1. What if the given array is already sorted?

```text
Use the Two Pointer technique.

Initialize two pointers, one for each array.
Compare elements and move pointers accordingly.

Time Complexity: O(n + m)
Space Complexity: O(1)
```

### 2. What if nums1's size is small compared to nums2's size?

```text
Build a HashMap using the smaller array to reduce memory usage.
Then traverse the larger array and find common elements.
```

### 3. What if elements of nums2 are stored on disk and memory is limited?

```text
Load nums2 in chunks.
Store frequencies of nums1 in memory using a HashMap.
Process nums2 chunk by chunk and compute the intersection.
```

---

## Approach

1. Create a HashMap to store the frequency of each element in `nums1`.
2. Traverse `nums2`.
3. If an element exists in the HashMap with frequency greater than 0:

   * Add it to the result.
   * Decrease its frequency in the HashMap.
4. Convert the result list to an array.
5. Return the resulting array.

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
O(min(n, m))
```
