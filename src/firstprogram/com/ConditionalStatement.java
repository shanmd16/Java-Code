package firstprogram.com;

public class ConditionalStatement {
    public static void main(String[] args) {
        /*int age = 2;
        if (age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("you are a child");
        }*/



        /*int age=50;
        int marks=35;
        if (age<=20 && marks>=33) {
            System.out.println("congrats");
        }else {
            System.out.println("Better for next time");
        }*/


//        int marks =99;
//        int marks =90;
//        int marks =75;
       /* int marks =60;

        if(marks>=99){
        System.out.println("GradeA");
    }else if(marks>=75){
            System.out.println("GradeB");
        }else if(marks>=60){
            System.out.println("GradeC");
        }else {
            System.out.println("GradeA");
        }*/


//        used(multiple condition) if else if else statement
       int day =3;

        /*if(day==1){
                System.out.println("Monday");
            }
             else if(day==2){
            System.out.println("Tuesday");
        }

        else if(day==3){
            System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else if(day==7){
            System.out.println("Sunday");
        }
         else{
             System.out.println("Invalid Day");
        }*/




      switch (day){
            case 1:{
                System.out.println("Monday");
            }

            case 2:{
                    System.out.println("Tuesday");
            }
            case 3:{
              System.out.println("Wednesday");
              break;
            }
           case 4:{
              System.out.println("Thursday");
          }
          case 5:{
              System.out.println("Friday");
          }
          case 6:{
              System.out.println("Saturday");
          }
          case 7:{
              System.out.println("Sunday");
          }
          default: {
              System.out.println("Invalidday");
          }


        }
    }
}