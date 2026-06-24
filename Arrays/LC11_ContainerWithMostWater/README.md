# 11. Container With Most Water

## Problem Statement

You are given an integer array `height` of length `n`.

There are `n` vertical lines drawn such that the two endpoints of the `iᵗʰ` line are:

```text
(i, 0) and (i, height[i])
```

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

You may not slant the container.

---

## Example 1

**Input:**

```text
height = [1,8,6,2,5,4,8,3,7]
```

**Output:**

```text
49
```

**Explanation:**

```text
Choose the lines at indices:

1 → height = 8
8 → height = 7

Width  = 8 - 1 = 7

Height = min(8, 7) = 7

Area = 7 × 7 = 49
```

This is the maximum amount of water the container can store.

---

## Example 2

**Input:**

```text
height = [1,1]
```

**Output:**

```text
1
```

---

## Constraints

* `n == height.length`
* `2 <= n <= 10^5`
* `0 <= height[i] <= 10^4`

---

## Approach

### Two Pointers

1. Initialize:

   * `left = 0`
   * `right = n - 1`
2. Calculate the area:

```text
Area = (right - left) × min(height[left], height[right])
```

3. Update the maximum area found so far.
4. Move the pointer with the smaller height:

   * If `height[left] < height[right]`, increment `left`.
   * Otherwise, decrement `right`.
5. Continue until the pointers meet.

---

## Why It Works

```text
The area depends on:

1. Width
2. Minimum Height

Moving the taller line cannot increase
the minimum height.

Therefore, we move the shorter line
hoping to find a taller line and
increase the area.
```

---

## Time Complexity

```text
O(n)
```

Each pointer moves at most `n` times.

---

## Space Complexity

```text
O(1)
```

---

## Key Concept

```text
Area =
Width × Height

Width  = right - left

Height = min(height[left], height[right])
```

---

## Example Walkthrough

### Input

```text
height = [1,8,6,2,5,4,8,3,7]
```

### Initial State

```text
left  = 0
right = 8

Width  = 8
Height = 1

Area = 8
```

Move `left` because height `1` is smaller.

### Best Container

```text
left  = 1
right = 8

Width  = 7
Height = 7

Area = 49
```

Maximum Area = `49`

---

## Interview Insight

```text
Brute Force:
Check every pair of lines

Time Complexity:
O(n²)

Optimized Solution:
Two Pointers

Time Complexity:
O(n)

This optimization is frequently asked
during coding interviews.
```

---

## Related Problems

```text
15. 3Sum
16. 3Sum Closest
18. 4Sum
167. Two Sum II
42. Trapping Rain Water
```
