package GitPushes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HighCharCount {

    public static void highChar(String word)
    {
        LinkedHashMap<Character, Integer> map = word.chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,
                        LinkedHashMap::new, Collectors.summingInt(x->1)));
        Map.Entry<Character, Integer> highCount = map.entrySet()
                .stream().max(Map.Entry.comparingByValue()).orElse(null);
        if(highCount != null)
        {
            System.out.println(highCount.getKey()+":"+highCount.getValue());
        }
    }

    public static void main(String[] args) {
        HighCharCount.highChar("virrtusaaaaaaaaa");
    }
}
