package PracticeDay05;

import java.util.HashMap;
import java.util.Map;

public class HighCharCount {

    public static void highCharCount(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map.Entry<Character, Integer> maxEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);
        if (maxEntry != null) {
            System.out.println(maxEntry.getKey() + ":" + maxEntry.getValue());
        }
    }

    public static void main(String[] args) {
        HighCharCount.highCharCount("virtussa");
    }
}
