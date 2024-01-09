// Сформируйте трёхмерный массив из неповторяющихся двузначных чисел.
//  Напишите программу, которая будет построчно выводить массив, добавляя индексы 
//  каждого элемента.
// массив размером 2 x 2 x 2
// int[,,]
// 12(0,0,0) 22(0,0,1)
// 45(1,0,0) 53(1,0,1)

Console.Clear();
int[,,] baseArray = new int[2, 1, 2];
CreateArray(baseArray);
PrintArray(baseArray);

void CreateArray(int[,,] inArray) // Создаём массив
{
    int[] temp = new int[inArray.GetLength(0) * inArray.GetLength(1) * inArray.GetLength(2)];
    int  number;
    for (int i = 0; i < temp.GetLength(0); i++)
    {
        temp[i] = new Random().Next(10, 100);
        number = temp[i];
        if (i >= 1)
        {
            for (int j = 0; j < i; j++)
            {
                while (temp[i] == temp[j])
                {
                    temp[i] = new Random().Next(10, 100);
                    j = 0;
                    number = temp[i];
                }
                number = temp[i];
            }
        }
    }
    int count = 0; 
    for (int x = 0; x < inArray.GetLength(0); x++)
    {
        for (int y = 0; y < inArray.GetLength(1); y++)
        {
            for (int z = 0; z < inArray.GetLength(2); z++)
            {
                inArray[x, y, z] = temp[count];
                count++;
            }
        }
    }
}

void PrintArray(int[,,] inArray) // Выводим в консоль массив

{
    for (int l = 0; l < inArray.GetLength(0); l++)
    {
        for (int i = 0; i < inArray.GetLength(1); i++)
        {
            for (int j = 0; j < inArray.GetLength(2); j++)
            {
                Console.Write($"{inArray[l, i, j]} ({l}, {i}, {j}) ");
            }
            Console.WriteLine();
        }
    }
}