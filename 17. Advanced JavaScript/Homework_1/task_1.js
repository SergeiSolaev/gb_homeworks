/*
Задание 1
    • Используя Symbol.iterator, создайте объект "Музыкальная коллекция", который можно итерировать. Каждая итерация должна возвращать следующий альбом из коллекции.

    • Создайте объект musicCollection, который содержит массив альбомов и имеет свойство-символ Symbol.iterator. Каждый альбом имеет следующую структуру:

    {
        title: "Название альбома",
        artist: "Исполнитель",
        year: "Год выпуска"
    }

    • Реализуйте кастомный итератор для объекта musicCollection. Итератор должен перебирать альбомы по порядку.
    • Используйте цикл for...of для перебора альбомов в музыкальной коллекции и вывода их на консоль в формате: Название альбома - Исполнитель (Год выпуска)
*/

const musicCollection = [
    {
        title: "Название альбома1",
        artist: "Исполнитель",
        year: "Год выпуска"
    },
    {
        title: "Название альбома2",
        artist: "Исполнитель",
        year: "Год выпуска"
    },
    {
        title: "Название альбома3",
        artist: "Исполнитель",
        year: "Год выпуска"
    }

]

musicCollection[Symbol.iterator]  = function() {
    return {
        current: 0,
        last: this.length,
        next() {
            if (this.current <= this.last) {
                return {done: false, value: musicCollection[this.current++]}
            } else {
                return {done:true}
            }
        }
    }
}

for (const album of musicCollection) {
    console.log(`${album.title} - ${album.artist} (${album.year})`);
}
