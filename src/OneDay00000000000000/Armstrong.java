package OneDay00000000000000;

import java.math.BigInteger;

public class Armstrong {

    public static boolean armstrong(BigInteger number) {
        String str = String.valueOf(number);
        int exponential = str.length();
        BigInteger sum = BigInteger.ZERO;

        for (char c : str.toCharArray()) {
            int digit = c - '0';
            BigInteger bigDigit = BigInteger.valueOf(digit);
            sum = sum.add(bigDigit.pow(exponential));
        }
        return sum.equals(number);
    }

    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(153);
        if (Armstrong.armstrong(input)) {
            System.out.println("the provided number is an armstrong number");
        } else {
            System.out.println("the provided number is not an armstrong number");
        }
    }
}
