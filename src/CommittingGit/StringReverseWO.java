package CommittingGit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class StringReverseWO {

    public static String stringReverseWO(String word)
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
        System.out.println(StringReverseWO.stringReverseWO("virtusa"));
    }
}
