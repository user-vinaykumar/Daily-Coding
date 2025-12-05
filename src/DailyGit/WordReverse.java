package DailyGit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class WordReverse {

    public static String wordReverse(String word)
    {
        Deque<Character> stack = word
                .chars()
                .mapToObj(c->(char)c)
                .collect(ArrayDeque::new, Deque::push, Deque::addAll);


        String str = stack
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return str;
    }

    public static void main(String[] args) {
        System.out.println(WordReverse.wordReverse(".yawa rotcod eht speek yad a elppa nA"));
    }
}
