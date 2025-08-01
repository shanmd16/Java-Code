package Array;

import java.util.Arrays;

//public class SecondMaximumArray {
//    public static int getSecondMaximum(int[] arr){
//        Arrays.sort(arr);
//        return arr[arr.length-2];
//    }
//
//    public static void main(String[] args) {
//        int [] arr ={75,55,25,15};
//        int result =getSecondMaximum(arr);
//        System.out.println("SecondMaximum Number: " +result);
//
//    }
//}


public class SecondMaximumArray {
    public static int getSecondMax(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first  = num;
            } else if (num > second && num != first) {
                second = num;

            }

        }
  return second;
}

    public static void main(String[] args) {
        int [] arr = {75, 55, 25 ,15};
        System.out.println("Second Max: " + getSecondMax(arr));
    }

}
