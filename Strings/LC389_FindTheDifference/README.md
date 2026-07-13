# 389. Find the Difference

## Problem Statement

You are given two strings `s` and `t`.

String `t` is created by randomly shuffling the characters of `s` and then adding one extra lowercase English letter at a random position.

Your task is to identify and return the additional character.

---

## Example

**Input**

```
s = "abcd"
t = "abcde"
```

**Output**

```
e
```

---

# Approach 1: Brute Force

## Idea

The brute force approach compares every character of the original string with the characters of the modified string.

For each character in `s`, search for its first occurrence in `t`. Once a match is found, mark that character as used so it is not matched again. After processing all characters from `s`, the only unmarked character remaining in `t` is the extra character.

### Algorithm

1. Convert the second string into a character array.
2. Traverse each character of the first string.
3. Search for the same character in the second string.
4. Mark the matched character as used.
5. After all matches are completed, scan the second string again.
6. Return the character that was never matched.

### Time Complexity

**O(n²)**

### Space Complexity

**O(n)**

---

# Approach 2: XOR (Optimal)

## Idea

This approach uses the properties of the XOR (^) bitwise operator.

Every character in the original string appears exactly once in the modified string except for one extra character.

The XOR operator has two important properties:

* A value XORed with itself becomes zero.
* Zero XORed with any value returns that value.

Since every common character appears in both strings, they cancel each other during the XOR operation. The only character left at the end is the extra character added to the second string.

### Why It Works

Consider the following example:

```
s = "abcd"
t = "abcde"
```

Conceptually, the XOR operation is performed on all characters from both strings.

Matching characters cancel each other out, leaving only the additional character.

Therefore, the remaining value is the required answer.

### Algorithm

1. Initialize a variable with zero.
2. XOR every character from the first string.
3. XOR every character from the second string.
4. Return the remaining character.

### Time Complexity

**O(n)**

### Space Complexity

**O(1)**

---

# Comparison

| Approach    | Time Complexity | Space Complexity |
| ----------- | --------------- | ---------------- |
| Brute Force | O(n²)           | O(n)             |
| XOR         | O(n)            | O(1)             |

---

# Key Learning

* The brute force approach is simple and easy to understand but becomes inefficient for larger inputs.
* The XOR approach is the most efficient solution because it processes each character only once while using constant extra space.
* Understanding the properties of the XOR operator is essential for solving many interview problems involving arrays, strings, and missing or unique elements.

---

## Topics Covered

* Strings
* Bit Manipulation
* XOR Operation
* Brute Force
* Time and Space Complexity Analysis
