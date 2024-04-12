// Домашнее задание


// 1) Дан массив const arr = [1, 5, 7, 9] с помощью Math.min и spread оператора, найти минимальное число в массиве, решение задание должно состоять из одной строки

const arr = [1, 5, 7, 9]

console.log(Math.min(...arr));

// 2) Напишите функцию createCounter, которая создает счетчик и возвращает объект с двумя методами: increment и decrement. Метод increment должен увеличивать значение счетчика на 1, а метод decrement должен уменьшать значение счетчика на 1. Значение счетчика должно быть доступно только через методы объекта, а не напрямую.

function createCounter() {
    let counter = 0;
    return {
        increment: () => ++counter,
        decrement: () => --counter
    }
}

const counter = createCounter();

console.log(counter.increment());
console.log(counter.increment());
console.log(counter.increment());
console.log(counter.decrement());
console.log(counter.decrement());

// 3) Напишите рекурсивную функцию findElementByClass, которая принимает корневой элемент дерева DOM и название класса в качестве аргументов и возвращает первый найденный элемент с указанным классом в этом дереве.
// Пример
// const rootElement = document.getElementById('root');
// const targetElement = findElementByClass(rootElement, 'my-class');
// console.log(targetElement);

let searchElement = [];
function findElementByClass(rootEl, classEl) {
    if (rootEl.hasChildNodes()) {
        for (let element of rootEl.children) {
            if (element.className === classEl) {
                searchElement.push(element);
                if (searchElement[0].className !== classEl) {
                    searchElement = [];
                    searchElement.push(element);
                }
            }
            findElementByClass(element, classEl);
        }
    }
    return searchElement[0];
}

const rootElement = document.getElementById('root1');
const targetElement = findElementByClass(rootElement, 'div1.1');
console.log(targetElement);
