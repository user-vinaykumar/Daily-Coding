package DailyGit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighCharCount {

    public static void highCharacterCount(String word)
    {
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,
                        Collectors.summingInt(x->1)));

        Map.Entry<Character, Integer> highRepeated = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if(highRepeated!=null)
        {
            System.out.println(highRepeated.getKey()+":"+highRepeated.getValue());
        }

    }

    public static void main(String[] args) {
        HighCharCount.highCharacterCount("vvvvvvvvvirrtusa");
    }
}
