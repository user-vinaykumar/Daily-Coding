package PracticeDay03;

import java.math.BigInteger;

public class ArmstrongClass {


    public static boolean armstrong(BigInteger number) {
        String numString = String.valueOf(number);
        BigInteger sum = BigInteger.ZERO;
        int exponential = numString.length();

        for (char c : numString.toCharArray()) {
            int digit = c - '0';
            BigInteger bigDigit = BigInteger.valueOf(digit);

            sum = sum.add(bigDigit.pow(exponential));


        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("183");

        if (armstrong(bigInteger)) {
            System.out.println("the given number is armstrong number");
        } else {
            System.out.println("the given number is not an armstrong number");
        }

    }
}
