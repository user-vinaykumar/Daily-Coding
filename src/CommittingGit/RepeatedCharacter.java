package CommittingGit;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacter {

    public static void repeatedCharacter(String word)
    {
        int count = 0;
        Map<Character, Integer> map = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, HashMap::new,
                        Collectors.summingInt(d->1)));

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+":"+entry.getValue());
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("No character has repeated more than once");
        }
    }

    public static void main(String[] args) {
        RepeatedCharacter.repeatedCharacter("virtusa");
    }
}
