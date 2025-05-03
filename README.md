# LeetCode Java Solutions

This repository contains Java solutions for selected LeetCode and NeetCode problems, organized by difficulty.

## NeetCode Problems

| No  | Title                                           | Solution                                      | Basic Idea                 |
| --- | ----------------------------------------------- | --------------------------------------------- | -------------------------- |
| 1   | [Duplicate Integer](https://neetcode.io/problems/duplicate-integer)  | [Java](src/easy/DuplicateInteger.java)        | Nested loops compare every pair  |
| 2   | [Two Sum](https://neetcode.io/problems/two-integer-sum)              | [Java](src/easy/TwoSum.java)                  | 	HashMap one‑pass: find complement         |

## LeetCode Easy Problems

| No  | Title                                                                 | Solution                              | Basic Idea                     |
| --- | --------------------------------------------------------------------- | ------------------------------------- | ------------------------------ |
| 1   | [Valid Anagram](https://leetcode.com/problems/valid-anagram/)         | [Java](src/easy/ValidAnagram.java)    | Count characters in both strings. If the counts match, they're anagrams.  |
| 2   | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | [Java](src/easy/MaxProfit.java)       | Track min price so far, update max profit   |
| 3   | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | [Java](src/easy/MergeSortedArray.java)| Two pointers from end, fill backwards          |
| 4   | [Move Zeroes](https://leetcode.com/problems/move-zeroes/)             | [Java](src/easy/MoveZeroes.java)      | Shift non‑zeros forward, then fill zeros at end             |
| 5   | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | [Java](src/easy/PalindromeNumber.java)| Reverse half the digits and compare        |
| 6   | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)   | [Java](src/easy/RomanToInteger.java)  | Map symbols, add or subtract based on next value           |
| 7   | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | [Java](src/easy/LongestCommonPrefix.java) | Trim down common prefix until it matches all strings |

## LeetCode Medium Problems

| No  | Title                                                    | Solution                                | Basic Idea                          |
| --- | -------------------------------------------------------- | --------------------------------------- | ------------------------------------- |
| 49  | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | [Java](src/medium/GroupAnagrams.java)   | Sort words & group via map          |

## Repository Structure

```text
src/
├── easy/
│   ├── DuplicateInteger.java
│   ├── TwoSum.java
│   └── ValidAnagram.java
└── medium/
    └── GroupAnagrams.java
```


> Solutions are implemented in Java, organized by source (NeetCode vs. LeetCode) and difficulty.  
> Run any class’s `main()` for quick testing.
