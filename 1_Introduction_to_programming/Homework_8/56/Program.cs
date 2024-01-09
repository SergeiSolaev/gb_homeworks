// Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

// Например, задан массив:

// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7

// Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

Console.Clear();
int[,] baseArray = (GetArray(4, 2, 0, 10));
PrintArray(baseArray);
int[] sumArray = GetSum(baseArray);
int min = GetMin(sumArray);
GetNumberString(min,sumArray);



int[,] GetArray(int m, int n, int minValue, int maxValue) // Создаём базовый массив случайных чисел
{
    int[,] result = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return result;
}

void PrintArray(int[,] inArray) // Выводим в консоль базовый массив

{
    for (int i = 0; i < inArray.GetLength(0); i++)
    {
        for (int j = 0; j < inArray.GetLength(1); j++)
        {
            Console.Write($"{inArray[i, j]} ");
        }
        Console.WriteLine();
    }
}

int[] GetSum(int[,] inArray) // Записываем в новый одномерный массив значения суммы каждой строки 
{
    int[] sumArr = new int[inArray.GetLength(0)];
 
    for (int i = 0; i < inArray.GetLength(0); i++)
    {
        int sum = 0;
        for (int j = 0; j < inArray.GetLength(1); j++)
        {
            sum = sum +inArray[i,j];
        }
        sumArr[i] = sum;
    }
    return sumArr;
   
}

int GetMin(int[] inArray) // Ищем минимальное значение суммы 
{
    int min = inArray[0];
    for (int i = 0; i < inArray.Length; i++)
    {
        if(inArray[i] < min) min = inArray[i];
    }
    return min;
}

void GetNumberString(int max, int [] inArray) // Находим номер строки базового массива с наибольшей суммой и выводим его в консоль
{
    int numberString = 0;
    for (int i = 0; i < inArray.Length; i++)
    {
        if(inArray[i] == max) 
        {
            numberString = i+1;
        }
    }
    Console.WriteLine($"{numberString} строка, сумма элементов строки {max}");
    
}