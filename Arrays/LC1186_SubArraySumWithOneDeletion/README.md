# 1186. Maximum Subarray Sum with One Deletion

## Problem Statement

Given an integer array `arr`, find the maximum possible sum of a **non-empty contiguous subarray** where you are allowed to **delete at most one element** from the chosen subarray.

The resulting subarray must still contain **at least one element** after the deletion.

---

## Examples

### Example 1

**Input**
```text
arr = [1, -2, 0, 3]
```

**Output**
```text
4
```

**Explanation**

Choose the subarray:

```text
[1, -2, 0, 3]
```

Delete `-2`:

```text
[1, 0, 3]
```

Sum:

```text
1 + 0 + 3 = 4
```

---

### Example 2

**Input**

```text
arr = [1, -2, -2, 3]
```

**Output**

```text
3
```

**Explanation**

Deleting one element cannot produce a better sum than simply taking:

```text
[3]
```

Maximum sum = **3**

---

### Example 3

**Input**

```text
arr = [-1, -1, -1, -1]
```

**Output**

```text
-1
```

**Explanation**

The subarray cannot become empty after deletion.

Choosing

```text
[-1]
```

and deleting it is not allowed.

---

# Approach

This problem is an extension of **Kadane's Algorithm**.

Instead of maintaining only one running maximum, we maintain **two dynamic programming states**.

### State 1: `noDeletion`

Represents the maximum subarray sum ending at the current index **without deleting any element**.

Transition:

```java
noDeletion = Math.max(arr[i], noDeletion + arr[i]);
```

Either:

- Start a new subarray from the current element.
- Extend the previous subarray.

---

### State 2: `oneDeletion`

Represents the maximum subarray sum ending at the current index **after deleting one element**.

Transition:

```java
oneDeletion = Math.max(oneDeletion + arr[i], noDeletion);
```

There are two possibilities:

- The deletion was already used earlier, so continue the current subarray.
- Delete the current element and keep the previous `noDeletion` value.

---

### Algorithm

1. Initialize:
   - `noDeletion = arr[0]`
   - `oneDeletion = 0`
   - `answer = arr[0]`
2. Traverse the array from left to right.
3. Update both DP states.
4. Keep track of the maximum answer.
5. Return the final answer.

---

# Dry Run

Input:

```text
[1, -2, 0, 3]
```

| Index | Value | noDeletion | oneDeletion | Answer |
|------:|------:|-----------:|-------------:|--------:|
|0|1|1|0|1|
|1|-2|-1|1|1|
|2|0|0|1|1|
|3|3|3|4|4|

Final Answer:

```text
4
```

---

# Java Solution

```java
class Solution {

    public int maximumSum(int[] arr) {

        int noDeletion = arr[0];
        int oneDeletion = 0;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            oneDeletion = Math.max(oneDeletion + arr[i], noDeletion);

            noDeletion = Math.max(arr[i], noDeletion + arr[i]);

            ans = Math.max(ans, Math.max(noDeletion, oneDeletion));
        }

        return ans;
    }
}
```

---

# Complexity Analysis

### Time Complexity

```text
O(n)
```

The array is traversed exactly once.

---

### Space Complexity

```text
O(1)
```

Only a few variables are used regardless of the input size.

---

# Key Insight

Maintain two running answers while scanning the array:

- **noDeletion** → Best sum ending at the current index without deleting any element.
- **oneDeletion** → Best sum ending at the current index after deleting one element.

At every index, decide whether to:

- Continue the existing subarray.
- Start a new subarray.
- Delete the current element.
- Continue after a previous deletion.

This dynamic programming approach extends Kadane's Algorithm and efficiently finds the maximum subarray sum with at most one deletion in **linear time**.