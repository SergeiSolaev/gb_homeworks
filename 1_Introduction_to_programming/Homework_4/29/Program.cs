// Напишите программу, которая задаёт массив
// из 8 элементов и выводит их на экран.
// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 6, 1, 33 -> [6, 1, 33]

Console.Clear();
Console.WriteLine("Введите число начала диапазона массива: ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Введите число конца диапазона массива: ");
int b = int.Parse(Console.ReadLine());
int [] array = GetBinArray(a, b);
Console.Write($"[{String.Join(" , ", array)}]");


int [] GetBinArray(int start, int finish)
{
    int[] arr = new int [8];
    int i = 0;
    while(i < 8) 
    {
        arr[i] = new Random().Next(start, finish);
        i++;
    }
    return arr;
}