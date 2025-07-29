package Exception;

import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("a.txt");
        }catch (Exception e){

        }
    }
}
