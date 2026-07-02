# 448. Find All Numbers Disappeared in an Array

## 📌 Problem Statement

Given an integer array `nums` of length `n`, where each element is in the range **[1, n]**, return all the integers in the range **[1, n]** that do **not** appear in the array.

The solution should run in **O(n)** time and use **O(1)** extra space (excluding the output list).

---

## 📝 Examples

### Example 1

**Input**

```text
nums = [4,3,2,7,8,2,3,1]
```

**Output**

```text
[5,6]
```

---

### Example 2

**Input**

```text
nums = [1,1]
```

**Output**

```text
[2]
```

---

## 💡 Approach

Since every element in the array lies within the range **1 to n**, each value can be treated as an index.

The idea is to use the input array itself to keep track of the numbers that have already appeared.

### Steps

1. Traverse the array.
2. For each element, calculate its corresponding index using its absolute value.
3. Mark the element at that index as visited by making it negative.
4. Traverse the array again.
5. Every index containing a positive value represents a number that is missing.
6. Add those missing numbers to the result.

This approach avoids using any extra array or hash-based data structure.

---

## 🔍 Dry Run

### Input

```text
nums = [4,3,2,7,8,2,3,1]
```

### After Marking Visited Numbers

```text
[-4,-3,-2,-7,8,2,-3,-1]
```

### Positive Values Remain At

| Index | Missing Number |
|------:|---------------:|
| 4 | 5 |
| 5 | 6 |

### Output

```text
[5,6]
```

---

## ⏱ Time Complexity

| Operation | Complexity |
|-----------|------------|
| Array Traversal | O(n) |
| Second Traversal | O(n) |

**Overall Time Complexity:** **O(n)**

---

## 💾 Space Complexity

**O(1)**

The algorithm modifies the input array in-place. The returned list is not considered extra space.

---

## 🎯 Key Concepts

- Arrays
- Index Mapping
- In-place Modification
- Negative Marking Technique
- Linear Traversal
- Constant Extra Space Optimization

---

## ⚠️ Important Points

- Every value lies between **1 and n**, making index mapping possible.
- Always use the absolute value while processing because elements may already be marked as negative.
- A positive value after the marking process indicates that the corresponding number is missing.
- The input array itself is used as the visited array, eliminating the need for additional memory.

---

## 📚 Interview Tips

- This is a classic **Index Marking** problem.
- It tests your understanding of **in-place algorithms** and **space optimization**.
- A common mistake is forgetting to use the absolute value while accessing indices.
- This problem is frequently asked in coding interviews due to its optimal **O(n)** time and **O(1)** space solution.

---

## 🏷️ Tags

- Array
- In-place Algorithm
- Index Mapping
- Simulation
- Linear Traversal
- Constant Space
- LeetCode Easy