package Day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberList {

    public static List<Integer> evenNumberList(List<Integer> list)
    {
        return list.stream().filter(n->n%2==0).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(EvenNumberList.evenNumberList(inputList));
    }
}
