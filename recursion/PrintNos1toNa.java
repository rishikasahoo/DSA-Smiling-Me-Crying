package RECURSION;

public class PrintNos1toNa {
    static void func(int i, int n) {
        // PRINTING IN REVERSE ORDER
        if (i < 1) {
            return;
        }
        System.out.println(i);
        func(i - 1, n);
    }


//        if (i > n) {
//            return;
//        }
//        System.out.println(i);
//        func(i+1,n);
//    }
    public static void main(String args[]){
        int n =25;
        func(n,n);
//        func(1,n);
    }
}


