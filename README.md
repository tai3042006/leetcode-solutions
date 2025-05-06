## LeetCode Java Solutions

This repository contains Java solutions for selected LeetCode and NeetCode problems, organized by difficulty.

### NeetCode Problems

| No  | Title                                           | Solution                                      | Basic Idea                 |
| --- | ----------------------------------------------- | --------------------------------------------- | -------------------------- |
| 1   | [Duplicate Integer](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/DuplicateInteger.java)  | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/DuplicateInteger.java)        | Nested loops compare every pair  |
| 2   | [Two Sum](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/TwoSum.java)              | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/TwoSum.java)                  | HashMap one‑pass: find complement         |

### LeetCode Easy Problems

| No  | Title                                                                 | Solution                              | Basic Idea                     |
| --- | --------------------------------------------------------------------- | ------------------------------------- | ------------------------------ |
| 1   | [Valid Anagram](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/ValidAnagram.java)         | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/ValidAnagram.java)    | Count characters in both strings. If the counts match, they're anagrams.  |
| 2   | [Best Time to Buy and Sell Stock](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MaxProfit.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MaxProfit.java)       | Track min price so far, update max profit   |
| 3   | [Merge Sorted Array](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MergeSortedArray.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MergeSortedArray.java)| Two pointers from end, fill backwards          |
| 4   | [Move Zeroes](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MoveZeroes.java)             | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/MoveZeroes.java)      | Shift non‑zeros forward, then fill zeros at end             |
| 5   | [Palindrome Number](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/PalindromeNumber.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/PalindromeNumber.java)| Reverse half the digits and compare        |
| 6   | [Roman to Integer](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/RomanToInteger.java)   | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/RomanToInteger.java)  | Map symbols, add or subtract based on next value           |
| 7   | [Longest Common Prefix](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/LongestCommonPrefix.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/LongestCommonPrefix.java) | Trim down common prefix until it matches all strings |
| 8   | [Jewels and Stones](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/JewelsAndStones.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/JewelsAndStones.java) | Store jewels in a HashSet for fast lookups. Count how many stones are in the HashSet |
| 9   | [First Unique Character](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/firstUniqChar.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/firstUniqChar.java) | Use a HashMap to count character frequencies, then return the index of the first character with a count of 1. If none, return -1. |

### LeetCode Medium Problems

| No  | Title                                                    | Solution                                | Basic Idea                          |
| --- | -------------------------------------------------------- | --------------------------------------- | ------------------------------------- |
| 49  | [Group Anagrams](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Medium/GroupAnagrams.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Medium/GroupAnagrams.java)   | Sort words & group via map          |

### Repository Structure

```text
src/
├── Easy/
│   ├── DuplicateInteger.java
│   ├── TwoSum.java
│   ├── ValidAnagram.java
│   ├── JewelsAndStones.java
│   └── firstUniqChar.java
└── Medium/
    └── GroupAnagrams.java
