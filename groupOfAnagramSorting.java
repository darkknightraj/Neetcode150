import java.util.List;
import  java.util.*;
public class groupOfAnagramSorting {
    public static  void main(String[] args){
        String[] input ={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = groupAnagram(input);
        for(List<String> group:grouped){
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);//this become key
            //if sorted word is not in the map to add for key
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            //add original word in the value of the map
            map.get(sortedWord).add(word);

        }
        return new  ArrayList<>(map.values());

    }
}
