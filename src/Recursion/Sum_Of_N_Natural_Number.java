package Recursion;

public class Sum_Of_N_Natural_Number {
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumber( 5));
    }


    public static int sumOfNNaturalNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNNaturalNumber(n - 1);
    }
}

