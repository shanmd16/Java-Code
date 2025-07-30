package WrapperClass;

public class IntegerMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(1,2));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(3,4));
        String str = "123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);
    }
}
