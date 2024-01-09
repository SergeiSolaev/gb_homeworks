// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package tasks;

import java.util.Scanner;

public class Task4 {
    public static void task4() throws Exception{

        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        if (num.isEmpty()){
            throw new IllegalArgumentException("Пустые строки вводить нельзя.");
        }
        System.out.println("Программа завершена.");
    }
}
