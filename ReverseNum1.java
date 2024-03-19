public class ReverseNum1 {
    static int reverseNum(int n) {
        int reverse_num = 0;
        int x = n;
        int ld;
        while (x != 0) {
            ld = x % 10;
            x = x / 10;
            reverse_num = (reverse_num * 10) + ld;
        }
        return reverse_num;
    }

    public static void main(String args[]) {
        // If you wish to take input from the user:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        int n = 12345;
        int reversed = reverseNum(n);
        System.out.println("Reverse number of " + n + " is " + reversed);

        // sc.close();
    }
}
