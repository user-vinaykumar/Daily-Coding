package DailyGit;

import java.util.Comparator;
import java.util.List;

public class NthLargest {

    public static int nthLargest(List<Integer> list, int number)
    {
        List<Integer> sortedList = list
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        int largestNumber = sortedList.get(number-1);
        return largestNumber;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1,2,3,4,5,6,7,8);
        System.out.println(NthLargest.nthLargest(inputList, 3));
    }
}
