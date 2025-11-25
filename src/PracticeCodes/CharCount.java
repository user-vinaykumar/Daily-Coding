package PracticeCodes;

import java.io.CharArrayReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

    public static void wordCharCount(String word)
    {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : word.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        CharCount.wordCharCount("virtusa");
    }
}
