package TuesdayPush;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCharCount {

    public static void wordCharCount(String word)
    {
        LinkedHashMap<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,
                        Collectors.summingInt(d->1)));

        for(Map.Entry<Character, Integer> entries : map.entrySet())
        {
            System.out.println(entries.getKey()+":"+entries.getValue());
        }
    }

    public static void main(String[] args) {
        WordCharCount.wordCharCount("virtusa");
    }
}
