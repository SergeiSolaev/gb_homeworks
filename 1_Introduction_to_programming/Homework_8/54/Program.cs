// Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2

Console.Clear();
int[,] baseArray = (GetArray(4, 5, 0, 10));
PrintArray(baseArray);
SortArray(baseArray);
Console.WriteLine();
PrintArray(baseArray);

int[,] GetArray(int m, int n, int minValue, int maxValue)
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

void SortArray(int[,] inArray)
{
    for (int g = 0; g < inArray.GetLength(0); g++)
    {
        for (int i = 0; i < inArray.GetLength(1); i++)
        {
            for (int j = i + 1; j < inArray.GetLength(1); j++)
            {
                if (inArray[g,i] < inArray[g,j])
                {
                    int k = inArray[g,i];
                    inArray[g,i] = inArray[g,j];
                    inArray[g,j] = k;
                }
            }
        }
    }
}

void PrintArray(int[,] inArray)

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


