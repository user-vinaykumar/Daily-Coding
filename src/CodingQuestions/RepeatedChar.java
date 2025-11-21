package CodingQuestions;

import PracticeDay03.RepeatedCharacters;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedChar {

    public static void repeatedCharCount(String word)
    {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> maxEntries : map.entrySet())
        {
            if(maxEntries.getValue()>1)
            {
                System.out.println(maxEntries.getKey()+":"+maxEntries.getValue());
            }
        }
    }

    public static void main(String[] args) {
        RepeatedChar.repeatedCharCount("virtusa");
    }
}
