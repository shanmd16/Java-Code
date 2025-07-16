package Recursion;

public class Find_Factorial {
    public static void main(String[] args) {
        System.out.println(factorail(5));
    }

    public static int factorail(int n){
          if (n==1){
              return 1;

          }
          return n*factorail(n-1);
    }
}