package Method_Overloading;

//public class Object_Pass {
//    public static void main(String[] args) {
//        int x = 10;
//        System.out.println(multiplyBy10(10)); //x pass
//        System.out.println(x);
//    }
//
//        public static int multiplyBy10(int x){ //x copy
//            return x*10;
//        }
//    }





// Character object pass
public class Object_Pass {
    public static void main(String[] args) {
        String a="Shan";
        System.out.println(upper(a)); //x pass
        System.out.println(a);
    }

    public static String upper(String str){ //x copy
        return str.toUpperCase();
    }
}
