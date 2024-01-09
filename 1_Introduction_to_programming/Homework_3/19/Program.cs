 
// Задача 19: Напишите программу, которая принимает 
// на вход пятизначное число и проверяет, является ли 
// оно палиндромом.
// 14212 -> нет
// 23432 -> да
// 12821 -> да


Console.Clear();
Console.WriteLine("Enter five-digit number") ;
string str = Console.ReadLine();
char[] num;
      
num = str.ToCharArray();
if (num.Length < 5 || num.Length >5){
    Console.WriteLine("Number is not five digit");
          return;
    }
      
if (num[0] == num[4] && num[1] == num[3]){
    Console.Write("Yes");

    }
      
else {
        Console.Write("No");
    } 