# 205. Isomorphic Strings

## Problem Statement

Given two strings `s` and `t`, determine whether they are **isomorphic**.

Two strings are **isomorphic** if the characters in `s` can be replaced to get `t`.

Rules:

* Every character in `s` must always map to the same character in `t`.
* No two different characters in `s` can map to the same character in `t`.
* A character may map to itself.

---

## Examples

### Example 1

**Input**

```text
s = "egg"
t = "add"
```

**Output**

```text
true
```

**Explanation**

```text
e → a
g → d
```

The mapping is consistent throughout the strings.

---

### Example 2

**Input**

```text
s = "f11"
t = "b23"
```

**Output**

```text
false
```

**Explanation**

Character `'1'` maps to both `'2'` and `'3'`, which violates the one-to-one mapping rule.

---

### Example 3

**Input**

```text
s = "paper"
t = "title"
```

**Output**

```text
true
```

**Explanation**

```text
p → t
a → i
e → l
r → e
```

Every mapping is unique and consistent.

---

# Approach

To ensure a valid isomorphic relationship, we maintain **two HashMaps**.

### 1. mapST

Stores the mapping from string `s` to string `t`.

```text
Character in s  →  Character in t
```

Example:

```text
e → a
g → d
```

---

### 2. mapTS

Stores the reverse mapping from string `t` to string `s`.

```text
Character in t  →  Character in s
```

Example:

```text
a → e
d → g
```

The second HashMap guarantees that two different characters in `s` cannot map to the same character in `t`.

---

# Algorithm

1. If the lengths of the strings are different, return `false`.
2. Create two HashMaps:

   * `mapST` for `s → t`
   * `mapTS` for `t → s`
3. Traverse both strings simultaneously.
4. For every character pair:

   * If the character from `s` already exists in `mapST`, verify that it maps to the current character from `t`.
   * Otherwise, store the new mapping.
   * If the character from `t` already exists in `mapTS`, verify that it maps back to the current character from `s`.
   * Otherwise, store the reverse mapping.
5. If every mapping is valid, return `true`.

---

# Dry Run

### Input

```text
s = "paper"
t = "title"
```

### Initial State

```text
mapST = {}
mapTS = {}
```

---

### Step 1

```text
p → t
```

```text
mapST

p → t
```

```text
mapTS

t → p
```

---

### Step 2

```text
a → i
```

```text
mapST

p → t
a → i
```

```text
mapTS

t → p
i → a
```

---

### Step 3

```text
p → t
```

Already exists.

Existing mapping:

```text
p → t
```

Matches the current mapping.

Continue.

---

### Step 4

```text
e → l
```

Store the mapping.

---

### Step 5

```text
r → e
```

Store the mapping.

All mappings are valid.

Return:

```text
true
```

---

# Java Solution

```java
import java.util.HashMap;

class Solution
{
    public boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(mapST.containsKey(ch1))
            {
                if(mapST.get(ch1) != ch2)
                {
                    return false;
                }
            }
            else
            {
                mapST.put(ch1, ch2);
            }

            if(mapTS.containsKey(ch2))
            {
                if(mapTS.get(ch2) != ch1)
                {
                    return false;
                }
            }
            else
            {
                mapTS.put(ch2, ch1);
            }
        }

        return true;
    }
}
```

---

# Complexity Analysis

### Time Complexity

```text
O(n)
```

Each character is processed exactly once.

---

### Space Complexity

```text
O(n)
```

In the worst case, every character is unique and stored in both HashMaps.

---

# Key Learning Points

* `HashMap` is ideal for storing character mappings.
* Two HashMaps ensure a **one-to-one (bijective) relationship**.
* `containsKey()` is used to check whether a character has already been mapped.
* `get()` verifies that an existing mapping is still valid.
* `put()` stores new mappings.
* This is the optimal solution with **O(n)** time complexity and is the preferred approach in coding interviews.
