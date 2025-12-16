package TuesdayPush;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedChars {

    public static void nonRepeatedChars(String word)
    {
        HashMap<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,
                        Collectors.summingInt(x->1)));
        for(Map.Entry<Character, Integer> entries : map.entrySet())
        {
            if(entries.getValue()==1)
            {
                System.out.println(entries.getKey());
            }
        }
    }

    public static void main(String[] args) {
        NonRepeatedChars.nonRepeatedChars("vviirtuussaa");
    }
}
