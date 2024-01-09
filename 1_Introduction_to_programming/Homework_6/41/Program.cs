// Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// 1, -7, 567, 89, 223-> 3

Console.Clear();
Console.Write("Введите числа через пробел: ");

string[] numbers = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);
Console.Write(String.Join(" ", numbers));
Console.WriteLine($" -> {Result(numbers)}");


int Result(string[] nums)
{
    int res =0;
    for (int i = 0; i < nums.Length; i++)
    {
        int a = int.Parse(nums[i]);
        if(a > 0 || a < 0) res++;
    }
    return res;
}
