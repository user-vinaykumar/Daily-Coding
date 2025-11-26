package RoughWork;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeList {

    public static List<Integer> primeNumbers(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++)
        {
             if(BigInteger.valueOf(list.get(i)).isProbablePrime(list.get(i)))
             {
                 outputList.add(list.get(i));
             }
        }
        return outputList;
    }

    public static void main(String[] args) {
     List<Integer> inputList = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11, 23, 45, 67, 89, 84);
        System.out.println(PrimeList.primeNumbers(inputList));
    }
}
