// https://leetcode.com/problems/group-anagrams/
import java.util.HashMap;
import java.util.List;
import jave.util.ArrayList;

public class GroupAnagrams {
   //to group each word
	//with each word arrange it --> make sortSr()--> use it like key
	public List<List<String>> groupAnagrams(String[] strs) {
	    HashMap<String, List<String>> map = new HashMap<>();		
	    //convert to char array and sort it to form the key
	    for (String word : strs) {										
	        char[] chars = word.toCharArray();							
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        // add the original word into the anagrams group
	        map.putIfAbsent(sorted, new ArrayList<>());
	        map.get(sorted).add(word);
	    }
	    //return it to a list
	    return new ArrayList<>(map.values());
	}