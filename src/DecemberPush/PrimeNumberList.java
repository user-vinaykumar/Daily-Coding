package DecemberPush;

import java.math.BigInteger;
import java.util.List;

public class PrimeNumberList {

    public static List<Integer> primeList(List<Integer> list) {
        return list
                .stream()
                .filter(n -> BigInteger.valueOf(n).isProbablePrime(n))
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 3, 5, 7, 9, 11);
        System.out.println(PrimeNumberList.primeList(inputList));
    }
}
