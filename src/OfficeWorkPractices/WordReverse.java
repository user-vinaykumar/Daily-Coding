package OfficeWorkPractices;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class WordReverse {

    public static String wordReverse(String word)
    {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : word.toCharArray())
        {
            stack.push(c);
        }
        String str = stack.stream().map(String::valueOf).collect(Collectors.joining());
        return str;
    }

    public static void main(String[] args) {
        System.out.println(WordReverse.wordReverse("virtusa"));
    }
}
