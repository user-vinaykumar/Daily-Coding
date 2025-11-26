package RoughWork;

import java.util.List;

public class EvenNumberList {

    public static List<Integer> evenNumberList(List<Integer> list)
    {
        return list.stream().filter(n->n%2==0).toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 0, 12);
        System.out.println(EvenNumberList.evenNumberList(inputList));
    }
}
