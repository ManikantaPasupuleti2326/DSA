# 151. Reverse Words in a String

## Problem Statement

Given a string `s`, reverse the order of the words in the string.

A word is defined as a sequence of non-space characters. The input string may contain leading spaces, trailing spaces, or multiple spaces between words. The output should contain only a single space between words, with no leading or trailing spaces.

---

## Examples

### Example 1

**Input:**

```
the sky is blue
```

**Output:**

```
blue is sky the
```

---

### Example 2

**Input:**

```
  hello world  
```

**Output:**

```
world hello
```

**Explanation:**
The leading and trailing spaces are removed, and the words are reversed.

---

### Example 3

**Input:**

```
a good   example
```

**Output:**

```
example good a
```

**Explanation:**
Multiple spaces between words are reduced to a single space in the final output.

---

## Approach

The solution follows these steps:

1. Remove any leading and trailing spaces from the input string.
2. Split the string into individual words using one or more spaces as the delimiter.
3. Traverse the array of words from the last element to the first.
4. Append each word to the result while inserting a single space between consecutive words.
5. Return the final reversed string.

This approach automatically removes extra spaces and produces the required output format.

---

## Algorithm

1. Read the input string.
2. Trim the leading and trailing spaces.
3. Separate the words based on one or more whitespace characters.
4. Traverse the words in reverse order.
5. Build the output string by appending one word at a time.
6. Insert a single space between adjacent words.
7. Return the resulting string.

---

## Time Complexity

* Splitting the string into words: **O(n)**
* Traversing the words in reverse order: **O(n)**

**Overall Time Complexity:** **O(n)**

---

## Space Complexity

* The array of words and the output string require additional memory.

**Overall Space Complexity:** **O(n)**

---

## Key Points

* Handles leading and trailing spaces.
* Removes multiple spaces between words.
* Maintains only a single space between consecutive words in the output.
* Preserves the characters within each word while reversing only the order of the words.
* Works efficiently in linear time.

---

## Edge Cases

* Single-word string.
* Leading spaces before the first word.
* Trailing spaces after the last word.
* Multiple consecutive spaces between words.
* Strings containing letters, digits, or a combination of both.

---

## Follow-up

The problem also asks whether it can be solved **in-place with O(1) extra space** if the string is mutable.

An in-place solution is possible by:

* Reversing the entire string.
* Reversing each individual word.
* Removing extra spaces while shifting characters.

This approach achieves **O(n)** time complexity with **O(1)** extra space.
