// Напишите программу, которая принимает на вход 
//три числа и выдает максимальное из этих чисел.
Console.Clear();
Console.Write(" Введите первое число: ");
int number1 = int.Parse(Console.ReadLine());

Console.Write(" Введите второе число: ");
int number2 = int.Parse(Console.ReadLine());

Console.Write(" Введите третье число: ");
int number3 = int.Parse(Console.ReadLine());

int max = number1;

    if (number1 == number2 && number1 == number3 && number3 == number2) {                     //в условии задачи этого нет, 
       Console.WriteLine(" Все числа равны");                                                 //но я добавил данную проверку.
       return;                                                                                

    } 

    if (number2 > max) {
        max = number2; 
    }
    
    if (number3 > max) {
        max = number3;
    }
Console.WriteLine($"max {max}");