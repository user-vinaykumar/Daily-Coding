package DailyGit;

import java.util.Comparator;
import java.util.List;

public class SecondHighestStream {

    public static int secondHighest(List<Integer> list)
    {
        int secondHighestNumber = list
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        return secondHighestNumber;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(SecondHighestStream.secondHighest(inputList));
    }
}
