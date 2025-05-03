// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) return false;
        if (x < 0 || x % 10 == 0) return false;
        int reversed_int = 0;
        while (x > reversed_int) {
            int pop = x % 10;
            x /= 10;
            reversed_int = reversed_int * 10 + pop;
        }
        return x == reversed_int || x == reversed_int / 10;
    }
}
