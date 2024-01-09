// Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
// 456 -> 5
// 782 -> 8 
// 918 -> 1

Console.Clear();
Console.Write(" Enter three-digit number : ");
int number = int.Parse(Console.ReadLine());
string s = number.ToString();

if (number < 100 || number > 999)
{
    Console.WriteLine("Wrong number");
}

else 
{
Console.WriteLine(s[1]);
} 