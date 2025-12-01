package OfficeDay01;

import java.util.*;
import java.util.stream.Collectors;

public class MoveZeros {

    public static List<Integer> moveZeros(List<Integer> list)
    {
        if(list == null || list.isEmpty()) return Collections.emptyList();

        List<Integer> outputList1 = list.stream().filter(n -> n==0).collect(Collectors.toList());
        List<Integer> outputList2  = list.stream().filter(n-> n!=0).collect(Collectors.toList());

        outputList2.addAll(outputList1);

        return outputList2;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 0, 0, 4));
        System.out.println(MoveZeros.moveZeros(inputList));
    }
}
