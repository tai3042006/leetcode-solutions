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
| 10  | [Group Anagrams](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/GroupAnagrams.java) | [Java](https://github.com/tai3042006/leetcode-solutions/blob/main/src/Easy/GroupAnagrams.java) | Sort words and group them via a map. |

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
│   ├── firstUniqChar.java
│   └── GroupAnagrams.java
└── Medium/
    └── GroupAnagrams.java

## LeetCode Solutions

<!-- LEETCODE_TABLE_START -->
| # | Problem | Solution |
|---:|---|---|
| 1 | Two Sum | [JAVA](1-two-sum/two-sum.java) |
| 4 | Median Of Two Sorted Arrays | [JAVA](4-median-of-two-sorted-arrays/median-of-two-sorted-arrays.java) |
| 9 | Palindrome Number | [JAVA](9-palindrome-number/palindrome-number.java) |
| 13 | Roman To Integer | [JAVA](13-roman-to-integer/roman-to-integer.java) |
| 49 | Group Anagrams | [JAVA](49-group-anagrams/group-anagrams.java) |
| 66 | Plus One | [JAVA](66-plus-one/plus-one.java) |
| 88 | Merge Sorted Array | [JAVA](88-merge-sorted-array/merge-sorted-array.java) |
| 217 | Contains Duplicate | [JAVA](217-contains-duplicate/contains-duplicate.java) |
| 242 | Valid Anagram | [JAVA](242-valid-anagram/valid-anagram.java) |
| 283 | Move Zeroes | [JAVA](283-move-zeroes/move-zeroes.java) |
| 387 | First Unique Character In A String | [JAVA](387-first-unique-character-in-a-string/first-unique-character-in-a-string.java) |
| 782 | Jewels And Stones | [JAVA](782-jewels-and-stones/jewels-and-stones.java) |
<!-- LEETCODE_TABLE_END -->
