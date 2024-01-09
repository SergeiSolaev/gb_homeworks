// Если необходимо, исправьте данный код
package tasks;

public class Task2 {
    public static void task2() {

        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};     // не был задан массив, задал его

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        System.out.println("Завершение работы программы");  // добавил эту строку, чтобы было красиво (как в лекции)

    }

}
