public class CountDigits2 {
    static int count_digits(int n) {
        String n2 = Integer.toString(n);
        return n2.length();
    }

    public static void main(String args[]) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + count_digits(n));
    }
}
