package GitCodePushDay;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class WordReverse {

    public static String wordReverse(String word) {
        Deque<Character> stack = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(ArrayDeque::new,
                        Deque::push,
                        Deque::addAll);

        String reversedWord = stack
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        return reversedWord;
    }

    public static void main(String[] args) {
        System.out.println(WordReverse.wordReverse("virtusa"));
    }
}
