# 414. Third Maximum Number

## Problem Statement

Given an integer array `nums`, return the **third distinct maximum** number in the array. If the third distinct maximum does not exist, return the **maximum** number.

---

## Examples

### Example 1

**Input**

```text
nums = [3,2,1]
```

**Output**

```text
1
```

**Explanation**

* First distinct maximum = 3
* Second distinct maximum = 2
* Third distinct maximum = 1

---

### Example 2

**Input**

```text
nums = [1,2]
```

**Output**

```text
2
```

**Explanation**

There are only two distinct numbers, so return the maximum value.

---

### Example 3

**Input**

```text
nums = [2,2,3,1]
```

**Output**

```text
1
```

**Explanation**

Duplicate values are counted only once.

Distinct values are:

```text
3, 2, 1
```

The third distinct maximum is `1`.

---

## Approach

### Single Pass (Optimal)

The idea is to maintain the **top three distinct maximum values** while traversing the array only once.

### Algorithm

1. Initialize three variables to store:

   * First maximum
   * Second maximum
   * Third maximum
2. Traverse the array.
3. Ignore duplicate values.
4. Update the three maximums whenever a larger distinct value is found.
5. After processing all elements:

   * If the third maximum exists, return it.
   * Otherwise, return the first maximum.

This approach avoids sorting and processes each element only once.

---

## Dry Run

### Input

```text
nums = [2,2,3,1]
```

### Iteration

| Current Number |          First Max | Second Max | Third Max |
| -------------: | -----------------: | ---------: | --------: |
|              2 |                  2 |          - |         - |
|              2 | Duplicate → Ignore |            |           |
|              3 |                  3 |          2 |         - |
|              1 |                  3 |          2 |         1 |

### Result

```text
Third Maximum = 1
```

---

## Handling Duplicates

Duplicate values should not be considered multiple times.

Example:

```text
nums = [5,5,4,3]
```

Distinct values are:

```text
5,4,3
```

The third distinct maximum is:

```text
3
```

---

## Edge Cases

### Case 1

```text
nums = [1]
```

Output

```text
1
```

---

### Case 2

```text
nums = [1,2]
```

Output

```text
2
```

---

### Case 3

```text
nums = [2,2,2]
```

Output

```text
2
```

Only one distinct number exists.

---

## Complexity Analysis

| Complexity       | Value  |
| ---------------- | ------ |
| Time Complexity  | `O(n)` |
| Space Complexity | `O(1)` |

---

## Why is this approach optimal?

* Traverses the array only once.
* Uses constant extra space.
* Avoids sorting, which would require `O(n log n)` time.
* Efficiently handles duplicate values.

---

## Key Concepts Learned

* Array Traversal
* Maintaining Top Three Maximum Values
* Handling Duplicate Elements
* Constant Space Optimization
* Single Pass Algorithm
* Time and Space Complexity Analysis

---

## Conclusion

The single-pass approach is the optimal solution for this problem. By maintaining the three largest distinct values while traversing the array once, the algorithm achieves **O(n)** time complexity and **O(1)** extra space, satisfying the follow-up requirement.
