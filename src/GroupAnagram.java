import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    //time complexity: O(mn) m:number of words, n: length of the longest word
    //space complexity: O(n) n: number of different combinations of letters
    public static List<List<String>> group(String[] words){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String word: words){
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            if(map.containsKey(String.valueOf(ca))){
                ArrayList<String> temp = map.get(String.valueOf(ca));
                temp.add(word);
                map.put(String.valueOf(ca), temp);
            }else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(String.valueOf(ca), temp);
            }
        }

        return new ArrayList<>(map.values());
    }

}
