package GitCodePushDay;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NthLargest {

    public static int nthLargestNumber(List<Integer> list, int n)
    {
        List<Integer> sortedList = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return sortedList.get(n -1);
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(NthLargest.nthLargestNumber(inputList, 4));
    }
}
