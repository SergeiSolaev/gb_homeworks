/*
    Урок 2. События, формы
    Вашей задачей является создание веб-слайдера для отображения изображений на веб-странице. Слайдер должен позволять переключаться между изображениями и отображать их в центре экрана.

    1. Создайте интерфейс веб-страницы, который включает в себя следующие элементы:

    a. Контейнер для отображения текущего изображения.
    b. Кнопки "Предыдущее изображение" и "Следующее изображение" для переключения между изображениями.
    c. Навигационные точки (индикаторы) для быстрого переключения между изображениями.

    2. Используйте HTML для создания элементов интерфейса.

    3. Используйте JavaScript для обработки событий:

    a. При клике на кнопку "Предыдущее изображение" должно отображаться предыдущее изображение.
    b. При клике на кнопку "Следующее изображение" должно отображаться следующее изображение.
    c. При клике на навигационные точки, слайдер должен переключаться к соответствующему изображению.

    4. Слайдер должен циклически переключаться между изображениями, то есть после последнего изображения должно отображаться первое, и наоборот.

    5. Добавьте стилизацию для слайдера и элементов интерфейса с использованием CSS для улучшения внешнего вида.
*/

// адреса картинок
const fileList = [
    'img/1.jpg',
    'img/2.jpg',
    'img/3.jpg',
]

// картинка, кнопки, навигационные точки
const img = document.querySelector('.img');
const btnPrev = document.querySelector('.prev');
const btnNext = document.querySelector('.next');
const navBar = document.querySelector('.nav-bar');

// массив для навигационных точек
const navBarCircles = [];

// создаём навигационные точки
fileList.forEach((img, index) => {
    navBarCircles.push(`<div class="nav-circle" id="${index}"></div>`);
});

// добавляем навигационные точки на страницу
navBar.innerHTML = navBarCircles.join('');

// добавляем активную навигационную точку
navBar.firstElementChild.classList.add('active');

// добавляем картинку на страницу
img.src = fileList[0];
img.data = fileList[0];

// слушаем клик по навигационным точкам
navBar.addEventListener('click', (e) => {
    if (e.target.classList.contains('nav-circle')) {
        img.data = fileList[e.target.id];
        img.src = img.data;
        addFade(img);
        navBar.querySelectorAll('.nav-circle').forEach(el => {
            el.classList.remove('active');
            e.target.classList.add('active');
        })
    }
});

// слушаем клик по кнопке "Предыдущее изображение"
btnPrev.addEventListener('click', () => {
    if (img.data === fileList[0]) {
        img.data = fileList[fileList.length - 1]
        img.src = img.data;
    } else {
        img.data = fileList[fileList.indexOf(img.data) - 1];
        img.src = img.data;
    }
    addFade(img);
    navBar.querySelectorAll('.nav-circle').forEach(el => {
        el.classList.remove('active');
        navBar.querySelector(`#\\3${fileList.indexOf(img.data)}`).classList.add('active');
    })
})

// слушаем клик по кнопке "Следующее изображение"
btnNext.addEventListener('click', () => {
    if (img.data === fileList[fileList.length - 1]) {
        img.data = fileList[0];
        img.src = img.data;
    } else {
        img.data = fileList[fileList.indexOf(img.data) + 1];
        img.src = img.data;
    }
    addFade(img);
    navBar.querySelectorAll('.nav-circle').forEach(el => {
        el.classList.remove('active');
        navBar.querySelector(`#\\3${fileList.indexOf(img.data)}`).classList.add('active');
    })
})

// добавляем анимацию появления изображения
function addFade(img) {
    img.classList.add('fade');
    setTimeout(() => {
        img.classList.remove('fade');
    }, 1000);
}
