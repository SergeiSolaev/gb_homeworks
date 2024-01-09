import java.lang.reflect.Array;
import java.util.*;

//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = generateList(); //Список случайных целых чисел
        System.out.println(list);
        ArrayList<Integer> oddNumbers= deleteEvenNumbers(list); //Список нечётных числа
        System.out.println(oddNumbers);
        int min = findMin(oddNumbers); //Минимальное значени
        System.out.println(min);
        int max = findMax(oddNumbers); //Максимальное значение
        System.out.println(max);
        double average = findAverage(oddNumbers); //Среднее значение
        System.out.println(average);
    }

    public static ArrayList generateList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt(50));
        }
        return list;
    }  //Создаём список случайных целых чисел

    public static ArrayList deleteEvenNumbers(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i%2 == 0) {
                iterator.remove();
            }
        }
        return list;
    } //Удаляем чётные числа

    public static int findMin(ArrayList<Integer> list){
        list.sort(Comparator.naturalOrder());
        int min = list.get(0);
        return min;
    } //Ищем минимальное значение

    public static int findMax(ArrayList<Integer> list){
        list.sort(Comparator.naturalOrder());
        int max = list.get(list.size()-1);
        return max;
    } //Ищем максимальное значение

    public static double findAverage(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        double sum = 0;
        while (iterator.hasNext()){
            int i = iterator.next();
            sum = sum + i;
        }
        double average = Math.round((sum/list.size())*100.0)/100.0;
        return average;
    } //Ищем среднее значение

}


