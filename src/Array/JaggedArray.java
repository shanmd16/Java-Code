package Array;

public class JaggedArray {
    public static void main(String[]args){
        char [][] arr = new char[3][];
        arr[0]  = new char[2];
        arr[1]  = new char[3];
        arr[2]  = new char[2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[1][2] = 'e';
        arr[2][0] = 'f';
        arr[2][1] = 'g';
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
}
