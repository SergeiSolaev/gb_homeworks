// Задайте одномерный массив из 123 случайных чисел [0: 1000].
// Найдите количество элементов массива, значения которых лежат в отрезке [10,99].

// Пример для массива из 5, а не 123 элементов. В своём решении сделайте для 123

// [5, 18, 123, 6, 2] -> 1

// [1, 2, 3, 6, 2]-> 0

// [10, 11, 12, 13, 14]-> 5

Console.Clear();

int[] array = GetArray(123, 0, 1000);
int result = FindElements(array);

Console.WriteLine(String.Join(" ", array)); // Посмотрим заданный массив
Console.WriteLine(); // Пустая строка
Console.WriteLine($"Количество элементов в диапазоне [10,99] -> {result}"); // Выводим количество найденных элементов в консоль

int[] GetArray(int size, int minValue, int maxValue) // Задаем массив

{
    int[] res = new int[size];
    for(int i = 0; i < size; i++ )
    {
        res[i] = new Random().Next(minValue, maxValue+1);
    }
    return res;
}

int FindElements(int[] arr) // Поиск элементов в отрезке [10,99]

{   
    int res = 0;
    foreach (var item in arr)
    {
        res += item > 9 && item < 100 ? 1 : 0;
    }
    // for (int i = 0; i < arr.Length; i++)
    // {
    //     if(arr[i] > 9 && arr[i] < 100)
    //     res += 1;
    // }
    return res;
}

