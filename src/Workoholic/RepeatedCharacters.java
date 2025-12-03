package Workoholic;

import javax.swing.text.html.HTMLDocument;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacters {

    public static void repeatedCharacters(String word)
    {
        int count = 0;
        LinkedHashMap<Character, Integer> map = word.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c-> c, LinkedHashMap::new,
                        Collectors.summingInt(x->1)));
        for(Map.Entry<Character, Integer> maEntry : map.entrySet())
        {
            if(maEntry.getValue()>1)
            {
                System.out.println(maEntry.getKey()+":"+maEntry.getValue());
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No characters has repeated more than once.");
        }
    }

    public static void main(String[] args) {
        RepeatedCharacters.repeatedCharacters("virtusa");
    }
}
