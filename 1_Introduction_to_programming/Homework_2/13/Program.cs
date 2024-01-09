// Напишите программу, которая выводит третью цифру заданного числа или сообщает, 
// что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6

Console.Clear();
Console.Write(" Enter number : ");
int number = int.Parse(Console.ReadLine());
string s = number.ToString();
int index = 1;

if (s.Length < 3)
{
    Console.WriteLine("No third digit");
}

else 
{
Console.WriteLine(s[2]);
} 