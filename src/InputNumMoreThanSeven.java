import java.io.IOException;
import java.util.Scanner;

public class InputNumMoreThanSeven {
    public static void main(String args[]){
       int num;
        Scanner sr = new Scanner(System.in);
        System.out.println("Задумана цифра ввода 0-9");
        System.out.print("Попытайся её угадать:  ");
        if (sr.hasNextInt()){
            num = sr.nextInt();
            if(num >= 8){
                System.out.println("Привет");
            }else if(num <= 7){
                System.out.println("Попробуй еще раз");
            }
        }
    }
}

