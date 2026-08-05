# Array Leaders

## Problem

Given an array `arr[]`, return all the **leaders** in the array.

A leader is an element that is **greater than or equal to every element to its right**.

### Example 1

**Input**

```
arr = [16, 17, 4, 3, 5, 2]
```

**Output**

```
[17, 5, 2]
```

### Example 2

**Input**

```
arr = [1, 2, 3, 4, 5]
```

**Output**

```
[5]
```

---

## Approach

* The last element is always a leader because there are no elements to its right.
* Traverse the array from **right to left**.
* Maintain a variable `maxRight` that stores the maximum element seen so far.
* If the current element is greater than or equal to `maxRight`, it is a leader.
* Add it to the result and update `maxRight`.
* Since leaders are collected from right to left, reverse the result before returning.

---

## Java Solution

```java
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> res = new ArrayList<>();

        int maxRight = arr[arr.length - 1];
        res.add(maxRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                res.add(maxRight);
            }
        }

        Collections.reverse(res);
        return res;
    }
}
```

---

## Time Complexity

* **O(n)** — Single traversal of the array.

## Space Complexity

* **O(k)** — For storing the leaders, where `k` is the number of leaders.

