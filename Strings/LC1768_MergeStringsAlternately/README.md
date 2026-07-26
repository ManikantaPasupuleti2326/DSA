# 1768. Merge Strings Alternately

## Problem Statement

You are given two strings `word1` and `word2`.

Merge the strings by taking one character alternately from each string, starting with `word1`.

If one string is longer than the other, append the remaining characters of the longer string to the end of the merged string.

Return the merged string.

---

## Examples

### Example 1

**Input**
```
word1 = "abc"
word2 = "pqr"
```

**Output**
```
apbqcr
```

**Explanation**
```
word1 : a   b   c
word2 :   p   q   r
Merged: a p b q c r
```

---

### Example 2

**Input**
```
word1 = "ab"
word2 = "pqrs"
```

**Output**
```
apbqrs
```

**Explanation**
```
word1 : a   b
word2 :   p   q   r   s
Merged: a p b q r s
```

Since `word2` is longer, the remaining characters `"rs"` are appended at the end.

---

### Example 3

**Input**
```
word1 = "abcd"
word2 = "pq"
```

**Output**
```
apbqcd
```

**Explanation**
```
word1 : a   b   c   d
word2 :   p   q
Merged: a p b q c d
```

Since `word1` is longer, the remaining characters `"cd"` are appended at the end.

---

# Intuition

The goal is to merge two strings by picking one character alternately from each string.

- Start from the first character of `word1`.
- Then take the first character of `word2`.
- Continue alternating until one of the strings ends.
- If one string still has remaining characters, append them to the end of the result.

---

# Approach

1. Create an empty result.
2. Traverse both strings using a single index.
3. If the current index exists in `word1`, append that character.
4. If the current index exists in `word2`, append that character.
5. Repeat until all characters from both strings are processed.
6. Return the merged string.

---

# Dry Run

### Input
```
word1 = "abc"
word2 = "pqr"
```

| Index | Character from word1 | Character from word2 | Result |
|------:|----------------------|----------------------|--------|
| 0 | a | p | ap |
| 1 | b | q | apbq |
| 2 | c | r | apbqcr |

**Final Output**
```
apbqcr
```

---

### Dry Run 2

### Input
```
word1 = "ab"
word2 = "pqrs"
```

| Index | Character Added | Result |
|------:|-----------------|--------|
| 0 | a, p | ap |
| 1 | b, q | apbq |
| 2 | r | apbqr |
| 3 | s | apbqrs |

**Final Output**
```
apbqrs
```

---

# Complexity Analysis

**Time Complexity:** `O(n + m)`

- Every character from both strings is processed exactly once.

**Space Complexity:** `O(n + m)`

- The merged string stores all characters from both input strings.

Where:
- `n` = length of `word1`
- `m` = length of `word2`

---

# Key Points

- Start merging with `word1`.
- Alternate characters from both strings.
- Append the remaining characters of the longer string after one string ends.
- Every character is visited only once, making the solution efficient.

---

# Interview Takeaways

- This problem tests string traversal and boundary checking.
- Always verify that the current index is within the length of each string before accessing a character.
- Using a mutable string builder (or an equivalent data structure) is preferred over repeated string concatenation because it is more efficient.