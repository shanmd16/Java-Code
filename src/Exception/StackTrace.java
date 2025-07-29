package Exception;

//public class StackTrace {
//    public static void main(String[] args) {
//        level1();
//
//    }
//    public static void level3(){
//        int[] array =new int[5];
//        array[5] =10;
//
//    }
//    public static void level2(){
//        level3();
//    }
//    public static void level1(){
//        level2();
//    }
//}

class StackTrace2{
    public static void main(String[] args) {
        try{
            level1();

        }catch (Exception o){
            o.printStackTrace();
        }

    }

    private static void level1() {
    }
}




