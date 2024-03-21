package RECURSION;

public class PrintNos1toNb {
    // printing nos 1 to N without using the func(i+1,n) in increasing order only
    static void func(int i, int n){
        if(i<1){
            return;
        }
        func(i-1,n);
        System.out.println(i);
    }
 //  printing nos N to 1 without using the func(i-1,n) in decreasing order only
    static void func1(int i, int n){
        if(i>n){
            return;
        }
        func1(i+1,n);
        System.out.println(i);
    }
    public static void main(String args[]){
        int n = 25;
        func1(1,n);
    }
}
