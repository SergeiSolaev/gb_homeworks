# Заполните массив элементами арифметической прогрессии.
# Её первый элемент, разность и количество элементов нужно ввести с клавиатуры.
# Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

# Input:
# 1
# 2
# 5
# Output:
# 1, 3, 5, 7, 9

start = int(input('Введите первый элемент списка: '))
difference = int(input('Введите разность: '))
amount = int(input('Введите количество элементов списка: '))

progresive = [start]
n = start

for i in range(amount - 1):
    progresive.append(n + difference)
    n = n + difference

print(progresive)
