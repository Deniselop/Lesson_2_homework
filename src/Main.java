

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {

    //sout
    //psvm

   public  static void main(String[] args) {


       for (int i = 0; i < 10; i++) {

           System.out.println("Hello, World!");

       }

       for (int b = 0; b < 10; ) {
           Scanner input = new Scanner(System.in);

           System.out.print("Введите имя пользователя:");
           char letter = input.next().charAt(0);

           if (Character.toString(letter).matches("^[а-яА-Я]*$")) {
               System.out.println("Здравствуйте, " + letter + "!");
           } else {
               System.out.println("Пожалуйста, вводите только буквы!");
           }
           b++;

           return;

       }
   }

}