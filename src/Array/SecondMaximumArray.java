package Array;

import java.util.Arrays;

public class SecondMaximumArray {
    public static int getSecondMaximum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int [] arr ={75,55,25,15};
        int result =getSecondMaximum(arr);
        System.out.println("SecondMaximum Number: " +result);

    }
}