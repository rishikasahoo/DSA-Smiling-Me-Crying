public class CheckPrime1 {
    static void check_prime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
                break; // If a divisor is found, break the loop
            }
        }
        if (count == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }

    public static void main(String[] args) {
        check_prime(23);
    }
}
