public class CountDigits3 {
    static int count_digits(int n)
    {
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }

    public static void main(String args[])
    {
        int n = 12345;
        System.out.println("Number of digits in "+n+" is "+count_digits(n));
    }
}
