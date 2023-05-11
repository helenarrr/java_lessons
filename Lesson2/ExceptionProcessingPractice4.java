package Lesson2;

import java.util.Scanner;

public class ExceptionProcessingPractice4 {

    //    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст кроме пустой строки");
        String result = scanner.nextLine();
        if (result.equals("") || result.equals(" ")) throw new RuntimeException("Пустую строку вводить нельзя");

        System.out.println(result);
    }
}
