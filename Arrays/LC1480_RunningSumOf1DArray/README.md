# 1480. Running Sum of 1D Array

## Problem Statement

Given an array `nums`, we define a **running sum** of an array as:

```text
runningSum[i] = sum(nums[0] ... nums[i])
```

Return the running sum of `nums`.

---

## Example 1

**Input:**

```text
nums = [1,2,3,4]
```

**Output:**

```text
[1,3,6,10]
```

**Explanation:**

```text
Running sum is obtained as follows:

[1,
 1 + 2,
 1 + 2 + 3,
 1 + 2 + 3 + 4]

= [1,3,6,10]
```

---

## Example 2

**Input:**

```text
nums = [1,1,1,1,1]
```

**Output:**

```text
[1,2,3,4,5]
```

**Explanation:**

```text
Running sum is obtained as follows:

[1,
 1 + 1,
 1 + 1 + 1,
 1 + 1 + 1 + 1,
 1 + 1 + 1 + 1 + 1]

= [1,2,3,4,5]
```

---

## Example 3

**Input:**

```text
nums = [3,1,2,10,1]
```

**Output:**

```text
[3,4,6,16,17]
```

---

## Constraints

* `1 <= nums.length <= 1000`
* `-10^6 <= nums[i] <= 10^6`

---

## Approach

1. Traverse the array from index `1`.
2. Add the previous running sum to the current element.
3. Store the result back in the same array.
4. Continue until the end of the array.
5. Return the modified array.

---

## Algorithm

```text
Initialize i from 1 to n-1

For each index:
    nums[i] = nums[i] + nums[i - 1]

Return nums
```

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

