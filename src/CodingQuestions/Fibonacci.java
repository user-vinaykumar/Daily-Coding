package CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci
{

    public static List<Integer> fibonacci(int number)
    {
        List<Integer> list1 = new ArrayList<>();
        if(number == 0)
        {
            return list1;
        }
        list1.add(0);
        if(number == 1)
        {
            return list1;
        }
        list1.add(1);
        for(int i = 2; i < number; i++)
        {
            list1.add(list1.get(i-1)+list1.get(i-2));
        }
        return list1;
    }


    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(2, 3, 4, 5, 6, 11, 77, 67, 9, 0, 222);
        System.out.println(Fibonacci.fibonacci(10));
    }

}
