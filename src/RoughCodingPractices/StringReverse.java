package RoughCodingPractices;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class StringReverse
{
    public static String reverseWordWithoutFunction(String word)
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
        System.out.println(StringReverse.reverseWordWithoutFunction("virtusa"));
    }
}
