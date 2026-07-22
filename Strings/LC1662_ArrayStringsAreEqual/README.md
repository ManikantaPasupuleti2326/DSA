# 1662. Check If Two String Arrays are Equivalent

## 📌 Problem Statement

Given two string arrays `word1` and `word2`, return `true` if the two arrays represent the same string, and `false` otherwise.

A string is represented by concatenating all the elements of the array in order.

### Example

**Input**

```text
word1 = ["ab", "c"]
word2 = ["a", "bc"]
```

**Output**

```text
true
```

**Explanation**

* `word1` represents `"abc"`
* `word2` represents `"abc"`
* Both strings are equal.

---

## 💡 Approach

1. Initialize two empty strings.
2. Concatenate all elements of `word1` into the first string.
3. Concatenate all elements of `word2` into the second string.
4. Compare both strings using `equals()`.
5. Return the comparison result.

---

## 🧠 Algorithm

1. Create two empty strings:

   * `str1`
   * `str2`
2. Traverse `word1` and append every string to `str1`.
3. Traverse `word2` and append every string to `str2`.
4. Compare `str1` and `str2`.
5. Return `true` if equal; otherwise return `false`.

---

## ✅ Java Solution

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];
        }

        return str1.equals(str2);
    }
}
```

---

## ⏱️ Complexity Analysis

### Current Approach

* **Time Complexity:** O(n² + m²)

  * String concatenation (`+`) creates a new string every time.
* **Space Complexity:** O(n + m)

  * Stores the concatenated strings.

---

## 🚀 Optimized Approach

Use `StringBuilder` instead of string concatenation.

```java
StringBuilder sb1 = new StringBuilder();
StringBuilder sb2 = new StringBuilder();

for (String s : word1) {
    sb1.append(s);
}

for (String s : word2) {
    sb2.append(s);
}

return sb1.toString().equals(sb2.toString());
```

### Complexity

* **Time Complexity:** O(n + m)
* **Space Complexity:** O(n + m)

---

## 🎯 Key Concepts

* Arrays
* Strings
* String Concatenation
* `equals()` Method
* `StringBuilder` Optimization

---

## 📚 Learning Outcome

After solving this problem, you will understand:

* How to traverse string arrays.
* How to concatenate strings in Java.
* The difference between `==` and `equals()`.
* Why `StringBuilder` is preferred over repeated string concatenation.
* How to analyze time and space complexity.

---

## 🔗 LeetCode Problem

**Problem Number:** 1662

**Title:** Check If Two String Arrays are Equivalent

---

## 👨‍💻 Author

**Manikanta Pasupuleti**

Java | Data Structures & Algorithms | LeetCode Journey (365 Problems)
