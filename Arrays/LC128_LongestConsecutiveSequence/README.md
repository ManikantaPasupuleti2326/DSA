# 128. Longest Consecutive Sequence

## Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

**Constraint:**
Your algorithm must run in **O(n)** time.

### Example 1

```text
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation:
The longest consecutive sequence is [1,2,3,4].
```

### Example 2

```text
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

### Example 3

```text
Input: nums = [1,0,1,2]
Output: 3
```

---

# Approach 1: Brute Force

## Idea

For every element in the array:

1. Consider it as the starting element.
2. Search whether the next consecutive number exists using Linear Search.
3. Continue until the next number is not found.
4. Store the maximum sequence length.

### Algorithm

* Traverse every element.
* Perform Linear Search for `current + 1`.
* Increase the sequence length while the next consecutive element exists.
* Update the maximum sequence length.

### Time Complexity

* **O(n²)**

### Space Complexity

* **O(1)**

---

# Approach 2: Better Solution (Sorting)

## Idea

Sort the array first.

After sorting, consecutive numbers become adjacent.

Example:

```text
Before Sorting

100 4 200 1 3 2

After Sorting

1 2 3 4 100 200
```

Now traverse the sorted array once.

### Algorithm

1. Sort the array.
2. Skip duplicate elements.
3. If the current element equals the previous element + 1, extend the current sequence.
4. Otherwise, update the longest sequence and start a new sequence.

### Time Complexity

* Sorting → O(n log n)
* Traversal → O(n)

Overall:

```text
O(n log n)
```

### Space Complexity

```text
O(log n)
```

(Java's `Arrays.sort()` for primitive arrays uses Dual-Pivot Quicksort.)

---

# Approach 3: Optimal Solution (HashSet)

## Intuition

Use a `HashSet` for O(1) lookups.

The important observation is:

> Only start counting from the first element of a sequence.

A number is the start of a sequence if:

```java
!set.contains(num - 1)
```

If the previous number does not exist, then the current number is the beginning of a consecutive sequence.

### Example

Input

```text
[100,4,200,1,3,2]
```

HashSet

```text
{100,4,200,1,3,2}
```

Check **100**

```text
99 exists?

No
```

Start counting

```text
100
```

Length = 1

---

Check **4**

```text
3 exists?

Yes
```

Skip.

---

Check **1**

```text
0 exists?

No
```

Start counting

```text
1
2
3
4
```

Length = 4

Answer = 4

---

## Algorithm

1. Insert every element into a HashSet.
2. Traverse the HashSet.
3. If `num - 1` does not exist:

   * Start a new sequence.
   * Count consecutive numbers using `current + 1`.
4. Update the maximum sequence length.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(n)
```

---

# Dry Run

Input

```text
nums = [100,4,200,1,3,2]
```

HashSet

```text
{100,4,200,1,3,2}
```

### num = 100

```text
99 not found

count = 1

longest = 1
```

---

### num = 4

```text
3 exists

Skip
```

---

### num = 200

```text
199 not found

count = 1

longest = 1
```

---

### num = 1

```text
0 not found

current = 1

2 found

count = 2

3 found

count = 3

4 found

count = 4

5 not found

longest = 4
```

---

### num = 3

```text
2 exists

Skip
```

---

### num = 2

```text
1 exists

Skip
```

Final Answer

```text
4
```

---

# Why do we check `num - 1`?

Without this condition:

```text
1 2 3 4
```

The algorithm would count:

```text
Starting from 1

1→2→3→4

Starting from 2

2→3→4

Starting from 3

3→4

Starting from 4

4
```

The same sequence is processed multiple times.

With

```java
if (!set.contains(num - 1))
```

Only `1` starts the sequence.

This ensures every consecutive sequence is processed exactly once.

---

# Key Learning

* Brute Force uses Linear Search for every element.
* Sorting simplifies the problem but increases the time complexity to **O(n log n)**.
* HashSet provides **O(1)** average lookup.
* The condition `!set.contains(num - 1)` prevents duplicate processing.
* Every sequence is counted exactly once, achieving **O(n)** time complexity.

---

# Complexity Comparison

| Approach          | Time Complexity | Space Complexity |
| ----------------- | --------------- | ---------------- |
| Brute Force       | O(n²)           | O(1)             |
| Better (Sorting)  | O(n log n)      | O(log n)         |
| Optimal (HashSet) | O(n)            | O(n)             |

---

# Interview Takeaways

* Explain the brute-force solution first.
* Improve it using sorting.
* Finally, optimize it with a HashSet.
* Mention why checking `num - 1` avoids redundant work.
* Be prepared to explain why the HashSet solution is **algorithmically optimal**, even if a particular LeetCode submission using sorting sometimes shows a lower runtime due to JVM optimizations and constant factors.
