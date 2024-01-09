 
// Задача 23: Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 4, 9. 
// 5 -> 1, 8, 27, 64, 125

Console.Clear();
Console.WriteLine("Enter number: ");
int num = int.Parse(Console.ReadLine());

int count = 1;
int n = 1;
double cube = 0;

while (num >= count){
    cube = Math.Pow(n, 3);
    Console.Write($" {cube},");
    n++;
    count++;
}