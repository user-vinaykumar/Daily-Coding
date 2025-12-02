package OfficeWorkPractices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCharCount {

    public static void wordCharCount(String word)
    {
        LinkedHashMap<Character, Integer> map = word.chars()
                .mapToObj(c->(char)c).collect(Collectors.
                        groupingBy(c->c, LinkedHashMap::new,
                                Collectors.summingInt(x->1)));

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        WordCharCount.wordCharCount("virtusa");
    }
}
