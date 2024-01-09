# Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2^k), не превосходящие числа N.

# Пример
# Ввод: 17 -> Вывод: 1, 2, 4, 8, 16

numbers = int(input("Введите ваше число: "))
degreeOfTwo = 0

while 2 ** degreeOfTwo <= numbers:
    print(2 ** degreeOfTwo)
    degreeOfTwo +=1
    
