package PracticeDay05;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> fibonacci(int number) {
        List<Integer> outputList = new ArrayList<>();
        if (number == 0) return outputList;
        outputList.add(0);
        if (number == 1) return outputList;
        outputList.add(1);
        for (int i = 2; i < number; i++) {
            outputList.add(outputList.get(i - 1) + outputList.get(i - 2));
        }
        return outputList;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonacci(8));
    }
}
