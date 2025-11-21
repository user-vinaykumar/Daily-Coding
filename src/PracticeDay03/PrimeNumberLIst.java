package PracticeDay03;

import java.util.ArrayList;
import java.util.List;
import PracticeDay03.ProbablePrime.*;

public class PrimeNumberLIst {

    public static List<Integer> primeNumberList(List<Integer> list)
    {
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < list.size(); i ++)
        {
            if(ProbablePrime.isPrime(list.get(i)))
            {
                resultList.add(list.get(i));
            }

        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15);
        System.out.println(PrimeNumberLIst.primeNumberList(inputList));
    }
}
