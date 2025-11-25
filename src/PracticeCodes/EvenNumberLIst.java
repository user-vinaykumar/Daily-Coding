package PracticeCodes;

import PracticeDay05.EvenNumberList;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberLIst {

    public static List<Integer> evenNumberList(List<Integer> list)
    {
        return list.stream().filter(n->n%2==0).toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(EvenNumberList.evenNumberList(inputList));
    }
}
