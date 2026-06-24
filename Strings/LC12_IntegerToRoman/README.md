# 12. Integer to Roman

## Problem Statement

Seven different symbols represent Roman numerals with the following values:

| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

Roman numerals are formed by converting decimal place values from highest to lowest according to specific rules.

Given an integer `num`, convert it to a Roman numeral.

---

## Example 1

**Input:**

```text
num = 3749
```

**Output:**

```text
"MMMDCCXLIX"
```

**Explanation:**

```text
3000 = MMM
 700 = DCC
  40 = XL
   9 = IX

Result = MMMDCCXLIX
```

---

## Example 2

**Input:**

```text
num = 58
```

**Output:**

```text
"LVIII"
```

**Explanation:**

```text
50 = L
 5 = V
 3 = III

Result = LVIII
```

---

## Example 3

**Input:**

```text
num = 1994
```

**Output:**

```text
"MCMXCIV"
```

**Explanation:**

```text
1000 = M
 900 = CM
  90 = XC
   4 = IV

Result = MCMXCIV
```

---

## Constraints

* `1 <= num <= 3999`

---

## Approach

### Greedy Approach

1. Store Roman numeral values in descending order.
2. Store corresponding Roman symbols.
3. Start from the largest value.
4. While the current value is less than or equal to `num`:

   * Append its Roman symbol.
   * Subtract its value from `num`.
5. Continue until `num` becomes `0`.
6. Return the generated Roman numeral.

---

## Why It Works

```text
Roman numerals are built from
largest values to smallest values.

Choosing the largest valid symbol
at each step guarantees the correct
Roman numeral representation.
```

---

## Time Complexity

```text
O(1)
```

Only 13 Roman numeral values are checked.

---

## Space Complexity

```text
O(1)
```

Ignoring the output string.

---

## Key Concept

```text
Values:

1000 → M
900  → CM
500  → D
400  → CD
100  → C
90   → XC
50   → L
40   → XL
10   → X
9    → IX
5    → V
4    → IV
1    → I
```

---

## Example Walkthrough

### Input

```text
num = 1994
```

### Process

```text
1994

1000 → M
Remaining = 994

900 → CM
Remaining = 94

90 → XC
Remaining = 4

4 → IV
Remaining = 0
```

### Result

```text
MCMXCIV
```

---

## Interview Insight

```text
This is a classic Greedy problem.

It teaches:

1. Greedy Strategy
2. Mapping Values to Symbols
3. String Construction
4. Lookup Table Design

Frequently asked in coding interviews.
```

---

## Related Problems

```text
13. Roman to Integer
168. Excel Sheet Column Title
171. Excel Sheet Column Number
```
