package Method_Overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(3, 7));
        System.out.println(sum(3, 7, 10));
    }

    private static int sum(int a,int b){
        return a+b;
    }
    private static int sum(int a,int b,int c){
        return a+b+c;
    }

}

