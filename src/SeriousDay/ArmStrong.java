package SeriousDay;

import java.math.BigInteger;

public class ArmStrong {

    public static boolean armstrong(BigInteger number) {
        String str = String.valueOf(number);
        int exponent = str.length();
        BigInteger sum = BigInteger.ZERO;

        for (char c : str.toCharArray()) {
            int digit = c - '0';
            BigInteger bigDigit = BigInteger.valueOf(digit);
            sum = sum.add(bigDigit.pow(exponent));
        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(153);
        if (ArmStrong.armstrong(input)) {
            System.out.println("The given number is an Armstrong number");
        } else {
            System.out.println("The given number is not an Armstrong Number");
        }
    }
}
