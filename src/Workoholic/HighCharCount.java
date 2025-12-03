package Workoholic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighCharCount {

    public static void highCharCount(String word)
    {
        LinkedHashMap<Character, Integer> map = word.chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,
                        LinkedHashMap::new, Collectors.summingInt(x->1)));
        Map.Entry<Character, Integer> maxEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);
        if(maxEntry!=null) System.out.println(maxEntry.getKey()+":"+maxEntry.getValue());
    }

    public static void main(String[] args) {
        HighCharCount.highCharCount("virtussssssa");
    }
}
