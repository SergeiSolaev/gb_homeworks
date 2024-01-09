// Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, 
//            и возвращает значение этого элемента или же указание, что такого элемента нет.

// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 17 -> такого числа в массиве нет

using System;
using static System.Console;

int[,] GetArray() // Пользователь вводит массив с клавиатуры
{
    WriteLine("Введите количество строк двумерного массива: "); 
    int rows = int.Parse(ReadLine());

    WriteLine("Введите количество столбоцв двумерного массива: ");
    int columns = int.Parse(ReadLine());
    
    int [,] numsArray = new int[rows,columns];

    for (int i = 0; i<rows; i++)
    {
        WriteLine($"Введите элементы {i+1}-й строки двумерного массива через пробел: ");
        string[] rowsArray = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);
        for (int j = 0; j < columns; j++)
        {
            numsArray[i,j] = int.Parse(rowsArray[j]);
        }
        
    }
    return numsArray;
}

void GetElement(int[,] baseArray) // Ищем элемент по позиции, которую вводит пользователь с клавиатуры 

{
    WriteLine("Введите номер строки элемента для поиска: "); 
    int row = int.Parse(ReadLine());

    WriteLine("Введите номер столбца элемента для поиска: ");
    int column = int.Parse(ReadLine());

    if(row > baseArray.GetLength(0) || column > baseArray.GetLength(1)) 
    {
        WriteLine("Элемента с такой позицией не существует");
    }
    else
    {
        WriteLine();
        WriteLine($" -> {baseArray[row-1,column-1]}");
    }
}

void PrintArray(int[,] inArray) // Метод для вывода массива в консоль
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

int[,] numsArray = GetArray();
Console.WriteLine();
PrintArray(numsArray);
GetElement(numsArray);