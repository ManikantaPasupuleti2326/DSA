# 844. Backspace String Compare

## Problem Statement

Given two strings `s` and `t`, determine whether they are equal after simulating typing into an empty text editor.

* Lowercase letters are typed normally.
* `#` represents a **backspace**, which removes the previous character.
* If the text editor is already empty, pressing `#` has no effect.

Return `true` if both strings produce the same final text; otherwise, return `false`.

---

## Examples

### Example 1

**Input**

```text
s = "ab#c"
t = "ad#c"
```

**Output**

```text
true
```

**Explanation**

```text
ab#c → ac
ad#c → ac
```

Both strings become `"ac"`.

---

### Example 2

**Input**

```text
s = "ab##"
t = "c#d#"
```

**Output**

```text
true
```

**Explanation**

```text
ab## → ""
c#d# → ""
```

Both strings become an empty string.

---

### Example 3

**Input**

```text
s = "a#c"
t = "b"
```

**Output**

```text
false
```

**Explanation**

```text
a#c → c
b → b
```

The final strings are different.

---

# Approach

We simulate typing into a text editor using a **StringBuilder**.

### Algorithm

1. Create an empty result.
2. Traverse the string from left to right.
3. If the current character is a lowercase letter:

   * Add it to the result.
4. If the current character is `#`:

   * Remove the last character from the result if it is not empty.
5. Repeat the same process for both strings.
6. Compare the two processed strings.
7. Return `true` if they are equal; otherwise, return `false`.

---

## Dry Run

### Input

```text
s = "ab#c"
```

| Character | Operation             | Result |
| --------- | --------------------- | ------ |
| a         | Append                | a      |
| b         | Append                | ab     |
| #         | Remove last character | a      |
| c         | Append                | ac     |

Final String

```text
ac
```

---

# Time Complexity

Each string is traversed only once.

```text
O(n)
```

where `n` is the length of the string.

---

# Space Complexity

The processed string is stored separately.

```text
O(n)
```

---

# Follow-Up (Optimized Approach)

The problem also asks whether it can be solved in:

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

### Optimized Idea

Instead of creating a new processed string:

* Start from the end of both strings.
* Keep track of how many characters should be skipped because of backspaces.
* Ignore characters that are removed by `#`.
* Compare the next valid characters from both strings.
* If all valid characters match, return `true`; otherwise, return `false`.

This approach eliminates the need for extra space while maintaining linear time complexity.

---

# Key Takeaways

* Treat `#` as a backspace operation.
* Ignore backspaces when the current text is empty.
* Process both strings independently.
* Compare the final processed strings.
* The basic simulation approach is simple and easy to understand.
* The two-pointer approach is the optimal solution for interviews.

---

# Complexity Summary

| Approach                | Time Complexity | Space Complexity |
| ----------------------- | --------------- | ---------------- |
| String Simulation       | **O(n)**        | **O(n)**         |
| Two Pointer (Optimized) | **O(n)**        | **O(1)**         |
