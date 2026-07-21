# 859. Buddy Strings

## Problem Statement

Given two strings `s` and `goal`, determine whether it is possible to make `s` equal to `goal` by performing **exactly one swap** of two different indices in `s`.

A swap means selecting two different positions `i` and `j` (`i != j`) and exchanging the characters at those positions.

Return:

* `true` if one swap can make `s` equal to `goal`.
* `false` otherwise.

---

## Examples

### Example 1

**Input**

```text
s = "ab"
goal = "ba"
```

**Output**

```text
true
```

**Explanation**

Swapping the characters at indices `0` and `1` in `"ab"` produces `"ba"`, which matches the goal string.

---

### Example 2

**Input**

```text
s = "ab"
goal = "ab"
```

**Output**

```text
false
```

**Explanation**

Although the strings are already equal, the problem requires **exactly one swap**. Swapping `'a'` and `'b'` results in `"ba"`, which no longer matches the goal.

---

### Example 3

**Input**

```text
s = "aa"
goal = "aa"
```

**Output**

```text
true
```

**Explanation**

Swapping the two identical `'a'` characters keeps the string unchanged, so the strings remain equal after exactly one swap.

---

# Key Observations

### 1. Lengths must be equal

If the two strings have different lengths, one swap can never make them equal.

---

### 2. Strings are already equal

If `s` and `goal` are identical, the answer is **true only if** the string contains at least one duplicate character.

Why?

Because the problem requires **exactly one swap**.

* If duplicate characters exist, swapping them leaves the string unchanged.
* If all characters are unique, every swap changes the string, so it can no longer equal the goal.

---

### 3. Strings are different

Compare both strings character by character.

Record the indices where the characters differ.

There are three possible cases:

* **Exactly 2 mismatches** → A single swap might fix the strings.
* **More than 2 mismatches** → Impossible with one swap.
* **Only 1 mismatch** → Also impossible because one swap always changes two positions.

---

### 4. Cross Comparison

When there are exactly two mismatched positions:

* The character from the first mismatched position in `s` must match the second mismatched position in `goal`.
* The character from the second mismatched position in `s` must match the first mismatched position in `goal`.

If both conditions are satisfied, one swap makes the strings equal.

---

# Algorithm

1. Check whether the lengths are equal.
2. If the strings are already equal:

   * Search for any duplicate character.
   * If a duplicate exists, return `true`.
   * Otherwise, return `false`.
3. If the strings are different:

   * Compare them character by character.
   * Store the positions where they differ.
   * If more than two mismatches are found, return `false`.
4. If exactly two mismatches exist:

   * Verify that swapping those two characters in `s` would produce `goal`.
5. Return the final result.

---

# Dry Run

### Input

```text
s = "aaaaaaabc"
goal = "aaaaaaacb"
```

Comparison:

| Index | s | goal | Status    |
| ----: | - | ---- | --------- |
|     0 | a | a    | Same      |
|     1 | a | a    | Same      |
|     2 | a | a    | Same      |
|     3 | a | a    | Same      |
|     4 | a | a    | Same      |
|     5 | a | a    | Same      |
|     6 | a | a    | Same      |
|     7 | b | c    | Different |
|     8 | c | b    | Different |

Mismatched indices:

```text
7
8
```

Swapping the characters at indices `7` and `8` transforms:

```text
aaaaaaabc
```

into

```text
aaaaaaacb
```

which matches the goal string.

Therefore, the answer is:

```text
true
```

---

# Time Complexity

* **O(n)**

Only a single traversal of the strings is required.

---

# Space Complexity

* **O(1)**

Only a constant amount of extra memory is used.

---

# Important Interview Points

* The strings must have the same length.
* Exactly one swap is allowed.
* If the strings are already equal, duplicate characters are required.
* One swap can correct only **two mismatched positions**.
* More than two mismatches immediately make the answer `false`.
* Cross-checking the two mismatched characters determines whether a single swap will produce the goal string.
