# 824. Goat Latin

## Problem Statement

You are given a sentence consisting of words separated by a single space. Each word contains only uppercase and lowercase English letters.

Your task is to convert the sentence into **Goat Latin** using the following rules:

1. If a word begins with a **vowel** (`a`, `e`, `i`, `o`, `u`), append `"ma"` to the end of the word.
2. If a word begins with a **consonant**, remove its first letter, place that letter at the end of the word, and then append `"ma"`.
3. Append the letter `'a'` to the end of each word according to its position in the sentence:
   - First word → `"a"`
   - Second word → `"aa"`
   - Third word → `"aaa"`
   - and so on.

Return the final Goat Latin sentence.

---

## Example 1

### Input

```text
sentence = "I speak Goat Latin"
```

### Output

```text
"Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
```

### Explanation

- **I** → Starts with a vowel → `I` + `ma` + `a` = `Imaa`
- **speak** → Starts with a consonant → `peaks` + `ma` + `aa` = `peaksmaaa`
- **Goat** → Starts with a consonant → `oatG` + `ma` + `aaa` = `oatGmaaaa`
- **Latin** → Starts with a consonant → `atinL` + `ma` + `aaaa` = `atinLmaaaaa`

---

## Example 2

### Input

```text
sentence = "The quick brown fox jumped over the lazy dog"
```

### Output

```text
"heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
```

---

## Approach

- Split the sentence into individual words.
- Traverse each word one by one.
- Check whether the first character is a vowel or a consonant.
- Apply the corresponding Goat Latin transformation.
- Append `"ma"` after every transformed word.
- Append `'a'` according to the word's position in the sentence.
- Join all transformed words with spaces to obtain the final answer.

---

## Algorithm

1. Split the sentence into words.
2. Iterate through every word while maintaining its index.
3. If the first letter is a vowel:
   - Keep the word unchanged.
   - Append `"ma"`.
4. Otherwise:
   - Move the first character to the end.
   - Append `"ma"`.
5. Append `'a'` repeated `(index + 1)` times.
6. Join all transformed words with spaces.
7. Return the final Goat Latin sentence.

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
  - Each character in the sentence is processed only once.

- **Space Complexity:** `O(n)`
  - Extra space is required to construct the resulting sentence.

---

## Key Concepts

- String Manipulation
- Simulation
- Character Processing
- String Concatenation

---

## Constraints

- `1 <= sentence.length <= 150`
- The sentence contains only English letters and spaces.
- There are no leading or trailing spaces.
- Every pair of words is separated by exactly one space.

---

## Tags

- String
- Simulation
- Easy