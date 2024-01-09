// Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

using System;

using static System.Console;

Clear();

Write("Введите количество строк массива: ");
int rows = int.Parse(ReadLine());

Write("Введите количество столбцов массива: ");
int columns = int.Parse(ReadLine());

int[,] array = GetArray(rows, columns, 0, 10);

double[] averageArray = GetAverage(array);

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

void PrintArray(int[,] inArray) // Выводим первоначальный массив в консоль

{
    for (int i = 0; i < inArray.GetLength(0); i++)
    {
        for (int j = 0; j < inArray.GetLength(1); j++)
        {
            Write($"{inArray[i, j]} ");
        }
        WriteLine();
    }
}

double[] GetAverage(int[,] baseArray) // Считаем среднее арифметическое столбцов
{
    double[] average = new double[baseArray.GetLength(1)];
    
    for (int j = 0; j < baseArray.GetLength(1); j++)
    {
        double sum = 0;
        for (int i = 0; i < baseArray.GetLength(0); i++)
        {
            sum = sum + baseArray[i,j];
        }
        average[j] = sum/baseArray.GetLength(0); 
    }
    return average;
}

void PrintArrayAverage(double[] inArray) // Выводим среднеарифмитический массив в консоль

{
    Write("Среднее арифметическое каждого столбца: ");
    for (int i = 0; i < inArray.GetLength(0); i++)
    {

        Write($"{inArray[i]:f1} ");
    }
}

PrintArray(array);
PrintArrayAverage(averageArray);