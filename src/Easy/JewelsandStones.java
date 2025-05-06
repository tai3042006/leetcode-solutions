
import java.util.HashSet;

public class JewelsandStones {
    public int numJewelsInStones(String jewels, String stones) {
    	HashSet<Character> J = new HashSet<>();
    	for(char c : jewels.toCharArray()) {
    		J.add(c);
    	}
    	int count = 0;
    	for(char c: stones.toCharArray()) {
    		if(J.contains(c)) {
    			count++;
    			
    		}
    	}
    	return count;
}
}