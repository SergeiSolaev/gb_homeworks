//  Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18

Console.Clear();
int[,] matrix1 = (GetArray(2, 2, 3, 4));
PrintArray(matrix1);
Console.WriteLine();
int[,] matrix2 = (GetArray(2, 2, 3, 4));
PrintArray(matrix2);
Console.WriteLine();
int [,] product = (GetProduct(matrix1, matrix2));
PrintArray(product);

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

void PrintArray(int[,] inArray) // Выводим в консоль массив

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

int [,] GetProduct(int[,] inArray1, int[,] inArray2) // Находим произведение двух матриц
{
    int[,] resultMatrix = new int[inArray1.GetLength(0), inArray1.GetLength(1)];    
    for (int i = 0; i < resultMatrix.GetLength(0); i++)
    {
        for (int j = 0; j < resultMatrix.GetLength(1); j++)
        {
            int sum = 0;
            for (int k = 0; k < inArray1.GetLength(1); k++)
            {
                sum += inArray1[i,k] * inArray2[k,j];
            }
            resultMatrix[i,j] = sum;
        }
    }
    return resultMatrix;
}