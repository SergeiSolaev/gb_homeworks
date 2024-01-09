//  Задайте одномерный массив,
// заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

// [3, 7, 23, 12] -> 19

// [-4, -6, 89, 6] -> 0

Console.Clear();
int[] array = GetArray(5, 0, 10); // Задаём массив случайных чисел
int sum = GetSum(array); 
Console.WriteLine(String.Join(" ", array)); // Выводим массив в консоль
Console.WriteLine($"Сумма элементов стоящих на нечётных позициях -> {sum}");    // Выводим сумму элементов массива 
                                                                                //стоящих на нечётных позициях
int[] GetArray(int size, int minValue, int maxValue) // Метод для создания массива случайных чисел
{
    int[] res = new int[size];
    for (int i = 0; i < res.Length; i++)
    {
        res[i] = new Random().Next(minValue, maxValue+1);
    } 
    return res;
}

int GetSum(int[] numberarr) // Метод для подсчёта суммы элементов массива стоящих на нечётных позициях
{
    int res = 0;
    for (int i = 0; i < numberarr.Length; i++)
    {
        res += (i%2) == 0 ? numberarr[i] : 0;
    }

    return res;
}