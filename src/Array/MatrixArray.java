package Array;

//public class MatrixArray {
//    public static void main(String[]args){
//        int [][]arr=new int [3][3];
//                int [][] nums= {
//                                      {1, 2, 3},
//                                      {4, 5, 6},
//                                      {7, 8, 9}
//                };
//                for(int i=0;i<nums.length;i++){
//                    for(int j=0;j<nums.length;j++){
//                        System.out.print(nums[i][j]+" ");
//                    }
//                    System.out.println();
//                }
//
//    }
//
//}


//Char Matrix
public class MatrixArray {
    public static void main(String[]args){
        char arr[][]=new char[3][2];
        arr[0][0]='a';
        arr[0][1]='b';
        arr[1][0]='c';
        arr[1][1]='d';
        arr[2][0]='e';
        arr[2][1]='f';
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

            }
        }
    }


