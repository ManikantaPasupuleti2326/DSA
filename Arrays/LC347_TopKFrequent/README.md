# 347. Top K Frequent Elements

## Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

You may return the answer in any order.

---

## Example 1

**Input:**

```text id="b0t4dh"
nums = [1,1,1,2,2,3]
k = 2
```

**Output:**

```text id="sm2llk"
[1,2]
```

**Explanation:**

```text id="k1gpmx"
Frequency:

1 → 3 times
2 → 2 times
3 → 1 time

Top 2 frequent elements are:

[1,2]
```

---

## Example 2

**Input:**

```text id="jlwm6l"
nums = [1]
k = 1
```

**Output:**

```text id="5w02my"
[1]
```

---

## Example 3

**Input:**

```text id="1m2g85"
nums = [1,2,1,2,1,2,3,1,3,2]
k = 2
```

**Output:**

```text id="zqbp4r"
[1,2]
```

**Explanation:**

```text id="o0fw90"
Frequency:

1 → 4 times
2 → 4 times
3 → 2 times

Top 2 frequent elements are:

[1,2]
```

---

## Constraints

* `1 <= nums.length <= 10^5`
* `-10^4 <= nums[i] <= 10^4`
* `1 <= k <= number of unique elements`
* The answer is guaranteed to be unique.

---

## Follow Up

Can you solve the problem with a time complexity better than:

```text id="f83y6q"
O(n log n)
```

---

## Approach

### HashMap + Bucket Sort (Optimal)

1. Traverse the array and count the frequency of each element using a HashMap.
2. Create buckets where the index represents the frequency.
3. Place each element into the bucket corresponding to its frequency.
4. Traverse the buckets from highest frequency to lowest.
5. Collect elements until `k` elements are obtained.
6. Return the result.

---

## Why It Works

```text id="yijjgi"
The HashMap efficiently counts
the frequency of each element.

Bucket Sort groups elements
based on their frequencies,
allowing us to retrieve the
most frequent elements without
sorting the entire dataset.
```

---

## Time Complexity

```text id="rvot07"
O(n)
```

---

## Space Complexity

```text id="6j2n8u"
O(n)
```

---

## Alternative Approaches

### HashMap + Sorting

```text id="1vdf4j"
Count frequencies.

Sort entries based on frequency.

Return first k elements.
```

**Time Complexity**

```text id="yrv32h"
O(n log n)
```

---

### HashMap + Priority Queue (Heap)

```text id="ws0t6w"
Store frequency in a max heap.

Extract the top k elements.
```

**Time Complexity**

```text id="k5rlo3"
O(n log k)
```

---

## Key Concept

```text id="awpd0l"
Step 1

HashMap

Element → Frequency

↓

Step 2

Group elements by frequency

↓

Step 3

Collect highest frequency elements
until k elements are found.
```

---

## Example Walkthrough

### Input

```text id="spoyk7"
nums = [1,1,1,2,2,3]
k = 2
```

### Frequency Map

```text id="rxt5wr"
1 → 3

2 → 2

3 → 1
```

### Buckets

```text id="d0k10n"
Frequency 3 → [1]

Frequency 2 → [2]

Frequency 1 → [3]
```

### Result

```text id="gkl69t"
[1,2]
```

---

## Interview Insight

```text id="wm77v0"
This problem teaches:

1. Frequency Counting
2. HashMap
3. Bucket Sort
4. Priority Queue (Heap)
5. Optimization Techniques

Frequently asked in:

- Amazon
- Google
- Microsoft
- Meta
- Adobe
```

---

## Related Problems

```text id="dovlx3"
215. Kth Largest Element in an Array
451. Sort Characters By Frequency
692. Top K Frequent Words
973. K Closest Points to Origin
```
