# 409. Longest Palindrome

## Problem Statement

Given a string `s` consisting of lowercase and uppercase English letters, determine the length of the **longest palindrome** that can be built using those characters.

> **Note:** Uppercase and lowercase letters are considered different characters (e.g., `'A'` and `'a'` are not the same).

---

## Examples

### Example 1

**Input**

```text
abccccdd
```

**Output**

```text
7
```

**Explanation**

One possible palindrome is:

```text
dccaccd
```

Its length is **7**.

---

### Example 2

**Input**

```text
a
```

**Output**

```text
1
```

---

## Approach

1. Count the frequency of every character using a `HashMap`.
2. Traverse all character frequencies.
3. If a frequency is **even**, add the entire frequency to the answer.
4. If a frequency is **odd**, add `frequency - 1` (the largest even value) to the answer.
5. If at least one odd frequency exists, add **1** to the final answer because one odd character can be placed at the center of the palindrome.

---

## Algorithm

1. Create a `HashMap<Character, Integer>` to store character frequencies.
2. Iterate through the string and count the occurrences of each character.
3. Initialize:

   * `length = 0`
   * `oddFound = false`
4. Traverse all frequencies:

   * If the frequency is even, add it to `length`.
   * Otherwise, add `frequency - 1` and set `oddFound = true`.
5. After the loop, if an odd frequency was found, increment `length` by `1`.
6. Return `length`.

---

## Dry Run

### Input

```text
abccccdd
```

### Frequency Table

| Character | Frequency |
| --------- | --------: |
| a         |         1 |
| b         |         1 |
| c         |         4 |
| d         |         2 |

### Calculation

| Frequency | Contribution |
| --------: | -----------: |
|         1 |            0 |
|         1 |            0 |
|         4 |            4 |
|         2 |            2 |

Current length:

```text
6
```

Since at least one odd frequency exists:

```text
6 + 1 = 7
```

**Final Answer**

```text
7
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

* Counting character frequencies takes `O(n)`.
* Traversing the frequency map takes `O(k)`, where `k` is the number of distinct characters.
* Overall complexity is `O(n)`.

### Space Complexity

```text
O(k)
```

where `k` is the number of distinct characters.

For English letters, the number of possible characters is fixed, so the space usage is effectively constant.

---

## Key Concepts Used

* HashMap
* Character Frequency Counting
* Greedy Approach
* String Manipulation

---

## Java Concepts Practiced

* `HashMap`
* `getOrDefault()`
* Enhanced `for` loop
* `toCharArray()`
* Conditional Statements
* Boolean Flag

---

## Learning Outcome

After solving this problem, you will understand:

* How to count character frequencies efficiently using a `HashMap`.
* Why palindrome construction relies on character pairs.
* How odd-frequency characters are handled in palindrome formation.
* How to design an efficient `O(n)` greedy solution.

---

## Interview Takeaway

The key observation is:

* Every character with an **even** frequency can be used completely.
* Every character with an **odd** frequency contributes its **largest even part** (`count - 1`).
* Only **one** odd character can be placed in the center of the palindrome.

This approach produces the maximum possible palindrome length in linear time.
