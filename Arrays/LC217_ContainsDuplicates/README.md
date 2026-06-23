# 217. Contains Duplicate

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## Example 1

**Input:**

```text
nums = [1,2,3,1]
```

**Output:**

```text
true
```

**Explanation:**

```text
The element 1 occurs at indices 0 and 3.
```

---

## Example 2

**Input:**

```text
nums = [1,2,3,4]
```

**Output:**

```text
false
```

**Explanation:**

```text
All elements are distinct.
```

---

## Example 3

**Input:**

```text
nums = [1,1,1,3,3,4,3,2,4,2]
```

**Output:**

```text
true
```

---

## Constraints

* `1 <= nums.length <= 10^5`
* `-10^9 <= nums[i] <= 10^9`

---

## Approach

### Using HashSet

1. Create a HashSet to store the elements encountered so far.
2. Traverse the array.
3. For each element:

   * If the element already exists in the HashSet, return `true`.
   * Otherwise, add it to the HashSet.
4. If the traversal completes without finding any duplicate, return `false`.

### Why It Works

```text
A HashSet stores only unique elements.

If an element is already present in the HashSet,
it means the element has appeared before,
so the array contains a duplicate.
```

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

---

## Alternative Approach

### Sorting

```text
Sort the array.

Traverse the sorted array and check whether
adjacent elements are equal.

If any two adjacent elements are equal,
return true; otherwise return false.
```

**Time Complexity:** `O(n log n)`
**Space Complexity:** `O(1)` or `O(log n)` depending on the sorting algorithm.

---

## Key Concept

```text
HashSet is the optimal solution because it provides:

Insertion : O(1)
Search    : O(1)

making the overall time complexity O(n).
```
