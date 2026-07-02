# 215. Kth Largest Element in an Array

## 📌 Problem Statement

Given an integer array `nums` and an integer `k`, return the **kth largest element** in the array.

> **Note:** The kth largest element refers to its position in the sorted order, **not** the kth distinct element.

The challenge is to solve the problem efficiently, preferably **without sorting the entire array**.

---

## 📝 Examples

### Example 1

**Input**

```text
nums = [3,2,1,5,6,4]
k = 2
```

**Output**

```text
5
```

**Explanation**

Sorted array in descending order:

```text
[6,5,4,3,2,1]
```

The 2nd largest element is **5**.

---

### Example 2

**Input**

```text
nums = [3,2,3,1,2,4,5,5,6]
k = 4
```

**Output**

```text
4
```

**Explanation**

Sorted array in descending order:

```text
[6,5,5,4,3,3,2,2,1]
```

The 4th largest element is **4**.

---

## 💡 Approach

There are multiple ways to solve this problem:

### Approach 1: Sorting

- Sort the array in ascending or descending order.
- Return the element at the required position.

Although simple, sorting the entire array is not the most efficient solution.

---

### Approach 2: Priority Queue (Min Heap)

Maintain a **Min Heap** of size `k`.

#### Steps

1. Traverse every element in the array.
2. Insert each element into the Min Heap.
3. If the heap size becomes greater than `k`, remove the smallest element.
4. After processing all elements, the top of the Min Heap represents the kth largest element.

This method avoids sorting the complete array and is efficient for large datasets.

---

### Approach 3: Quick Select (Optimal)

Quick Select is based on the partition process used in Quick Sort.

- Choose a pivot.
- Partition the array.
- Continue searching only in the required half.

Average Time Complexity:

```text
O(n)
```

Worst Case:

```text
O(n²)
```

This is considered the optimal approach for this problem.

---

## 🔍 Dry Run

### Input

```text
nums = [3,2,1,5,6,4]
k = 2
```

### Descending Order

```text
[6,5,4,3,2,1]
```

| Position | Element |
|---------:|--------:|
| 1 | 6 |
| 2 | 5 ✅ |
| 3 | 4 |
| 4 | 3 |
| 5 | 2 |
| 6 | 1 |

**Answer:** `5`

---

## ⏱ Time Complexity

| Approach | Time Complexity |
|----------|-----------------|
| Sorting | O(n log n) |
| Priority Queue | O(n log k) |
| Quick Select (Average) | O(n) |

---

## 💾 Space Complexity

| Approach | Space Complexity |
|----------|------------------|
| Sorting | O(1) or O(log n) (depends on implementation) |
| Priority Queue | O(k) |
| Quick Select | O(1) (Iterative) |

---

## 🎯 Key Concepts

- Arrays
- Sorting
- Heap (Priority Queue)
- Quick Select
- Partition Algorithm
- Selection Algorithms
- Time Complexity Optimization

---

## ⚠️ Important Points

- **kth largest** is based on the sorted order.
- Duplicate values are counted.
- It is **not** the kth distinct largest element.
- Priority Queue is an efficient solution when `k` is much smaller than `n`.
- Quick Select provides the best average performance for this problem.

---

## 📚 Interview Tips

- Clarify whether the interviewer expects the kth largest or kth distinct largest element.
- Be prepared to explain why sorting is not always the most efficient solution.
- Understand when to use:
  - Sorting
  - Priority Queue
  - Quick Select
- Mention the time and space complexity of each approach before choosing one.

---

## 🏷️ Tags

- Array
- Heap
- Priority Queue
- Quick Select
- Divide and Conquer
- Sorting
- Selection Algorithm
- LeetCode Medium
```