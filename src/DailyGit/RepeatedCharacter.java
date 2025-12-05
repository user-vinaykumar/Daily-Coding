package DailyGit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacter {

    public static void repeatedCharacter(String word)
    {
        int count =0;
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,
                        Collectors.summingInt(x->1)));

        for(Map.Entry<Character, Integer> repeatedEntries : map.entrySet())
        {
            if(repeatedEntries.getValue()>1)
            {
                System.out.println(repeatedEntries.getKey()+":"+repeatedEntries.getValue());
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No Characters has repeated more than Once.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharacter.repeatedCharacter("virrtusa");
    }
}
