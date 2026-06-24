# 20. Valid Parentheses

## Problem Statement

Given a string `s` containing just the characters:

```text
'(', ')', '{', '}', '[' and ']'
```

determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

---

## Example 1

**Input:**

```text
s = "()"
```

**Output:**

```text
true
```

---

## Example 2

**Input:**

```text
s = "()[]{}"
```

**Output:**

```text
true
```

---

## Example 3

**Input:**

```text
s = "(]"
```

**Output:**

```text
false
```

---

## Example 4

**Input:**

```text
s = "([])"
```

**Output:**

```text
true
```

---

## Example 5

**Input:**

```text
s = "([)]"
```

**Output:**

```text
false
```

---

## Constraints

* `1 <= s.length <= 10^4`
* `s` consists of parentheses only `'()[]{}'`

---

## Approach

### Using Stack

1. Create an empty stack.
2. Traverse each character in the string.
3. If the character is an opening bracket:

   * Push it onto the stack.
4. If the character is a closing bracket:

   * Check whether the stack is empty.
   * Pop the top element.
   * Verify that the popped opening bracket matches the closing bracket.
5. If any mismatch occurs, return `false`.
6. After processing all characters:

   * If the stack is empty, return `true`.
   * Otherwise, return `false`.

---

## Why It Works

```text
The most recently opened bracket
must be closed first.

This follows the LIFO
(Last In, First Out) principle,
which is exactly how a Stack works.
```

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(n)
```

In the worst case, all characters are opening brackets.

---

## Key Concept

```text
Opening Bracket → Push

Closing Bracket → Match with top of stack

If mismatch occurs:
Return false
```

---

## Example Walkthrough

### Input

```text
s = "([])"
```

### Process

```text
'(' → Push

'[' → Push

']' → Pop '[' → Match ✓

')' → Pop '(' → Match ✓
```

### Stack After Processing

```text
Empty
```

### Result

```text
true
```

---

## Interview Insight

```text
This is the classic Stack problem.

It teaches:

1. Stack Operations
2. Matching Pairs
3. LIFO Principle
4. String Traversal

Frequently asked in:

- Amazon
- Microsoft
- Google
- Adobe
- Oracle
```

---

## Related Problems

```text
155. Min Stack
232. Implement Queue using Stacks
394. Decode String
71. Simplify Path
150. Evaluate Reverse Polish Notation
```
