// Напишите цикл, который принимает на вход
// два числа (A и B) и возводит число A в натуральную
// степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16

Console.Clear();
Console.WriteLine("Введите число А ");
int a = int.Parse(Console.ReadLine());
Console.WriteLine("Введите число B ");
int b = int.Parse(Console.ReadLine());

Console.WriteLine(DegreeOfNumber(a,b));

int DegreeOfNumber(int number, int degree)
{
    int n = 1;
    for (int i = 1; i <= degree; i++)
    {
        n = n * number;   
    }
    return n;
}