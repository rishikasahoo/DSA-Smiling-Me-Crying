import java.util.ArrayList;
import java.util.Collections;

public class PrintDivisors2 {
    public static void main(String[] args) {
        printDivisorsOptimal(36);
    }
    public static void printDivisorsOptimal(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) divisors.add(n / i);
            }
        }
        Collections.sort(divisors); // Sort the divisors in ascending order
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }

}