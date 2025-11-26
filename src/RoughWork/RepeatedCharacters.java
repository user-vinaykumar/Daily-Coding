package RoughWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void charctersRepeated(String word)
    {
        boolean count= true;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> maxEntry : map.entrySet())
        {
            if(maxEntry.getValue()>1)
            {
                System.out.println(maxEntry.getKey()+":"+maxEntry.getValue());
                count = false;
            }
        }
        if(count)
        {
            System.out.println("No characters has repeated more than once.");
        }
    }


    public static void main(String[] args) {
        RepeatedCharacters.charctersRepeated("malayalam");
    }
}
