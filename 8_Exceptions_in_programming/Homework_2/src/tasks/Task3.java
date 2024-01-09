// Если необходимо, исправьте данный код
package tasks;

public class Task3 {
    public static void task3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;                              // Здесь выход за границы индекса массива.Исправлять не стал

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {                                             // Данную проверку опустил из начала в конец
            System.out.println("Что-то пошло не так...");                    // иначе нарушается иерархия исключений.
        }

    }
    public static void printSum(Integer a, Integer b) throws ArithmeticException {  // Здесь изменил тип исключения
        System.out.println(a + b);
    }
}