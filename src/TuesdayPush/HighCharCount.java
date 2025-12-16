package TuesdayPush;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighCharCount {

    public static void highCharCount(String word)
    {
        HashMap<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,
                        Collectors.summingInt(d->1)));

        Map.Entry<Character, Integer> entries = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        if(entries!=null)
        {
            System.out.println(entries.getKey()+":"+entries.getValue());
        }
    }

    public static void main(String[] args) {
        HighCharCount.highCharCount("malayalam");
    }
}
