# Определить индексы элементов массива (списка),
# значения которых принадлежат заданному диапазону
# (т.е. не меньше заданного минимума и не больше заданного максимума)

# Input:
# 1, 3, 7, 10, 5, 8
# 4
# 8
# Output:
# 2(7), 4(5), 5(8)

list = list(map(int, input(('Введите элементы списка через пробел: ')).split()))
start = int(input(('Введите начало диапазона: ')))
end = int(input(('Введите конец диапазона: ')))
result = []
result2 = []
for i in range(len(list)):
    if list[i] >= start and list[i] <= end:
        result.append(i)
        result2.append(list[i])

for i in range(len(result)):
    print(result[i], end='')
    print(f"({result2[i]})", end=', ')
