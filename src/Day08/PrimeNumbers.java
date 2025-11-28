package Day08;

import RoughCodingPractices.Prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> primeList(List<Integer> list)
    {
        List<Integer> outputList = new ArrayList<>();

        for(int i =0; i < list.size(); i++)
        {
            if(BigInteger.valueOf(list.get(i)).isProbablePrime(list.get(i)))
            {
                outputList.add(list.get(i));
            }
        }
        return outputList;
    }


    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 3, 5, 7, 9, 11, 13, 15, 17);
        System.out.println(PrimeNumbers.primeList(inputList));
    }
}
