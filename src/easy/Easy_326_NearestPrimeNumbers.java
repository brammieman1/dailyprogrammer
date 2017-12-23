package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Easy_326_NearestPrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        String input = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(input);
        System.out.println(primeTuple(bigInteger));

    }

    public static String primeTuple(BigInteger n){
        if (n.isProbablePrime(100)){
            return n + " is prime.";
        } else {
            return nearestPrimeBelow(n) + " < " + n + " < " + nearestPrimeAbove(n);
        }
    }

    public static BigInteger nearestPrimeBelow(BigInteger n){
        do {
            n = n.subtract(BigInteger.ONE);
        } while (!n.isProbablePrime(100));
        return n;
    }

    public static BigInteger nearestPrimeAbove(BigInteger n){
        do {
            n = n.add(BigInteger.ONE);
        } while (!n.isProbablePrime(100));
        return n;
    }
}
