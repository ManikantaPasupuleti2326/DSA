# Reverse Vowels of a String

## Problem Statement

Given a string `s`, reverse only the vowels in the string and return the modified string.

The vowels are:

* `a`, `e`, `i`, `o`, `u`
* `A`, `E`, `I`, `O`, `U`

All non-vowel characters must remain in their original positions.

---

## Examples

### Example 1

**Input**

```text
IceCreAm
```

**Output**

```text
AceCreIm
```

**Explanation**

The vowels are:

```text
I, e, e, A
```

After reversing:

```text
A, e, e, I
```

Replacing them back into their original vowel positions gives:

```text
AceCreIm
```

---

### Example 2

**Input**

```text
leetcode
```

**Output**

```text
leotcede
```

---

## Constraints

* `1 <= s.length <= 3 × 10⁵`
* The string consists of printable ASCII characters.

---

## Approach

This problem can be solved efficiently using the **Two Pointer** technique.

### Algorithm

1. Convert the input string into a mutable character array.
2. Initialize two pointers:

   * One at the beginning of the string.
   * One at the end of the string.
3. Move the left pointer forward until it points to a vowel.
4. Move the right pointer backward until it points to a vowel.
5. Swap the vowels at both pointers.
6. Move both pointers inward.
7. Repeat until the pointers meet or cross.
8. Convert the character array back into a string and return it.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` (due to the mutable character array created from the immutable string)

---

## Key Concepts

* Two Pointer Technique
* String Manipulation
* Character Arrays
* Conditional Traversal

---

## Tags

* Strings
* Two Pointers
* Easy
* LeetCode 345
