// Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
Console.Clear();
Console.WriteLine(" Введите число: ");

int number = int.Parse(Console.ReadLine());
int i = 2;

while ( i <= number ) {
    if (number % 2 == 0) {
        Console.Write($" {i},");
        i = i + 2;
    }
    else {
        Console.Write($" {i},");
        i = i + 2;
    }
}