package CodingQuestions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

class StringReverseWithoutBuilder {

    public static String stringReverse(String word) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }
        String res = stack.stream().map(String::valueOf).collect(Collectors.joining());
        return res;
    }


    public static void main(String[] args) {
        System.out.println(StringReverseWithoutBuilder.stringReverse("virtusa"));
    }
}