# 58. Length of Last Word

## Problem Statement

Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A **word** is a maximal substring consisting of non-space characters only.

---

## Example 1

**Input:**

```text
s = "Hello World"
```

**Output:**

```text
5
```

**Explanation:**

```text
The last word is "World" with length 5.
```

---

## Example 2

**Input:**

```text
s = "   fly me   to   the moon  "
```

**Output:**

```text
4
```

**Explanation:**

```text
The last word is "moon" with length 4.
```

---

## Example 3

**Input:**

```text
s = "luffy is still joyboy"
```

**Output:**

```text
6
```

**Explanation:**

```text
The last word is "joyboy" with length 6.
```

---

## Constraints

* `1 <= s.length <= 10^4`
* `s` consists of only English letters and spaces `' '`.
* There will be at least one word in `s`.

---

## Approach

1. Start traversing the string from the end.
2. Skip all trailing spaces.
3. Count the characters of the last word until a space or the beginning of the string is reached.
4. Return the count.

### Why It Works

```text
The last word is located at the end of the string
after ignoring any trailing spaces.

By traversing from right to left, we can directly
find the length of the last word without processing
the entire string multiple times.
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

---

## Key Concept

```text
Traverse from the end of the string.

1. Ignore trailing spaces.
2. Count characters until a space is found.

This efficiently finds the length of the last word.
```
