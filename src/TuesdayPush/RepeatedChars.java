package TuesdayPush;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedChars {

    public static void repeatedChars(String word)
    {
        int count = 0;
        HashMap<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,
                        Collectors.summingInt(d->1)));

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
            System.out.println("No characters has repeated more than once in a given string");
        }

    }

    public static void main(String[] args) {
        RepeatedChars.repeatedChars("virtusa");
        RepeatedChars.repeatedChars("malayalam");
    }
}
