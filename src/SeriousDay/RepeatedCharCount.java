package SeriousDay;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharCount {

    public static void repeatedCharacters(String word) {
        int count = 0;
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.summingInt(x -> 1)));

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            if (entries.getValue() > 1) {
                System.out.println(entries.getKey() + ":" + entries.getValue());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No characters has repeated more than once in the given String.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharCount.repeatedCharacters("virtusa");
        RepeatedCharCount.repeatedCharacters("malayalam");
        RepeatedCharCount.repeatedCharacters("virrtusa");
    }
}
