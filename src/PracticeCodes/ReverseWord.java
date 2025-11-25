package PracticeCodes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class ReverseWord {

    public static String reverseWord(String word)
    {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : word.toCharArray())
        {
            stack.push(c);
        }
        String result = stack.stream().map(String::valueOf).collect(Collectors.joining());
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ReverseWord.reverseWord("virtusa"));
    }
}
