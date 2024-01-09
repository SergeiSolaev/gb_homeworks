// Напишите программу, которая на вход принимает число и выдает, является ли число четным 
// (делится ли оно на два без остатка).
Console.Clear();
Console.WriteLine(" Введите число: ");

int number = int.Parse(Console.ReadLine());

int check = number % 2;

if (check == 0) {
    Console.WriteLine($"Число {number} чётное");
}

else {
    Console.WriteLine($"Число {number} нечётное");
}
