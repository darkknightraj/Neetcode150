import java.util.*;

public class GroupAnagramOptimal {
    public static void main(String[] args) {
        // Example usage
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Input: " + Arrays.toString(strs));
        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }

        Map<String, List> ansMap = new HashMap<>();
        int[] count = new int[26];

        for(String s : strs){
            Arrays.fill(count, 0);
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList());
            }
            ansMap.get(key).add(s);
        }

        return new ArrayList(ansMap.values());
    }
}
