// Найдите произведение пар чисел в одномерном массиве.
// Парой считаем первый и последний элемент, второй и предпоследний и т.д.
// Результат запишите в новом массиве.

// [1 2 3 4 5] -> 5 8 3

// [6 7 3 6]-> 36 21

Console.Clear();
int[] array = GetArray(4, 1, 10); // Переменная для хранения базового массива
int[] product = GetProduct(array); // Переменная для хранения результата произведения
Console.WriteLine(String.Join(" ", array)); // Выводим в консоль базовый массив
Console.WriteLine(String.Join(" ", product)); // Выводим в консоль массив с результатом произведения

int[] GetArray(int size, int minValue, int maxValue)  // Функция для создания базового массива
{
    int[] res = new int[size];
    for(int i = 0; i < size; i++)
    {
        res[i] = new Random().Next(minValue, maxValue+1);
    }
    return res;
}

int[] GetProduct(int[] basearr) // Функция для вычисления произведения
{
    
    int first = 0;
    int last = 0;
    int product = 0;
    int j = 0;
    int i = 0;
    if(basearr.Length % 2 == 1)
    {
        int[] resarr =new int[basearr.Length/2 +1];
        for (i = 0; i < basearr.Length/2; i++)
        {
            for(int g = 0; g < basearr.Length/2 +1; g++)
            {
                resarr[resarr.Length -1] = basearr[g];
            }
        first = basearr[i];
        last = basearr[(basearr.Length-1) - i];
        product = first*last;
        resarr[j] = product;
        j++;
        }
        return resarr;
    }
    else
    {
        int[] resarr =new int[basearr.Length/2];
        for (i = 0; i < basearr.Length/2; i++)
        {
        first = basearr[i];
        last = basearr[(basearr.Length-1) - i];
        product = first*last;
        resarr[j] = product;
        j++;
        }
        return resarr;   
    }
}

// int[] ResultArray(int[] array)
// {
//     int size = (array.Length + 1)/ 2;
// //    if (array.Length % 2 == 1) size++;
//     int[] result = new int[size];
//     for (int i = 0; i < array.Length / 2; i++)
//     {
        
//         result[i] = array[i] * array[array.Length - 1 - i];
//     }
//     if (array.Length % 2 == 1) result[size-1] = array[array.Length / 2];
//     return result;
// }