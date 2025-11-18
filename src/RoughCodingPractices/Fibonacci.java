package RoughCodingPractices;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci
{
    public static List<Integer> fibonacci(int number)
    {
        List<Integer> list = new ArrayList<>();
        if(number==0) return list;
        list.add(0);
        if(number==1) return list;
        list.add(1);
        for(int i = 2; i < number; i ++)
        {
            list.add(list.get(i-1)+list.get(i-2));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacci(8));
    }

}
