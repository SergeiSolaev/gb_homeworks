# Задача 6: Вы пользуетесь общественным транспортом? 
# Вероятно, вы расплачивались за проезд и получали билет с номером. 
# Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр равна сумме последних трех. 
# Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6. 
# Вам требуется написать программу, которая проверяет счастливость билета.

# *Пример:*

# 385916 -> yes
# 123456 -> no
#     001001 -> yes


ticketNumber = int (input(("Введите номер своего билета: ")))
rightNumber = ticketNumber % 1000
leftNumber = (ticketNumber - rightNumber) // 1000

rightNumberA = rightNumber % 10
rightNumberB = (rightNumber % 100 - rightNumberA) // 10
rightNumberC = rightNumber // 100
sumRightNumber = rightNumberA + rightNumberB + rightNumberC

leftNumberA = leftNumber % 10
leftNumberB = (leftNumber % 100 - leftNumberA) // 10
leftNumberC = leftNumber // 100
sumLeftNumber = leftNumberA + leftNumberB + leftNumberC

if sumLeftNumber == sumRightNumber:
    print("yes")

else:
    print("no")