package OneDay00000000000000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCharCount {

    public static void wordCharCount(String word) {
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.summingInt(u -> 1)));

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            System.out.println(entries.getKey() + ":" + entries.getValue());
        }
    }

    public static void main(String[] args) {
        WordCharCount.wordCharCount("virtusa");
    }
}
