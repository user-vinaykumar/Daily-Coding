package Workoholic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static int secondLargest(List<Integer> list, int number) {
        List<Integer> outputList = list.stream().distinct()
                .sorted(Comparator.reverseOrder()).toList();

        int secondLargestNumber = outputList.get(number - 1);
        return secondLargestNumber;
    }


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9, 7, 8));
        System.out.println(SecondLargest.secondLargest(inputList, 2));
    }
}
