package Workoholic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list) {
        List<Integer> zeroList = list.stream()
                .filter(n -> n == 0).collect(Collectors.toList());
        List<Integer> outputList = list.stream()
                .filter(n -> n != 0).collect(Collectors.toList());

        outputList.addAll(zeroList);
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1,0,3,0,4,0,5,6,0,8,8,3));
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
