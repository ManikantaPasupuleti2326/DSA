# 383. Ransom Note

## Problem Statement

Given two strings, `ransomNote` and `magazine`, determine whether the `ransomNote` can be constructed using the characters from the `magazine`.

Each character in the `magazine` can be used **only once**.

Return:

* `true` if the ransom note can be constructed.
* `false` otherwise.

---

## Approach

1. Convert the `magazine` string into a character array.
2. Traverse each character of the `ransomNote`.
3. For every character, search the character array.
4. If the character is found:

   * Mark it as used so it cannot be reused.
   * Continue searching for the next character.
5. If a character is not found, return `false`.
6. If all characters are successfully matched, return `true`.

---

## Algorithm

1. Convert the `magazine` into a character array.
2. Iterate through every character of the `ransomNote`.
3. For each character:

   * Initialize a flag indicating whether the character has been found.
   * Search the magazine array.
   * If a matching character is found:

     * Mark it as used.
     * Stop searching for that character.
4. If the character is not found after the search, return `false`.
5. After processing all characters, return `true`.

---

## Example

### Input

* ransomNote = `"aa"`
* magazine = `"aab"`

### Explanation

* Use the first `'a'` from the magazine.
* Use the second `'a'` from the magazine.
* All required characters are available.

### Output

`true`

---

## Another Example

### Input

* ransomNote = `"aa"`
* magazine = `"ab"`

### Explanation

* The first `'a'` is available.
* A second `'a'` is required but does not exist in the remaining magazine.

### Output

`false`

---

## Time Complexity

**O(n × m)**

* `n` = Length of `ransomNote`
* `m` = Length of `magazine`

Each character in the ransom note may require scanning the entire magazine.

---

## Space Complexity

**O(m)**

An additional character array is created from the `magazine`.

---

## Key Learning Points

* Converting a string into a character array.
* Searching for characters using nested loops.
* Marking used characters to prevent reuse.
* Using a boolean flag to track whether a character was found.
* Understanding the importance of the `break` statement after a successful match.
* Practicing brute-force problem-solving before moving to optimized solutions.

---

## Topics

* Strings
* Character Arrays
* Brute Force
* Searching
* Nested Loops

---

## Difficulty

**Easy**

---

## Platform

LeetCode
