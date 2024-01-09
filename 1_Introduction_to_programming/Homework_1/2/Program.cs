// Задача 2: Напишите программу, которая на вход принимает 
//           два числа и выдает, какое число большее, а какое меньшее.
Console.Clear();
Console.Write(" Введите первое число: ");
int number1 = int.Parse(Console.ReadLine());

Console.Write(" Введите второе число: ");
int number2 = int.Parse(Console.ReadLine());

if (number1 == number2) {                                                             //в условии задачи этого нет, 
    Console.WriteLine(" Числа равны");                                                //но я добавил данную проверку.
    return;                                            
}

if(number1 > number2) {
    Console.WriteLine($" {number1} больше {number2}, {number2} меньше {number1}");
}
if(number1 < number2) {
    Console.WriteLine($" {number2} больше {number1}, {number1} меньше {number2}");
}
