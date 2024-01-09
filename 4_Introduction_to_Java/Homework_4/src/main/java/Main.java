//Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        String input = "";
        Scanner in = new Scanner(System.in);
        Integer count = 0;
        System.out.println("Введите Фамилию Имя Отчество возраст и пол через пробел");
        System.out.println("Для окончания ввода введите done и нажмите Enter");

        while (!input.equals("done")){
            input = in.nextLine();
            if (!input.equals("done")){
                String [] tmp = input.split(" ");
                id.add(count);
                surname.add(tmp[0]);
                name.add(tmp[1]);
                patronymic.add(tmp[2]);
                age.add(Integer.parseInt(tmp[3]));
                gender.add(tmp[4]);
                count = count +1;
            }
        }
        if (input.equals("done")){
            for (int i = 0; i < id.size(); i++) {
                System.out.println(
                        id.get(i)+" "
                                +surname.get(i)+" "
                                +name.get(i).charAt(0)+". "
                                +patronymic.get(i).charAt(0)+". "
                                +gender.get(i)+" "
                                + age.get(i)
                );
            }
        }

        System.out.println("Для сортировки списка по возрасту введите sort и нажмите Enter");
        System.out.println("Для окончания работы программы введите любую букву и нажмите Enter");
        input = in.nextLine();

        if (input.equals("sort")){
            System.out.println("Сортировка");
            Collections.sort(id, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return age.get(o1)- age.get(o2);
                }
            });
            id.forEach(n -> System.out.println(id.get(n)+" "
                                +surname.get(n)+" "
                                +name.get(n).charAt(0)+". "
                               +patronymic.get(n).charAt(0)+". "
                                +gender.get(n)+" "
                                + age.get(n)));
        }

        if (!input.equals("sort")){
            System.out.println("Всего доброго!");
        }
    }
}
