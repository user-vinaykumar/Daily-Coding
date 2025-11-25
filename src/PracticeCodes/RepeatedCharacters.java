package PracticeCodes;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void repeatedCharacters(String word)
    {
        int count=0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> repeatedEntry : map.entrySet())
        {
            if(repeatedEntry.getValue()>1)
            {
                System.out.println(repeatedEntry.getKey()+":"+repeatedEntry.getValue());
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No characters has repeated more than once.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharacters.repeatedCharacters("virrtusa");
    }
}
