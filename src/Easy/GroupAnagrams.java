public class GroupAnagrams{        
public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String word : strs) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        map.putIfAbsent(sorted, new ArrayList<>());
        map.get(sorted).add(word);
    }
    return new ArrayList<>(map.values());
}
}
