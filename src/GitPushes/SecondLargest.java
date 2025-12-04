package GitPushes;

import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static int secondLargestNumber(List<Integer> list, int number) {
        List<Integer> listStream = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        int secondLargeNumber = listStream.get(number - 1);
        return secondLargeNumber;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);
        System.out.println(SecondLargest.secondLargestNumber(inputList, 2));
    }
}
