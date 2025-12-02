package OfficeWorkPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class EvenNumberList {

    public static List<Integer> evenNumberList(List<Integer> inputList)
    {
        return inputList.stream().filter(n->n%2==0).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 9, 0));
        System.out.println(EvenNumberList.evenNumberList(list));
    }
}
