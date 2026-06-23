# 1672. Richest Customer Wealth

## Problem Statement

You are given an `m x n` integer grid `accounts` where `accounts[i][j]` is the amount of money the `iᵗʰ` customer has in the `jᵗʰ` bank.

A customer's **wealth** is the total amount of money they have across all their bank accounts.

Return the wealth of the **richest customer**.

---

## Example 1

**Input:**

```text
accounts = [[1,2,3],[3,2,1]]
```

**Output:**

```text
6
```

**Explanation:**

```text
1st customer wealth = 1 + 2 + 3 = 6
2nd customer wealth = 3 + 2 + 1 = 6

Both customers have a wealth of 6, so return 6.
```

---

## Example 2

**Input:**

```text
accounts = [[1,5],[7,3],[3,5]]
```

**Output:**

```text
10
```

**Explanation:**

```text
1st customer wealth = 1 + 5 = 6
2nd customer wealth = 7 + 3 = 10
3rd customer wealth = 3 + 5 = 8

The 2nd customer is the richest with a wealth of 10.
```

---

## Example 3

**Input:**

```text
accounts = [[2,8,7],[7,1,3],[1,9,5]]
```

**Output:**

```text
17
```

**Explanation:**

```text
1st customer wealth = 2 + 8 + 7 = 17
2nd customer wealth = 7 + 1 + 3 = 11
3rd customer wealth = 1 + 9 + 5 = 15

The richest customer has a wealth of 17.
```

---

## Constraints

* `m == accounts.length`
* `n == accounts[i].length`
* `1 <= m, n <= 50`
* `1 <= accounts[i][j] <= 100`

---

## Approach

1. Traverse each customer (row) in the `accounts` matrix.
2. Calculate the total wealth of the current customer by summing all bank account balances.
3. Compare the current customer's wealth with the maximum wealth found so far.
4. Update the maximum wealth if the current customer's wealth is greater.
5. After processing all customers, return the maximum wealth.

---

## Time Complexity

```text
O(m × n)
```

---

## Space Complexity

```text
O(1)
```
