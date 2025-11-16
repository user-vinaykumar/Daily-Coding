package CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class EvenNumber
{

    public static List<Integer> evenNumber(List<Integer> list)
    {
        return list.stream().filter(n->n%2==0).toList();
    }



    public static void main(String[] args) {
        List<Integer> inputLIst = Arrays.asList(2, 3, 4, 5, 6, 7, 89, 22, 11, 34);
        System.out.println(EvenNumber.evenNumber(inputLIst));
    }


}
