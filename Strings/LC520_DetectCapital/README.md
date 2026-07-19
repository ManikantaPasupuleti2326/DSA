# 520. Detect Capital

## Problem Statement

We define the usage of capitals in a word to be correct when one of the following conditions is satisfied:

1. All letters are uppercase (e.g., `"USA"`).
2. All letters are lowercase (e.g., `"leetcode"`).
3. Only the first letter is uppercase (e.g., `"Google"`).

Given a string `word`, return `true` if the capitalization is correct; otherwise, return `false`.

---

## Examples

### Example 1

**Input**
```
word = "USA"
```

**Output**
```
true
```

---

### Example 2

**Input**
```
word = "FlaG"
```

**Output**
```
false
```

---

## Constraints

- `1 <= word.length <= 100`
- `word` consists only of uppercase and lowercase English letters.

---

## Approach

1. Count the number of uppercase letters in the string.
2. The capitalization is valid if:
   - All letters are uppercase.
   - All letters are lowercase.
   - Exactly one uppercase letter exists, and it is the first character.
3. Otherwise, return `false`.

---

## Algorithm

1. Traverse the string and count uppercase letters.
2. Check the following conditions:
   - `uppercase == length`
   - `uppercase == 0`
   - `uppercase == 1` and the first character is uppercase.
3. Return the result.

---

## Dry Run

### Input

```
Google
```

### Execution

| Character | Uppercase Count |
|-----------|----------------:|
| G | 1 |
| o | 1 |
| o | 1 |
| g | 1 |
| l | 1 |
| e | 1 |

Only one uppercase letter exists, and it is the first character.

**Output**

```
true
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
  - Traverse the string once.

- **Space Complexity:** `O(1)`
  - Only a few variables are used for counting and checking conditions.

---

## Key Takeaways

- A valid word follows one of three capitalization patterns:
  - All uppercase
  - All lowercase
  - Only the first letter uppercase
- Counting uppercase letters is sufficient to determine the correct capitalization.
- A single linear traversal makes the solution efficient.

---

## LeetCode

- **Problem:** 520. Detect Capital
- **Difficulty:** Easy
- **Topics:** String