# 392. Is Subsequence

**Difficulty:** Easy  
**Topics:** Two Pointers, String

---

# Problem Statement

Given two strings `s` and `t`, determine whether `s` is a **subsequence** of `t`.

A subsequence is formed by deleting zero or more characters from a string **without changing the relative order** of the remaining characters.

---

# Examples

### Example 1

```
Input:
s = "abc"
t = "ahbgdc"

Output:
true
```

**Explanation:**

```
t = a h b g d c
    ↑   ↑     ↑
s = a   b     c
```

The characters of `s` appear in `t` in the same order.

---

### Example 2

```
Input:
s = "axc"
t = "ahbgdc"

Output:
false
```

**Explanation:**

```
t = a h b g d c
    ↑
s = a x c
```

Character `x` does not exist in `t`, so `s` is not a subsequence.

---

# Intuition

The order of characters is important.

- Characters do **not** need to be adjacent.
- They **must** appear in the same relative order.
- If all characters of `s` can be matched in order while traversing `t`, then `s` is a subsequence.

---

# Approach

1. Traverse both strings from left to right.
2. Compare the current characters.
3. If the characters match, move to the next character in `s`.
4. Always continue traversing `t`.
5. If all characters of `s` are matched before reaching the end of `t`, return `true`; otherwise, return `false`.

---

# Dry Run

### Input

```
s = "abc"
t = "ahbgdc"
```

| Character in `s` | Matching Character in `t` | Status |
|------------------|---------------------------|--------|
| a | a | Matched |
| b | b | Matched |
| c | c | Matched |

Result:

```
true
```

---

### Input

```
s = "axc"
t = "ahbgdc"
```

| Character in `s` | Matching Character in `t` | Status |
|------------------|---------------------------|--------|
| a | a | Matched |
| x | Not Found | Failed |

Result:

```
false
```

---

# Complexity Analysis

### Time Complexity

```
O(n)
```

where `n` is the length of `t`.

---

### Space Complexity

```
O(1)
```

Only a constant amount of extra space is required.

---

# Follow-Up

Suppose there are a huge number of queries (`s₁`, `s₂`, ..., `sₖ`) while `t` remains the same.

Instead of scanning `t` for every query:

- Preprocess `t` by storing the positions of every character.
- For each query, use **Binary Search** to find the next valid occurrence of each character.

This reduces the time required for each query significantly after the initial preprocessing.

---

# Key Points

- The order of characters must remain the same.
- Characters do not need to be consecutive.
- Efficiently solved using the **Two Pointers** technique.
- For many queries on the same `t`, preprocessing with **Binary Search** is the optimal approach.