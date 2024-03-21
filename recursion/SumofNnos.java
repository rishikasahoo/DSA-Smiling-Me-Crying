package RECURSION;

public class SumofNnos {
    // printing sum
    static int sum(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    // printing factorial
    static int factorial(int n) {
        int fact = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
        public static void main(String args[]){
        int n1 = 3;
        int n2 = 5;
        System.out.println(sum(n1));
            System.out.println(factorial(n2));
    }
}
