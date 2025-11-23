package PracticeDay04;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharactersRepeated {

    public static void charactersRepeated(String word) {
        int count = 0;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> maxEntry : map.entrySet()) {
            if (maxEntry.getValue() > 1) {
                System.out.println(maxEntry.getKey() + ":" + maxEntry.getValue());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Every character has repeated only ONE number of time.");
        }
    }

    public static void main(String[] args) {
        CharactersRepeated.charactersRepeated("malayalam");
    }
}
