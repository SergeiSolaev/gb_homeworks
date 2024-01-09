# В фермерском хозяйстве в Карелии выращивают чернику. Она растёт на круглой грядке, причём кусты высажены только по окружности. 
# Таким образом, у каждого куста есть ровно два соседних. Всего на грядке растёт N кустов.
# Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них выросло различное число ягод — на i-ом кусте выросло ai ягод.
# В этом фермерском хозяйстве внедрена система автоматического сбора черники. 
# Эта система состоит из управляющего модуля и нескольких собирающих модулей. 
# Собирающий модуль за один заход, находясь непосредственно перед некоторым кустом, собирает ягоды с этого куста и с двух соседних с ним.
# Напишите программу для нахождения максимального числа ягод, 
# которое может собрать за один заход собирающий модуль, находясь перед некоторым кустом заданной во входном файле грядки.

listBerry = input(("Введите количество ягод на каждом кусте, через пробел:")).split()

sumBerry = list()

maxBerry = []

for i in range(len(listBerry) -1):
    sumBerry.append(listBerry [i-1] + listBerry[i] + listBerry [i+1]) 
sumBerry.append(listBerry [-2] + listBerry[-1] + listBerry [0]) 

for i in range(len(sumBerry)):
    a = int(sumBerry[i]) % 10
    b = (int(sumBerry[i]) % 100 - a) // 10
    c = int(sumBerry[i]) // 100
    maxBerry.append(a + b + c) 

print(max(maxBerry))