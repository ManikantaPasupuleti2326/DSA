# 228. Summary Ranges

## Problem Statement

Given a **sorted** and **unique** integer array `nums`, return the smallest sorted list of ranges that covers all the numbers in the array exactly.

Each range should be represented as:

* `"a->b"` if the range contains more than one number.
* `"a"` if the range contains only one number.

---

## Examples

### Example 1

**Input**

```text id="mjlwmj"
nums = [0,1,2,4,5,7]
```

**Output**

```text id="0vbllq"
["0->2","4->5","7"]
```

**Explanation**

* Numbers `0,1,2` are consecutive → `"0->2"`
* Numbers `4,5` are consecutive → `"4->5"`
* Number `7` stands alone → `"7"`

---

### Example 2

**Input**

```text id="ytdhk8"
nums = [0,2,3,4,6,8,9]
```

**Output**

```text id="0pnh7z"
["0","2->4","6","8->9"]
```

**Explanation**

* `0` is a single number.
* `2,3,4` form a consecutive range.
* `6` is a single number.
* `8,9` form a consecutive range.

---

## Approach

### Linear Traversal

The array is already sorted and contains unique elements, making it easy to identify consecutive sequences.

### Algorithm

1. Traverse the array from left to right.
2. Mark the current element as the start of a range.
3. Continue moving forward while the next element is exactly one greater than the current element.
4. When the consecutive sequence ends:

   * If the start and end are the same, add the single number.
   * Otherwise, add the range in the format `"start->end"`.
5. Repeat until all elements are processed.

---

## Dry Run

### Input

```text id="3wj9g6"
nums = [0,1,2,4,5,7]
```

| Start | End | Output   |
| ----: | --: | -------- |
|     0 |   2 | `"0->2"` |
|     4 |   5 | `"4->5"` |
|     7 |   7 | `"7"`    |

Final Result

```text id="7rshwc"
["0->2","4->5","7"]
```

---

## Edge Cases

### Empty Array

```text id="rk8a5y"
nums = []
```

Output

```text id="59mfj6"
[]
```

---

### Single Element

```text id="zvwtvs"
nums = [5]
```

Output

```text id="9h86eh"
["5"]
```

---

### All Consecutive

```text id="1e35dm"
nums = [1,2,3,4,5]
```

Output

```text id="xq4yvf"
["1->5"]
```

---

### No Consecutive Elements

```text id="sv3rti"
nums = [1,3,5,7]
```

Output

```text id="l1czk2"
["1","3","5","7"]
```

---

## Complexity Analysis

| Complexity       | Value                                |
| ---------------- | ------------------------------------ |
| Time Complexity  | `O(n)`                               |
| Space Complexity | `O(1)` *(excluding the output list)* |

---

## Why is this approach optimal?

* The array is traversed only once.
* Consecutive ranges are identified during the traversal.
* No sorting or additional data structures are required.
* Uses constant extra space apart from the result list.

---

## Key Concepts Learned

* Array Traversal
* Two-Pointer Technique
* Consecutive Sequence Detection
* String Formatting
* Time and Space Complexity Analysis

---

## Conclusion

By taking advantage of the sorted and unique nature of the input array, the solution efficiently groups consecutive numbers into ranges using a single traversal. This approach achieves **O(n)** time complexity with **O(1)** extra space (excluding the output list), making it an optimal solution for the problem.
