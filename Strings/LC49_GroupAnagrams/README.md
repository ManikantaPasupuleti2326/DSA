---

## Java Tip: `computeIfAbsent()`

In the optimal HashMap solution, you may see the following statement:

```java
map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
```

This is simply a shorter and cleaner version of:

```java
if (!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}

map.get(key).add(s);
```

### How `computeIfAbsent()` Works

```java
map.computeIfAbsent(key, k -> new ArrayList<>());
```

It performs the following steps:

1. Checks whether `key` already exists in the `HashMap`.
2. If the key **does not exist**:
   - Executes the lambda expression:

   ```java
   k -> new ArrayList<>()
   ```

   - Creates a new `ArrayList`.
   - Stores it in the map with the given key.
3. Returns the value associated with the key (either the existing list or the newly created one).

Finally,

```java
.add(s);
```

adds the current string to that list.

---

### Step-by-Step Example

Suppose:

```java
key = "aet";
s = "eat";
```

Initially:

```text
HashMap = { }
```

Execution:

```java
map.computeIfAbsent("aet", k -> new ArrayList<>()).add("eat");
```

Since `"aet"` does not exist:

```text
Create new ArrayList

HashMap

"aet" → [ ]
```

After adding `"eat"`:

```text
"aet" → ["eat"]
```

---

Next string:

```java
key = "aet";
s = "tea";
```

Execution:

```java
map.computeIfAbsent("aet", k -> new ArrayList<>()).add("tea");
```

Since `"aet"` already exists, no new `ArrayList` is created.

After adding `"tea"`:

```text
"aet" → ["eat", "tea"]
```

---

Next string:

```java
key = "aet";
s = "ate";
```

Result:

```text
"aet" → ["eat", "tea", "ate"]
```

---

### Before vs After

**Traditional Way**

```java
if (!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}

map.get(key).add(s);
```

**Modern Java (Java 8+)**

```java
map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
```

Both approaches produce the same result, but `computeIfAbsent()` is cleaner and eliminates repetitive code.

---

### Why Use `computeIfAbsent()`?

- ✔ Reduces boilerplate code.
- ✔ Creates the value only if the key is absent.
- ✔ Returns the existing value if the key is already present.
- ✔ Widely used in Java 8+ and modern production code.

---

### Final HashMap Example

For the input:

```java
strs = ["eat", "tea", "ate"]
```

The resulting `HashMap` is:

```text
{
    "aet" → ["eat", "tea", "ate"]
}
```

This is why `computeIfAbsent()` is the preferred approach for grouping anagrams.