package Method_Overloading;

public class Sum_Array {
    public static void main(String []args) {
        int[] a = {3, 3, 3, 3, 34, 45};
        System.out.println(sumOfArray(a));
        int[] b = {3, 3, 3, 3, 3, 21, 1,2, 33};
        System.out.println(sumOfArray(b));

    }
        public static int sumOfArray(int[]arr){
            int res = 0;
            // For Each Loop
            for (int i : arr) {
                res += i;
            }

            return res;

        }

    }



