package VinayGitPush;

import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list) {
        List<Integer> zeroList = list.stream()
                .filter(n -> n == 0)
                .toList();

        List<Integer> nonZeroList = list.stream()
                .filter(n -> n != 0)
                .collect(Collectors.toList());

        nonZeroList.addAll(zeroList);

        return nonZeroList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 4);
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
