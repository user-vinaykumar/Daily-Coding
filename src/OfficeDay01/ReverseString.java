package OfficeDay01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class ReverseString {

    public static String reverseString(String word)
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
        System.out.println(ReverseString.reverseString("virtusa"));
    }
}
