package CodingQuestions;

import java.math.BigInteger;

public class ProbablePrime {

    public static boolean isPrime(int number) {
        return BigInteger.valueOf(number).isProbablePrime(number);
    }


    public static void main(String[] args) {
        System.out.println(ProbablePrime.isPrime(4));
        System.out.println(ProbablePrime.isPrime(3));
    }


}
