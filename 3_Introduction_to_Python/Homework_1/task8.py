# Задача 8: Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, 
# если разрешается сделать один разлом по прямой между дольками 
# (то есть разломить шоколадку на два прямоугольника).

# *Пример:*

# 3 2 4 -> yes
# 3 2 1 -> no

sliceWidth = int (input(("Ввведите количеатво долек по ширине: ")))
sliceLenght = int (input(("Введите количество долек по длине: ")))
sliceWant = int (input(("Скольок долек вы хотите отломить?: ")))

sliceTotal = sliceWidth * sliceLenght 
if sliceWant < sliceTotal and  (sliceWant % sliceWidth == 0 or sliceWant % sliceLenght ==0):
    print ("yes")
else:
    print ("no")




 