package PracticeCodes;

import java.util.List;
import java.util.stream.Collectors;

public class MoveZerosToTheEnd {

    public static List<Integer> moveZerosToEnd(List<Integer> list) {
        List<Integer> zeroList = list
                .stream()
                .filter(n -> n == 0)
                .toList();

        List<Integer> nonZeroList = list
                .stream()
                .filter(n -> n != 0)
                .collect(Collectors.toList());

        nonZeroList.addAll(zeroList);
        return nonZeroList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 0, 0, 3, 9, 9, 4, 0, 7);
        System.out.println(MoveZerosToTheEnd.moveZerosToEnd(inputList));
    }
}
