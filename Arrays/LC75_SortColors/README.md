# 75. Sort Colors

## Problem Statement

Given an array `nums` containing `n` objects colored **red**, **white**, or **blue**, sort them **in-place** so that objects of the same color are adjacent.

We use:

* `0` → Red
* `1` → White
* `2` → Blue

You must solve this problem **without using the library's sort function**.

### Example 1

```text
Input: nums = [2,0,2,1,1,0]

Output: [0,0,1,1,2,2]
```

### Example 2

```text
Input: nums = [2,0,1]

Output: [0,1,2]
```

---

# Approach 1: Selection Sort

## Intuition

A straightforward approach is to sort the array using **Selection Sort**.

For every index:

* Find the smallest element in the remaining array.
* Swap it with the current index.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

Although this solution works, it is **not optimal** because the follow-up asks for a **one-pass** solution.

---

# Optimal Approach: Dutch National Flag Algorithm

## Definition

The **Dutch National Flag Algorithm** is an **in-place partitioning algorithm** developed by **Edsger W. Dijkstra**.

It partitions an array into **three regions** in a single traversal using constant extra space.

Since this problem contains only three values (`0`, `1`, and `2`), we can place each value directly into its correct region instead of sorting the entire array.

---

# Intuition

Instead of comparing every element with every other element,

we maintain **three pointers**.

```text
low
mid
high
```

Initially,

```text
low = 0
mid = 0
high = nums.length - 1
```

The array is divided into four regions.

```text
---------------------------------------------------
| 0's | 1's | Unknown Elements | 2's |
---------------------------------------------------

0 ........ low-1

low ...... mid-1

mid ...... high

high+1 ... n-1
```

Initially,

```text
Entire array = Unknown Region
```

As we process elements, the unknown region keeps shrinking until the array becomes sorted.

---

# Pointer Responsibilities

## low

Points to the position where the next **0** should be placed.

Everything before `low` is guaranteed to be `0`.

```text
0 0 0 | ?

      ^
     low
```

---

## mid

Points to the current element being processed.

```text
0 0 1 ? 2

      ^
     mid
```

Think of `mid` as:

> "Which element am I checking right now?"

---

## high

Points to the position where the next **2** should be placed.

Everything after `high` is guaranteed to be `2`.

```text
? | 2 2 2

    ^
   high
```

---

# Rules

## Case 1: nums[mid] == 0

A zero belongs on the left.

Swap

```text
nums[mid]
```

with

```text
nums[low]
```

Then

```text
low++
mid++
```

---

## Case 2: nums[mid] == 1

One already belongs in the middle.

Simply move

```text
mid++
```

---

## Case 3: nums[mid] == 2

A two belongs on the right.

Swap

```text
nums[mid]
```

with

```text
nums[high]
```

Then

```text
high--
```

**Do NOT increment `mid`.**

---

# Why don't we increment `mid` after swapping with `high`?

Suppose

```text
[2,1,0]
```

Swap

```text
2 ↔ 0
```

Array becomes

```text
[0,1,2]
```

The new element at `mid` is `0`.

We have **not processed this new element yet**.

If we immediately do

```text
mid++
```

we skip checking it.

Therefore,

after swapping with `high`, we only do

```text
high--
```

and examine the same `mid` position again.

---

# Dry Run

## Input

```text
[2,0,2,1,1,0]
```

### Step 1

```text
low = 0
mid = 0
high = 5

2 0 2 1 1 0
^         ^
M         H
```

Current element = 2

Swap with high

```text
0 0 2 1 1 2
```

```text
high--
```

---

### Step 2

Current element = 0

Swap with low

```text
0 0 2 1 1 2
```

```text
low++
mid++
```

---

### Step 3

Current element = 0

Swap with low

```text
0 0 2 1 1 2
```

```text
low++
mid++
```

---

### Step 4

Current element = 2

Swap with high

```text
0 0 1 1 2 2
```

```text
high--
```

---

### Step 5

Current element = 1

```text
mid++
```

---

### Step 6

Current element = 1

```text
mid++
```

Now

```text
mid > high
```

Stop.

Final Answer

```text
0 0 1 1 2 2
```

---

# Java Solution

```java
class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
```

---

# Complexity Analysis

| Complexity       | Value    |
| ---------------- | -------- |
| Time Complexity  | **O(n)** |
| Space Complexity | **O(1)** |

---

# Why This Algorithm Works

The algorithm always maintains the following invariant:

* Elements before `low` are `0`.
* Elements between `low` and `mid - 1` are `1`.
* Elements after `high` are `2`.
* Elements between `mid` and `high` are still unprocessed.

Each iteration processes one unknown element and reduces the size of the unknown region until the entire array is partitioned correctly.

---

# Interview Tips

* This is a classic **Dutch National Flag Algorithm** problem.
* The solution is expected to run in **O(n)** time and **O(1)** extra space.
* The most common interview question is:

> **Why don't we increment `mid` after swapping with `high`?**

**Answer:**

Because the element swapped from the `high` position has not been processed yet. It could be `0`, `1`, or `2`, so we must examine it before moving `mid`.

---

# Key Takeaways

* Uses **three pointers** (`low`, `mid`, `high`).
* Solves the problem in **one pass**.
* Requires **constant extra space**.
* Avoids unnecessary sorting.
* Frequently asked in product-based company interviews.
