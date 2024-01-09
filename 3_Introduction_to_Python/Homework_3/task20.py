# В настольной игре Скрабл (Scrabble) каждая буква имеет определенную ценность. 
# В случае с английским алфавитом очки распределяются так:
# A, E, I, O, U, L, N, S, T, R – 1 очко; D, G – 2 очка; B, C, M, P – 3 очка; 
# F, H, V, W, Y – 4 очка; 
# K – 5 очков; J, X – 8 очков; Q, Z – 10 очков. 
# А русские буквы оцениваются так: А, В, Е, И, Н, О, Р, С, Т – 1 очко; 
# Д, К, Л, М, П, У – 2 очка; 
# Б, Г, Ё, Ь, Я – 3 очка; Й, Ы – 4 очка; Ж, З, Х, Ц, Ч – 5 очков; 
# Ш, Э, Ю – 8 очков; Ф, Щ, Ъ – 10 очков. 
# Напишите программу, которая вычисляет стоимость введенного 
# пользователем слова. 
# Будем считать, что на вход подается только одно слово, 
# которое содержит либо только английские, 
# либо только русские буквы.

# *Пример:*

# ноутбук
#     12
w = input(("Введите ваше слово:")) ##.upper() переводит все введённые буквы в заглавные, чтобы не перегружать список(словарь)

word = list(w)

listEnOneScore = ['A', 'E' , 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R', 'А', 'В', 'Е', 'И', 'Н', 'О', 'Р', 'С', 'Т',
                  'a', 'e','i', 'o', 'u', 'l', 'n', 's', 't', 'r','а', 'в', 'е', 'и', 'н', 'о', 'р', 'с', 'т']
listEnTwoScore = ['D', 'G', 'Д', 'К', 'Л', 'М', 'П', 'У',
                  'd', 'g' , 'д', 'к', 'л', 'м', 'п', 'у']
listEnThreScore = ['B', 'C', 'M', 'P' , 'Б', 'Г', 'Ё', 'Ь', 'Я',
                   'b', 'c', 'm', 'p',  'б', 'г', 'ё', 'ь', 'я']
listEnFourScore = ['F', 'H', 'V', 'W', 'Y', 'Й', 'Ы',
                   'f', 'h', 'v', 'w', 'y', 'й', 'ы']
listEnFiveScore = ['K', 'Ж', 'З', 'Х', 'Ц', 'Ч',
                   'k', 'ж', 'з', 'х', 'ц', 'ч']
listEnEightScore = ['X', 'Ш', 'Э', 'Ю'
                    'x', 'ш', 'э', 'ю']
listEnTenScore = ['Q', 'Z', 'Ф', 'Щ', 'Ъ'
                  'q', 'z', 'ф', 'щ', 'ъ']

print(w)

sumOneScore = 0
sumTwoScore = 0
sumThreScore = 0
sumFourScore = 0
sumFiveScore = 0
sumEightScore = 0
sumTenScore = 0

sum = 0

for i in range(len(word)):
    for j in range(len(listEnOneScore)):
        if word[i] == listEnOneScore[j]:
            sumOneScore = sumOneScore + 1


for i in range(len(word)):
    for j in range(len(listEnTwoScore)):
        if word[i] == listEnTwoScore[j]:
            sumTwoScore = sumTwoScore + 2

for i in range(len(word)):
    for j in range(len(listEnThreScore)):
        if word[i] == listEnThreScore[j]:
            sumThreScore = sumThreScore + 3

for i in range(len(word)):
    for j in range(len(listEnFourScore)):
        if word[i] == listEnFourScore[j]:
            sumFourScore = sumFourScore + 4

for i in range(len(word)):
    for j in range(len(listEnFiveScore)):
        if word[i] == listEnFiveScore[j]:
            sumFiveScore = sumFiveScore + 5

for i in range(len(word)):
    for j in range(len(listEnEightScore)):
        if word[i] == listEnEightScore[j]:
            sumEightScore = sumEightScore + 8

for i in range(len(word)):
    for j in range(len(listEnTenScore)):
        if word[i] == listEnTenScore[j]:
            sumTenScore = sumTenScore + 10

sum = (sumOneScore + sumTwoScore + sumThreScore + sumFourScore + sumFiveScore
        + sumEightScore + sumTenScore)
print(sum)
