package TuesdayPush;

import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static int secondLargest(List<Integer> list)
    {
        return list
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(000000000000000000);
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(SecondLargest.secondLargest(inputList));
    }
}
