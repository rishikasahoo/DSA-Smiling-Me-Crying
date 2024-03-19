public class CountDigits1 {
    static int count_digits(int n) {
        int x = n;
        int ld;
        int count = 0;
        while (x != 0) {
            ld = x % 10;
            System.out.println(ld);
            count++;
            x = x / 10;

        }
        return count;
    }

    public static void main(String args[]) {

        // IF WISH TO TAKE INPUT FROM THE USER:
        // Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int n = sc.nextInt();

        //System.out.println("Number of digits in " + n + " is " + count_digits(n));

        //sc.close();
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + count_digits(n));
    }
}
