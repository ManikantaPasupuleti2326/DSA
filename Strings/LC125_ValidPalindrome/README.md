# 125. Valid Palindrome

## Problem Statement

A phrase is considered a palindrome if, after:

* Converting all uppercase letters to lowercase.
* Removing all non-alphanumeric characters (letters and digits only).

it reads the same forward and backward.

Return **true** if the given string is a palindrome; otherwise, return **false**.

---

## Examples

### Example 1

**Input**

```
"A man, a plan, a canal: Panama"
```

**Processed String**

```
amanaplanacanalpanama
```

**Output**

```
true
```

---

### Example 2

**Input**

```
"race a car"
```

**Processed String**

```
raceacar
```

**Output**

```
false
```

---

### Example 3

**Input**

```
" "
```

**Processed String**

```
""
```

**Output**

```
true
```

---

# Approach (Brute Force)

## Step 1

Traverse the input string character by character.

## Step 2

For every character:

* Check whether it is a letter or a digit.
* Ignore spaces and special characters.
* Convert uppercase letters to lowercase.
* Store only the valid characters in a new string.

## Step 3

Reverse the processed string.

## Step 4

Compare the processed string with its reversed version.

* If both are equal, the string is a palindrome.
* Otherwise, it is not a palindrome.

---

# Optimized Approach (Two Pointers)

Instead of reversing the processed string, compare characters from both ends.

1. Create a processed string containing only lowercase letters and digits.
2. Initialize two pointers:

   * Left pointer at the beginning.
   * Right pointer at the end.
3. Compare the characters at both pointers.
4. If they are different, return **false**.
5. Otherwise, move both pointers toward the center.
6. Continue until the pointers meet or cross.
7. If all characters match, return **true**.

---

# Algorithm

1. Read the input string.
2. Remove all non-alphanumeric characters.
3. Convert all letters to lowercase.
4. Create the processed string.
5. Compare characters from both ends using two pointers.
6. Return **false** if any mismatch is found.
7. Return **true** if all comparisons are successful.

---

# Time Complexity

### Brute Force

* Building the processed string: **O(n)**
* Reversing the string: **O(n)**
* Comparing both strings: **O(n)**

**Overall Time Complexity:** **O(n)**

---

### Optimized Approach

* Processing the string: **O(n)**
* Two-pointer comparison: **O(n)**

**Overall Time Complexity:** **O(n)**

---

# Space Complexity

### Brute Force

Extra space is required to store the processed string and its reversed copy.

**Space Complexity:** **O(n)**

---

### Optimized Approach (Using a Processed String)

Extra space is required only for the processed string.

**Space Complexity:** **O(n)**

> An even more optimized solution can compare characters directly in the original string using two pointers and skip non-alphanumeric characters without creating a new string, reducing the extra space to **O(1)**.

---

# Key Concepts Used

* String Traversal
* Character Validation
* Case Conversion
* Two Pointer Technique
* String Comparison

---

# Edge Cases

* Empty string after removing special characters.
* String containing only spaces.
* String containing only special characters.
* Mixed uppercase and lowercase letters.
* Strings containing both letters and digits.

---

# Interview Takeaways

* Always ignore non-alphanumeric characters.
* Perform case-insensitive comparisons.
* The two-pointer technique is preferred because it avoids creating a reversed string.
* Be careful to use the length of the processed string when comparing characters.
* An empty processed string is considered a valid palindrome.

---

# Summary

This problem demonstrates how preprocessing a string and using the two-pointer technique can efficiently determine whether it is a palindrome while handling spaces, punctuation, and case differences. The optimized approach runs in **O(n)** time and is the standard solution expected in coding interviews.
