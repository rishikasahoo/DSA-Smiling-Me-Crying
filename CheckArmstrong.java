public class CheckArmstrong {
    static int Armstrong_num(int n) {
        int dup = n;
        int sum = 0;
        int x = n;
        int ld;
        while (x != 0) {
            ld = x % 10;
            x = x / 10;
            sum = sum + (ld*ld*ld);
        }
        if(sum == dup){
            System.out.println("Yes this is Armstrong No");

        }else{
            System.out.println("No this is not a Armstrong No");

        }
        return 0;
    }

    public static void main(String args[]) {
        // If you wish to take input from the user:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();

        int n = 153;
        int palindrome = Armstrong_num(n);
        System.out.println(palindrome);

        // sc.close();
    }
}
