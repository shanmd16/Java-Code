package Method_Overloading;

public class Upper_Function {
    public static void main(String[] args) {
        String res = upperfun("Shan");//call function
        System.out.println(res);
        System.out.println(sum(3 ,7));
        System.out.println(sum(3 ,7,10));
    }
    public static int SumOfArray(int[] arr){
        int res=0;
        for(int i: arr){
            res+=i;

        }
        return res;
    }
    private static String upperfun(String Str){
        return Str.trim().toUpperCase();
    }
    private static int sum(int a,int b){
        return a+b;
    }
    private static int sum(int a,int b,int c){
        return a+b+c;
    }

}
