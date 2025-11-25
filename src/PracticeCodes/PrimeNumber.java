package PracticeCodes;

import java.math.BigInteger;

public class PrimeNumber {

    public static boolean isPrime(int number)
    {
        return BigInteger.valueOf(number).isProbablePrime(number);
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.isPrime(89));
    }
}
