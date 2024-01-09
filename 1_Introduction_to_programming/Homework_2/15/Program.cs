// Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
// 6 -> да 
// 7 -> да 
// 1 -> нет

Console.Clear();
Console.Write(" Enter number day of week: ");
int numberDayOfWeek = int.Parse(Console.ReadLine());

string a = " Yes";
string b = " No";

if (numberDayOfWeek < 1 || numberDayOfWeek > 7)
{
    Console.Write(" Wrong number");
    return;
}

if (numberDayOfWeek == 6 || numberDayOfWeek ==7)
{
    Console.WriteLine(a);
} 

else 
{
    Console.WriteLine(b);
}