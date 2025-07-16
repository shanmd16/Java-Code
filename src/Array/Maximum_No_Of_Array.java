package Array;

public class Maximum_No_Of_Array {
    public static void main(String[]args){
        int []arr=new int[5];
        arr[0]=2;
        arr[1]=12;
        arr[2]=4322;
        arr[3]=-32;
        arr[4]=22;
        int res =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res){
                res=arr[i];
            }
        }
        System.out.println(res);


    }

}
