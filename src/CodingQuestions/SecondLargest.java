package CodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargest {

    public static void secondLargest(List<Integer> list, int number)
    {
        List<Integer> outputList = list.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        int output = outputList.get(number-1);
        System.out.println("The second largest number is : "+output);
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1,3, 55, 77, 43, 87, 21, 9, 43));
        SecondLargest.secondLargest(inputList, 2);
    }
}
