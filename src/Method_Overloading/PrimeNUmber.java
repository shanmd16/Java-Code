package Method_Overloading;

public class PrimeNUmber {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(18));
        System.out.println(isPrime(19));
        System.out.println(isPrime(7493));
    }
    public static boolean isPrime(int x){
        int res =0;
        for(int i=1;i<x/2;i++){
            if(x%i==0){
                res++;
            }
        }
        return res ==1;

    }
}