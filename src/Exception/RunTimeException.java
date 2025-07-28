package Exception;

public class RunTimeException {
    public static void main(String[] args) {
        int [] numerators ={10,20,30,40};
        int [] denometors ={1,2,0,4};
        for (int i=0;i<numerators.length;i++){
            System.out.println(divide(numerators[i],denometors[i]));

            }
            System.out.println("God job");
        }
        public static int divide (int a,int b){
            try{
                return a/b;
            }
            catch (ArithmeticException e){
                System.out.println(e);
                return -1;
            }
        }
    }

