# 242. Valid Anagram

## Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of another word or phrase, using all the original letters exactly once.

---

## Example 1

**Input:**

```text
s = "anagram"
t = "nagaram"
```

**Output:**

```text
true
```

---

## Example 2

**Input:**

```text
s = "rat"
t = "car"
```

**Output:**

```text
false
```

---

## Constraints

* `1 <= s.length, t.length <= 5 * 10^4`
* `s` and `t` consist of lowercase English letters.

---

## Follow Up

### What if the inputs contain Unicode characters?

```text
For Unicode characters, use a HashMap
instead of a fixed-size frequency array.

The HashMap can store frequencies for
any character regardless of language.
```

---

## Approach

### Frequency Counting

1. If the lengths of the two strings are different, return `false`.
2. Create a frequency array of size 26.
3. Traverse both strings simultaneously:

   * Increment the count for characters in `s`.
   * Decrement the count for characters in `t`.
4. Check the frequency array:

   * If all counts are zero, the strings are anagrams.
   * Otherwise, they are not.

---

## Why It Works

```text
Two strings are anagrams if they contain
the same characters with the same frequencies.

By counting character occurrences,
we can efficiently verify whether both
strings have identical frequency distributions.
```

---

## Time Complexity

```text
O(n)
```

where `n` is the length of the strings.

---

## Space Complexity

```text
O(1)
```

The frequency array size is fixed at 26.

---

## Alternative Approach

### Sorting

```text
Sort both strings.

If the sorted strings are equal,
they are anagrams.
```

**Time Complexity:** `O(n log n)`

**Space Complexity:** `O(n)`

---

## Key Concept

```text
Anagram Condition:

Frequency of every character in s
must equal

Frequency of every character in t
```

---

## Interview Insight

```text
This is one of the most common
String + Hashing interview questions.

It teaches:

1. Frequency Counting
2. Character Arrays
3. HashMap Usage
4. String Manipulation

The frequency-count approach is the
optimal solution.
```

---

## Related Problems

```text
49. Group Anagrams
383. Ransom Note
387. First Unique Character in a String
438. Find All Anagrams in a String
```
