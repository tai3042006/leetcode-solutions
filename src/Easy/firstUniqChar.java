
import java.util.HashMap;

public class firstUniqChar {
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) { // Convert this string to char array
			map.put(c, map.getOrDefault(c, 0) + 1);
		} // with each char c map will output their stats else -1
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;

			}
		}
		return -1;
	}
}
