# 387. First Unique Character in a String

## 📝 Problem Statement

Given a string `s`, return the **index of the first non-repeating character**. If no such character exists, return `-1`.

---

## 📌 Examples

### Example 1

**Input**

```text
s = "leetcode"
```

**Output**

```text
0
```

**Explanation**

The character `'l'` appears only once and is the first non-repeating character.

---

### Example 2

**Input**

```text
s = "loveleetcode"
```

**Output**

```text
2
```

**Explanation**

The character `'v'` is the first character with a frequency of `1`.

---

### Example 3

**Input**

```text
s = "aabb"
```

**Output**

```text
-1
```

**Explanation**

Every character appears more than once, so there is no unique character.

---

## 🔒 Constraints

- `1 <= s.length <= 10^5`
- `s` consists only of lowercase English letters.

---

# 🚀 Approach 1: LinkedHashMap

## 💡 Intuition

The idea is to count the frequency of every character while preserving the insertion order. After storing the frequencies, traverse the original string again and return the index of the first character whose frequency is `1`.

---

## 📋 Algorithm

1. Create a `LinkedHashMap<Character, Integer>`.
2. Traverse the string and count the frequency of every character.
3. Traverse the string again.
4. If the frequency of the current character is `1`, return its index.
5. If no unique character exists, return `-1`.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(k)`

where `k` is the number of distinct characters (`k ≤ 26` for this problem).

---

## ✅ Advantages

- Easy to understand and implement.
- Preserves insertion order.
- Can handle larger character sets such as ASCII or Unicode.

---

## ❌ Disadvantages

- Uses extra memory for storing the map.
- Slightly slower due to hashing overhead.

---

# 🚀 Approach 2: Frequency Array

## 💡 Intuition

Since the string contains only lowercase English letters (`a-z`), we can use an integer array of size `26` to count character frequencies.

Each index in the array represents one letter:

- Index `0` → `'a'`
- Index `1` → `'b'`
- ...
- Index `25` → `'z'`

After counting the frequencies, traverse the string again and return the index of the first character with frequency `1`.

---

## 📋 Algorithm

1. Create a frequency array of size `26`.
2. Traverse the string and count the occurrences of each character.
3. Traverse the string again.
4. Return the index of the first character whose frequency is `1`.
5. If no unique character exists, return `-1`.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

The array size remains constant (`26`) regardless of the input size.

---

## ✅ Advantages

- Faster than the HashMap approach.
- Constant extra space.
- Very efficient for lowercase English letters.

---

## ❌ Disadvantages

- Works only when the character set is fixed.
- Not suitable for arbitrary Unicode characters.

---

# 📊 Comparison

| Feature | LinkedHashMap | Frequency Array |
|----------|---------------|-----------------|
| Time Complexity | `O(n)` | `O(n)` |
| Space Complexity | `O(k)` | `O(1)` |
| Preserves Insertion Order | ✅ Yes | ❌ No |
| Supports Any Character Set | ✅ Yes | ❌ No |
| Best for Lowercase Letters | ✅ Good | ⭐ Excellent |
| Performance | Good | Best |

---

# 🎯 Conclusion

Both approaches solve the problem efficiently in **O(n)** time.

- Use **LinkedHashMap** when the input may contain a large or unknown character set, as it is more flexible.
- Use a **Frequency Array** when the input is limited to lowercase English letters. It is the most optimized solution because it uses constant extra space and has lower overhead.

For this problem, the **Frequency Array** approach is the recommended solution due to the given constraints.

---

## 🏷️ Tags

- String
- Hash Table
- Array
- Frequency Counting
- Easy
- LeetCode 387