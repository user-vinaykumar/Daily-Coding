package RoughCodingPractices;

import java.math.BigInteger;

public class Prime {

    public static boolean isPrime(int number)
    {
        return BigInteger.valueOf(number).isProbablePrime(number);
    }


    public static void main(String[] args) {
        System.out.println(Prime.isPrime(8));
    }
}
