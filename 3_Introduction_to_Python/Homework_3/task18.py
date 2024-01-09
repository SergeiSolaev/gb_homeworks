# Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     6
#     -> 5

n = int(input("Введите колличество элементов в списке: "))
x = int(input("Введите x: "))

print(n, end= '\n')

list1 = list()

for i in range(n):
    list1.append(i+1)
    print(list1[i], end = " ")

print(end= '\n')
print(x, end= '\n')

eps = x
result = list1[0]
for i in list1:
    if abs(i - x) < eps:
        eps = abs(i - x)
        result = i
print(f"-> {result}")

# решение преподавателя
from random import randint
len_nums = int(input('Enter list length: '))
nums = [randint(1, 100) for i in range(len_nums)]
print("List: ", *nums)
x = int(input('Enter x: '))

# easy
min_diff = nums[0]
for i in nums:
    diff_current = abs(i-x)
    if diff_current < min_diff:
     res = i
     min_diff = diff_current

res = min([i for i in nums if abs(i-x) == min_diff])
print(f'Result is {res}')

# pro

print(f'Result is {min(nums, key=lambda y: abs(y-x))}')

 




    



        



