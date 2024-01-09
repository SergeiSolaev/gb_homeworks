/*
Task 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

package tasks;

import java.util.Scanner;

public class Task1 {
    public static void task1() {
        int x = 0;
        while (x != 1) {
            System.out.println("Введите число: ");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println(number);
                x = 1;

            } catch (Exception NumberFormat) {
                System.out.println("Exception NumberFormat: Необходимо ввести число, попробуйте снова");
            }
        }
    }
}
