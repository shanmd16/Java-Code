package BinarySearch;

public class Program {

    public int binarySearch(int[] arr, int key) {
        int l = 0;
        int h = arr.length - 1;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return 0;
    }
}
