package PracticeDay05;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

    public static void charactersRepeated(String word)
    {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> repeated : map.entrySet())
        {
            if(repeated.getValue()>1)
            {
                System.out.println(repeated.getKey()+":"+repeated.getValue());
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("all characters in the given word have repeated only once.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharacters.charactersRepeated("virtusa");
    }
}
