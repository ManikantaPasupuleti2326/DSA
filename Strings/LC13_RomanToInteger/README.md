# 13. Roman to Integer

## Problem Statement

Roman numerals are represented by seven different symbols:

| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example:

```text
II = 2
XII = 12
XXVII = 27
```

Roman numerals are usually written from largest to smallest from left to right.

However, there are six special subtraction cases:

```text
IV = 4
IX = 9
XL = 40
XC = 90
CD = 400
CM = 900
```

Given a Roman numeral `s`, convert it to an integer.

---

## Example 1

**Input:**

```text
s = "III"
```

**Output:**

```text
3
```

**Explanation:**

```text
III = 1 + 1 + 1 = 3
```

---

## Example 2

**Input:**

```text
s = "LVIII"
```

**Output:**

```text
58
```

**Explanation:**

```text
L = 50
V = 5
III = 3

50 + 5 + 3 = 58
```

---

## Example 3

**Input:**

```text
s = "MCMXCIV"
```

**Output:**

```text
1994
```

**Explanation:**

```text
M  = 1000
CM = 900
XC = 90
IV = 4

1000 + 900 + 90 + 4 = 1994
```

---

## Constraints

* `1 <= s.length <= 15`
* `s` contains only:

  * `I`
  * `V`
  * `X`
  * `L`
  * `C`
  * `D`
  * `M`
* `s` is guaranteed to be a valid Roman numeral.
* `1 <= value <= 3999`

---

## Approach

### HashMap + Traversal

1. Store the value of each Roman symbol.
2. Traverse the string from left to right.
3. Compare the current symbol with the next symbol.
4. If the current value is smaller than the next value:

   * Subtract the current value.
5. Otherwise:

   * Add the current value.
6. Return the final sum.

---

## Why It Works

```text
Roman numerals normally add values.

Example:
VI = 5 + 1 = 6

When a smaller value appears before
a larger value, subtraction is used.

Example:
IV = 5 - 1 = 4
```

---

## Time Complexity

```text
O(n)
```

where `n` is the length of the Roman numeral.

---

## Space Complexity

```text
O(1)
```

Only a fixed set of Roman symbols is stored.

---

## Key Concept

```text
If:

currentValue < nextValue

→ Subtract currentValue

Else

→ Add currentValue
```

---

## Example Walkthrough

### Input

```text
s = "MCMXCIV"
```

### Process

```text
M  = 1000  → +1000

C < M      → -100

M          → +1000

X < C      → -10

C          → +100

I < V      → -1

V          → +5
```

### Result

```text
1000 - 100 + 1000 - 10 + 100 - 1 + 5

= 1994
```

---

## Interview Insight

```text
This is a classic String Simulation problem.

It teaches:

1. Character Mapping
2. HashMap Usage
3. String Traversal
4. Special Case Handling

Frequently asked in coding interviews.
```

---

## Related Problems

```text
12. Integer to Roman
168. Excel Sheet Column Title
171. Excel Sheet Column Number
```
