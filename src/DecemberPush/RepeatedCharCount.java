package DecemberPush;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharCount {

    public static void repeatedChar(String word) {
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,
                        Collectors.summingInt(x -> 1)));

        for (Map.Entry<Character, Integer> entries : map.entrySet()) {
            if (entries.getValue() > 1) {
                System.out.println(entries.getKey() + ":" + entries.getValue());
            }
        }
    }

    public static void main(String[] args) {
        RepeatedCharCount.repeatedChar("virtstusaaa");
    }
}
