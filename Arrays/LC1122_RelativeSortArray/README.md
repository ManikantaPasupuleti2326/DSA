# 1122. Relative Sort Array

## Problem Statement

Given two integer arrays `arr1` and `arr2`, where all elements in `arr2` are distinct and every element of `arr2` is present in `arr1`, sort `arr1` such that:

- The elements appearing in `arr2` come first and follow the same relative order as in `arr2`.
- The remaining elements that are not present in `arr2` should be placed at the end in **ascending order**.

---

## Examples

### Example 1

**Input**

```text
arr1 = [2,3,1,3,2,4,6,7,9,2,19]
arr2 = [2,1,4,3,9,6]
```

**Output**

```text
[2,2,2,1,4,3,3,9,6,7,19]
```

---

### Example 2

**Input**

```text
arr1 = [28,6,22,8,44,17]
arr2 = [22,28,8,6]
```

**Output**

```text
[22,28,8,6,17,44]
```

---

## Constraints

- `1 <= arr1.length, arr2.length <= 1000`
- `0 <= arr1[i], arr2[i] <= 1000`
- All elements in `arr2` are distinct.
- Every element in `arr2` exists in `arr1`.

---

# Intuition

Instead of repeatedly searching for every element of `arr2` inside `arr1`, we first count the frequency of every element in `arr1` using a **HashMap**.

Once the frequencies are known:

- Place all elements of `arr2` into the result according to their frequencies.
- Remove the processed elements from the HashMap.
- Collect the remaining elements, sort them, and append them to the result.

This avoids unnecessary repeated traversals of `arr1` and makes the solution more efficient.

---

# Approach

1. Create a `HashMap` to store the frequency of each element in `arr1`.
2. Traverse `arr2`.
   - Retrieve the frequency of the current element.
   - Add that element to the result array as many times as it appears.
   - Remove the element from the HashMap.
3. The HashMap now contains only the elements that are not present in `arr2`.
4. Store these remaining elements in an `ArrayList`.
5. Sort the list in ascending order.
6. Append the sorted elements to the result array.
7. Return the final result.

---

# Algorithm

1. Count the frequency of each element in `arr1`.
2. Initialize an empty result array.
3. For every element in `arr2`:
   - Retrieve its frequency.
   - Insert it into the result array `frequency` times.
   - Remove it from the HashMap.
4. Traverse the remaining entries in the HashMap.
5. Add every remaining element to a list according to its frequency.
6. Sort the list.
7. Append the sorted list to the result array.
8. Return the result.

---

# Dry Run

### Input

```text
arr1 = [2,3,1,3,2,4,6,7,9,2,19]
arr2 = [2,1,4,3,9,6]
```

### Step 1: Frequency Map

```text
{
2=3,
3=2,
1=1,
4=1,
6=1,
7=1,
9=1,
19=1
}
```

---

### Step 2: Place Elements According to `arr2`

```text
2 → 2 2 2
1 → 1
4 → 4
3 → 3 3
9 → 9
6 → 6
```

Result so far:

```text
[2,2,2,1,4,3,3,9,6]
```

---

### Step 3: Remaining Elements

After removing processed elements, the HashMap contains:

```text
{
7=1,
19=1
}
```

Remaining list:

```text
[7,19]
```

---

### Step 4: Sort Remaining Elements

```text
[7,19]
```

---

### Final Output

```text
[2,2,2,1,4,3,3,9,6,7,19]
```

---

# Complexity Analysis

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Build Frequency Map | **O(n)** |
| Traverse `arr2` | **O(m)** |
| Collect Remaining Elements | **O(k)** |
| Sort Remaining Elements | **O(k log k)** |

**Overall Time Complexity**

```text
O(n + m + k log k)
```

Where:

- `n` = size of `arr1`
- `m` = size of `arr2`
- `k` = number of elements not present in `arr2`

---

### Space Complexity

```text
O(n)
```

- HashMap stores element frequencies.
- ArrayList stores the remaining elements.

---

# Why This Approach?

Compared to the brute-force approach, this solution avoids repeatedly scanning `arr1` for every element of `arr2`.

Using a frequency map allows direct access to the number of occurrences of each element, reducing unnecessary work and improving efficiency.

---

# Key Concepts Used

- Arrays
- HashMap
- Frequency Counting
- ArrayList
- Sorting
- Greedy Construction

---

# Interview Takeaways

- Always think about using a **HashMap** when repeated searching can be replaced with frequency counting.
- Notice that only the elements **not present** in `arr2` need to be sorted.
- Removing processed elements from the HashMap makes it easy to identify the remaining elements.
- Before coding, compare the brute-force and optimized approaches and explain why the optimized solution is better.

---

# Learning Outcome

This problem demonstrates how frequency counting with a **HashMap** can simplify array manipulation problems. It also highlights the importance of separating processed and unprocessed elements and sorting only the necessary portion of the data to achieve a more efficient solution.