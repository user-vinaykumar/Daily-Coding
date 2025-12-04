package GitPushes;

import java.math.BigInteger;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeList(List<Integer> list) {
        List<Integer> outputList = list.stream()
                .filter(n -> BigInteger.valueOf(n).isProbablePrime(n))
                .toList();
        return outputList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 3, 5, 7, 13, 17, 33, 34, 19, 54);
        System.out.println(PrimeNumberList.primeList(inputList));
    }
}
