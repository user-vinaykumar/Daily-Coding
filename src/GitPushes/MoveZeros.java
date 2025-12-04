package GitPushes;

import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static List<Integer> movezeros(List<Integer> list)
    {
        List<Integer> zeroList = list.stream().filter(n->n==0).toList();
        List<Integer> nonZeroList = list.stream().filter(n->n!=0)
                .collect(Collectors.toList());
        nonZeroList.addAll(zeroList);
        return nonZeroList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 0, 9, 3, 8, 0, 0, 0, 6, 8, 9);
        System.out.println(MoveZeros.movezeros(inputList));
    }
}
