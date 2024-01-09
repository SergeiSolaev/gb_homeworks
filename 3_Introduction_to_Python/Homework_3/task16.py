# Требуется вычислить, сколько раз встречается некоторое число X в массиве A[1..N]. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     3
#     -> 1

import random

n = int(input("Введите колличество элементов в списке: "))
x = int(input("Введите x: "))
result = 0
flag = 1

print(n, end= '\n')

list1 = list()

for i in range(n):
    list1.append(i+1)
    # list1.append(random.randint(1, n)) # список заполняется рандомно
    print(list1[i], end = " ")


print(end='\n')

print(x, end= '\n')

for i in range(n):
    if list1[i] == x:
        result = result + 1

if result > 0:
    print(f"-> {result}")
else:
    print("Такого числа нет в списке")

# или
print(f'{x} find in list {list1.count(x)} times' )