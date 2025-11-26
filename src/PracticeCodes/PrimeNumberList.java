package PracticeCodes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeList(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for(int i = 0; i < list.size(); i ++)
        {
            if(BigInteger.valueOf(list.get(i)).isProbablePrime(list.get(i)))
            {
                outputList.add(list.get(i));
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 26, 227, 9);
        System.out.println(PrimeNumberList.primeList(inputList));
    }
}
