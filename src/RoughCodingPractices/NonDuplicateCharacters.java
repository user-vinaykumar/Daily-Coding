package RoughCodingPractices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonDuplicateCharacters {

    public static void nonDuplicate(String word) {
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.summingInt(d -> 1)));

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            if (entries.getValue() == 1) {
                System.out.println(entries.getKey());
            }
        }
    }

    public static void main(String[] args) {
        NonDuplicateCharacters.nonDuplicate("virtussaaa");
    }
}
