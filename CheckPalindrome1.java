public class CheckPalindrome1 {

        static int Palindrome_num(int n) {
            int dup = n;
            int reverse_num = 0;
            int x = n;
            int ld;
            while (x != 0) {
                ld = x % 10;
                x = x / 10;
                reverse_num = (reverse_num * 10) + ld;
            }
            if(reverse_num == dup){
                System.out.println("Yes this is palindrome");

            }else{
                System.out.println("No this is not a palindrome");

            }
            return 0;
        }

        public static void main(String args[]) {
            // If you wish to take input from the user:
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter a number: ");
            // int n = sc.nextInt();

            int n = 121;
            int palindrome = Palindrome_num(n);
            System.out.println(palindrome);

            // sc.close();
        }
    }


