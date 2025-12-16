package TuesdayPush;

import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list)
    {
        List<Integer> zeroList = list
                .stream()
                .filter(n->n==0)
                .toList();

        List<Integer> nonZeroList = list
                .stream()
                .filter(n->n!=0)
                .collect(Collectors.toList());

        nonZeroList.addAll(zeroList);
        return nonZeroList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 0, 0, 0, 4, 5, 6, 0, 0, 8);
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
