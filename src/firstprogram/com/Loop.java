package firstprogram.com;

public class Loop {
    public static void main(String[] args) {
        /*int i=1;
        for (i = 1; i<=100;i++) {

            System.out.println(i);
        }*/


//        print this pattern 1
//                           1 0
//                           1 0 0
//                           1 0 0 0
//                           1 0 0 0 0
//                           1 0 0 0 0 0
      /*  for(int i=1;i<=100000;i=i*10){
            System.out.println(i);
        }*/
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *

        //int row,col;
        // error
        // code 1
      /* for (int row = 1; row <= 6; row++) {
           for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/


        //code 2
        // Outer loop for rows
                /*for (int row = 1; row <= 6; row++) {
                    // Inner loop for columns
                    for (int col = 1; col <= row; col++) {
                        System.out.print("* ");
                    }
                    // Move to next line after each row
                    System.out.println();
                }
            }
        }*/


        // factorial of a number //6!
       /* int n = 6;
        int res = 1;
        while (n > 0) {
            res = res * n;
            n--;
        }
        System.out.println(res);*/


    /*int i=1;
    while(i<=20){
        System.out.println(i);
        i++;
    }*/


        // Sum of first 10 natural number
        /*int sum =0;
        int i =1;
        while(i<=10){
            sum=sum+i;
            System.out.println(sum);
            i++;
        }*/


// count digits of numberint
        /*int  n =999999990;
        int  res =0;
        while(n>0){
            n=n/10;
            res++;
        }
        System.out.println(res);*/


        //Do while loop
        /*int i=1;
        do {
            System.out.println(i);
            i++;
        } while(i<=50);*/

        // count hello world
       /* int res = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; i++) {
                res++;
            }
        }
        System.out.println(res);
    }

}*/

// Break Statement

        /*int i = 0;
        while (i < 1000) {
            System.out.println(i);
            if (i == 500) {
                break;
            }
            i++;
        }
        System.out.println("hello");
    }
}
*/

        // continue Statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
        














