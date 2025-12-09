package GitCodePushDay;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacter {

    public static void highCharCount(String word)
    {
        int count = 0;
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,
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
            System.out.println("No characters in the string has repeated more than once.");
        }
    }

    public static void main(String[] args) {
     RepeatedCharacter.highCharCount("virttusa");
    }
}
