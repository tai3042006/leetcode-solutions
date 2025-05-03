// https://leetcode.com/problems/roman-to-integer/
import java.util.HashMap;
public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> translate = new HashMap<>();
        translate.put('I', 1);
        translate.put('V', 5);
        translate.put('X', 10);
        translate.put('L', 50);
        translate.put('C', 100);
        translate.put('D', 500);
        translate.put('M', 1000);
        int result = translate.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (translate.get(s.charAt(i)) < translate.get(s.charAt(i + 1))) {
                result -= translate.get(s.charAt(i));
            } else {
                result += translate.get(s.charAt(i));
            }
        }
        return result;
    }
}
