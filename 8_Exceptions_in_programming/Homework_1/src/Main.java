
public class Main {
    public static void main(String[] args) {
        //Task1
        //divideByZero();
        //checkArraySize();
        //numberFormatException();

        //Task2
        //int [] a = new int[]{4, 6, 5, 6};
        //int [] b = new int[]{1, 2, 3};
        //subArrays(a,b);

        //Task3
        //int [] a = new int[]{12, 8, 16};
        //int [] b = new int[]{4, 2, 4};
        //divArrays(a,b);

    }

    // Ошибка, связанная с делением на 0
    public static void divideByZero() {
        int a = 1;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        System.out.print(a/b);
    }

    // Ошибка, связанная с выходом за пределы массива
    public static void checkArraySize() {
        int [] arr = {1,2,3,4,5};
        int index = 6;
        if (index  > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }
        System.out.print(arr.length);
    }

    //Ошибка преобразования строки в число
    public static void numberFormatException() {
        String str = null;

        if (str == null) {
            throw new NumberFormatException("Неудалось преобразовать строку в число");
        }
        int num = Integer.parseInt(str);
        System.out.print(num);
    }

    /*  Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
        и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих массивов
        в той же ячейке.
        Если длины массивов не равны - верните нулевой массив длины 1.
        Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив
     */

    public static int[] subArrays(int[] a, int[] b){
        if (a.length != b.length){
            return new int[]{0};
        }
        int [] c = new int[3];
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] - b[i];
        }
        return c;
    }
    /*
        Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b,
        и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов
        в той же ячейке. Если длины массивов не равны - верните нулевой массив длины 1.
        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
        т.е. ваше.
        Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
        int[] a - первый массив
        int[] b - второй массив
     */
    public static int[] divArrays(int[] a, int[] b){
        if (a.length != b.length){
            return new int[]{0};
        }
        int [] c = new int[3];
        for (int i = 0; i < c.length; i++){
            if(b[i] == 0){
                throw new RuntimeException("Деление на ноль");
            }
            c[i] = a[i]/b[i];
        }
        return c;
    }
}

