package PracticeDay05;

import java.math.BigInteger;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {
        return BigInteger.valueOf(number).isProbablePrime(number);
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.isPrimeNumber(9));
        System.out.println(PrimeNumber.isPrimeNumber(12));
        System.out.println(PrimeNumber.isPrimeNumber(13));
    }
}
