package GitPushes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharCount {

    public static void repeatedCharCount(String word)
    {
        int count =0;
        LinkedHashMap<Character, Integer> map = word.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,
                        Collectors.summingInt(x->1)));

        for(Map.Entry<Character, Integer> entries : map.entrySet())
        {
            if(entries.getValue()>1)
            {
                System.out.println(entries.getKey()+":"+entries.getValue());
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No Characters has repeated more than once.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharCount.repeatedCharCount("virtusa");
    }
}
