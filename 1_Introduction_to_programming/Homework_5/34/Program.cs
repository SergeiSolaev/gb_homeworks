// Задайте массив заполненный
// случайными положительными трёхзначными числами.
// Напишите программу, которая покажет количество чётных чисел в массиве.

// [345, 897, 568, 234] -> 2

Console.Clear(); 

int [] arrayOfNumbers = GetArray(10, 0, 30); // Задаём массив случайных чисел
int res = GetEvenNumber(arrayOfNumbers);  // Считаем колличество чётных чисел
Console.WriteLine(String.Join(" ", arrayOfNumbers)); // Выводим массив в консоль
Console.WriteLine($"Чётных чисел в массиве -> {res}"); // Выводим колличество чётных чисел в консоль

int[] GetArray( int size, int minValue, int maxValue) // Метод для создания массива случайных чисел
{
    int[] res = new int[size];
    for (int i = 0; i < res.Length; i++)
    {
        res[i] = new Random().Next(minValue, maxValue+1);
    }
    return res;
}

int GetEvenNumber(int[] numberarr) // Метод для подсчёта чётных чисел
{
    int res = 0;
    int i = 0;
    while (i < numberarr.Length)
    {
        res += (numberarr[i] % 2) == 0 ? 1 : 0;
        i++;
    }
    return res;
}