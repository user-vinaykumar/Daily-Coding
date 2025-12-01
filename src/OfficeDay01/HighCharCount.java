package OfficeDay01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighCharCount {

    public static void highcharcount(String word)
    {
        LinkedHashMap<Character, Integer> map = word.chars().mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(c->c, LinkedHashMap::new,
                                Collectors.summingInt(x->1)));

        Map.Entry<Character, Integer> output = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);

        if(output!=null)
        {
            System.out.println(output.getKey()+":"+output.getValue());
        }


    }

    public static void main(String[] args) {
     HighCharCount.highcharcount("virtussaa");
    }
}
