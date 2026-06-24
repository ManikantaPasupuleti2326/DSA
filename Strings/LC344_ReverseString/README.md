# 344. Reverse String

## Problem Statement

Write a function that reverses a string.

The input string is given as an array of characters `s`.

You must do this by modifying the input array **in-place** with **O(1)** extra memory.

---

## Example 1

**Input:**

```text
s = ["h","e","l","l","o"]
```

**Output:**

```text
["o","l","l","e","h"]
```

---

## Example 2

**Input:**

```text
s = ["H","a","n","n","a","h"]
```

**Output:**

```text
["h","a","n","n","a","H"]
```

---

## Constraints

* `1 <= s.length <= 10^5`
* `s[i]` is a printable ASCII character.

---

## Approach

### Two Pointers

1. Initialize:

   * `left = 0`
   * `right = s.length - 1`
2. While `left < right`:

   * Swap `s[left]` and `s[right]`
   * Increment `left`
   * Decrement `right`
3. Continue until both pointers meet.
4. The array becomes reversed in-place.

---

## Why It Works

```text
The first character should move
to the last position.

The last character should move
to the first position.

By swapping characters from both ends,
the string gets reversed efficiently.
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

No extra array is used.

---

## Key Concept

```text
left  → Start of array

right → End of array

Swap both characters

Move inward
```

---

## Example Walkthrough

### Input

```text
s = ["h","e","l","l","o"]
```

### Process

```text
left = 0
right = 4

Swap h and o

[o,e,l,l,h]

----------------

left = 1
right = 3

Swap e and l

[o,l,l,e,h]
```

### Result

```text
["o","l","l","e","h"]
```

---

## Interview Insight

```text
This is one of the most common
Two Pointer interview problems.

It teaches:

1. Two Pointer Technique
2. In-Place Modification
3. Swapping Elements
4. Space Optimization

Frequently asked in coding interviews.
```

---

## Alternative Approach

### Extra Array

```text
Create another array
and copy characters in reverse order.
```

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

Not preferred because the problem requires:

```text
O(1) Extra Space
```

---

## Related Problems

```text
125. Valid Palindrome
9. Palindrome Number
557. Reverse Words in a String III
151. Reverse Words in a String
```
