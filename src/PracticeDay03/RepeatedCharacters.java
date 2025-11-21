package PracticeDay03;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void repeatedCharacters(String word)
    {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> repeatEntry : map.entrySet())
        {
            if(repeatEntry.getValue()>1)
            {
                System.out.println(repeatEntry.getKey()+":"+repeatEntry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        RepeatedCharacters.repeatedCharacters("difficulty");
    }
}
