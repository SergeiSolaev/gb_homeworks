def sort_list_imperative(numbers):
    n = len(numbers)
    for i in range (n):
        for j in range(i+1, n):
            if numbers[i] < numbers[j]:
                numbers[i], numbers[j] = numbers[j], numbers[i] 
                
    return numbers

print(sort_list_imperative([4,5,6,78,4,3,46,74])) 



def sort_list_declarative(numbers):
    numbers.sort(reverse=True)
    return numbers

print(sort_list_declarative([3,4,5,7,8,34,2,4,5]))