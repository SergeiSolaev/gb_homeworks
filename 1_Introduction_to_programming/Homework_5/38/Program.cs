// Задайте массив вещественных чисел.
// Найдите разницу между максимальным и минимальным элементов массива.

// [3 7 22 2 78] -> 76

Console.Clear();
double [] array = GetArray(5, 23, 44);
double diff = GetDiff(array);
Console.WriteLine(String.Join(" ", array));
Console.WriteLine($"Разница между максимальным и минимальным элементом массива -> {diff:f3}");

double[] GetArray(int size, int minValue, int maxValue) // Метод для создания массива случайных чисел
{
    double[] res = new double[size];
    for (int i = 0; i < res.Length; i++)
    {
        res[i] = new Random().NextDouble() + new Random().Next(minValue, maxValue);
    } 
    return res;
}

double GetDiff(double[] arr) // Метод вычисления разницы между максимальным и минимальным элементом массива
{
    double diff = 0;
    double min = arr[0];
    double max = 0;

    for (int i = 0; i < arr.Length; i++)
    {
        min = min < arr[i] ? min : arr[i];
        max = max > arr[i] ? max : arr[i];
    }
    diff = max - min;
    return diff;
}