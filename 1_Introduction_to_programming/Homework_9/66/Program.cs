// Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30
using System;
using static System.Console;

Write("Введите число m: ");
int m = Convert.ToInt32(Console.ReadLine());
Write("Введите число n: ");
int n = Convert.ToInt32(Console.ReadLine());
int result = GetSumBetweenNandM(m, n);
WriteLine($" -> {result}"); 

int GetSumBetweenNandM(int m, int n)
{
    if (n > m)
    return n + GetSumBetweenNandM(m, n - 1);
            
    return m;
}