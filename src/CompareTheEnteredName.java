import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTheEnteredName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задумано имя");
        System.out.print("Попытайся его угадать:           ");
        String name;
        while (true){
            name = reader.readLine();
            if(name.equals("Вячеслав")){
                break;
        }else if (name.isEmpty() && name != "Вячеслав")
                System.out.println("Нет такго имени");
        }
        System.out.println("Привет Вячеслав");
    }
}
