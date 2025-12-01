package OfficeDay01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static List<Integer> primeList(List<Integer> list)
    {
        List<Integer> outputList = list.stream()
                .filter(n -> BigInteger.valueOf(n).isProbablePrime(n)).toList();
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 13, 14, 17, 19, 2, 24, 77));
        System.out.println(PrimeNumber.primeList(inputList));
    }
}
