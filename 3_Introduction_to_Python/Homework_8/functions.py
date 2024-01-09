# Задача 38: Доработать метод search с семинара так,
# чтобы выводились все найденные совпадения.
# Если нашлось несколько совпадений - запросить уточнение поиска
# и найти вариант среди полученного списка.

def show_data() -> None:
    """Выводит информацию из справочника"""
    with open('book.txt', 'r', encoding='utf-8') as file:
        print(file.read())


def add_data() -> None:
    """Добавляет информацию в справочник."""
    fio = input('Введите ФИО: ')
    phone = input('Введите номер телефона: ')
    with open('book.txt', 'a', encoding='utf-8') as file:
        file.write(f'\n{fio} | {phone}')


def find_data() -> None:
    """Печатает результат поиска по справочнику."""
    with open('book.txt', 'r', encoding='utf-8') as file:
        data = file.read()
    # print(data)
    data_to_find = input('Введите данные для поиска: ')
    print(search(data, data_to_find))


def search(book: str, info: str) -> str:
    """Находит в списке записи по определенному критерию поиска"""
    book = book.split('\n')
    count = 0
    res = []
    for contact in book:
        if info in contact:
            res.append(contact)
            count = count + 1
    res_str = '\n'.join(map(str, res))

    if count > 1:
        print(res_str)
        search2 = input('Введите уточнение для поиска: ')
        for contact2 in res:
            if search2 in contact2:
                return contact2
        else:
            return 'Совпадений не найдено'
    if count == 1:
        print(res_str)

    else:
        return 'Совпадений не найдено'
