package firstprogram.com;

/*
public class helloworld {

    public static void main(String[] args){

        System.out.println("Hello world");
    }
}
*/

//w a p to print a arithmatic operations
public class helloworld {

    public static void main(String[] args) {
        int yourSalary=1000;
        int deduction =500;

        int monthlyTotal = yourSalary-deduction;
        int yearlyTotal = monthlyTotal*12;
        int perchild    = yearlyTotal/3;
        System.out.println(perchild);
    }
}