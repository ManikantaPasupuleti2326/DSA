# 📘 LeetCode 80: Remove Duplicates from Sorted Array II

## 📝 Problem Statement

Given a sorted integer array `nums`, remove some duplicates **in-place** such that each unique element appears **at most twice**.

The relative order of the elements must remain the same.

Since the length of the array cannot be changed, place the final result in the **first `k` positions** of the original array and return `k`.

**Constraints:**
- Do not allocate another array.
- Modify the original array in-place.
- Use **O(1)** extra space.

---

## 📌 Examples

### Example 1

**Input**

```text
nums = [1,1,1,2,2,3]
```

**Output**

```text
k = 5
nums = [1,1,2,2,3,_]
```

**Explanation**

- `1` appears three times.
- Only two occurrences are allowed.
- Remove one `1`.

Final valid array:

```text
[1,1,2,2,3]
```

---

### Example 2

**Input**

```text
nums = [0,0,1,1,1,1,2,3,3]
```

**Output**

```text
k = 7
nums = [0,0,1,1,2,3,3,_,_]
```

**Explanation**

- `0` → 2 times ✅
- `1` → 4 times ❌
- `2` → 1 time ✅
- `3` → 2 times ✅

Keep only two occurrences of each number.

---

# 🎯 Objective

Modify the given sorted array so that every unique element appears **at most twice** while preserving the original order.

Return the number of valid elements (`k`).

---

# 🔍 Key Observations

- The array is already sorted.
- Duplicate values are adjacent.
- The first two occurrences of every element are always allowed.
- No additional array should be created.
- Only the first `k` elements of the array are considered after processing.

---

# 💡 Approach

This problem can be solved using the **Two Pointer Technique**.

### Read Pointer

- Reads every element from left to right.
- Decides whether the current element should be kept.

### Write Pointer

- Points to the next position where a valid element should be written.
- Moves only when a valid element is found.

---

# ⚙️ Algorithm

1. Keep the first two elements.
2. Start checking from the third element.
3. Compare the current element with the element two positions before the write pointer.
4. If they are different, keep the current element.
5. Otherwise, skip it because it would become the third occurrence.
6. Continue until the end of the array.
7. Return the number of valid elements (`k`).

---

# 🧪 Dry Run

### Input

```text
[1,1,1,2,2,3]
```

Initially, the first two elements are accepted.

```text
Accepted:
1 1
```

Current element:

```text
1
```

Already two `1`s exist.

Skip it.

Current element:

```text
2
```

Different from the previous accepted pair.

Keep it.

```text
Accepted:
1 1 2
```

Current element:

```text
2
```

Second occurrence.

Keep it.

```text
Accepted:
1 1 2 2
```

Current element:

```text
3
```

Different.

Keep it.

```text
Accepted:
1 1 2 2 3
```

Final Answer

```text
k = 5

Valid Array:
[1,1,2,2,3]
```

---

# ⏱️ Complexity Analysis

### Time Complexity

```text
O(n)
```

The array is traversed only once.

### Space Complexity

```text
O(1)
```

Only constant extra memory is used.

---

# ✅ Why This Solution Is Optimal

- Single traversal of the array.
- Constant extra space.
- Preserves the order of elements.
- Satisfies all problem constraints.
- Efficient and interview-friendly.

---

# ❌ Common Mistakes

- Creating another array.
- Removing all duplicates instead of allowing two occurrences.
- Using nested loops (`O(n²)`).
- Forgetting that the array is already sorted.
- Returning the array instead of returning `k`.

---

# 💼 Interview Tips

- Mention that the array is sorted.
- Explain why duplicates are consecutive.
- State that the solution uses the **Two Pointer Technique**.
- Describe the roles of the read pointer and write pointer.
- Explain why comparing with the element two positions before the write pointer prevents a third duplicate.
- Mention the complexity:
  - **Time:** `O(n)`
  - **Space:** `O(1)`

---

# 📚 Keywords

- Array
- Two Pointers
- In-Place Algorithm
- Sorted Array
- Duplicate Removal
- Linear Time
- Constant Space

---

# 📖 Summary

- The array is already sorted.
- Keep at most **two occurrences** of every element.
- Modify the original array in-place.
- Use the **Two Pointer Technique**.
- Traverse the array only once.
- Return the number of valid elements (`k`).
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`