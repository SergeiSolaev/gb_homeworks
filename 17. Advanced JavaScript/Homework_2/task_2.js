/*
Задание 2
    Вы разрабатываете систему отзывов для вашего веб-сайта. Пользователи могут оставлять отзывы, но чтобы исключить слишком короткие или слишком длинные сообщения, вы решаете установить некоторые ограничения.

    Создайте HTML-структуру с текстовым полем для ввода отзыва, кнопкой для отправки и контейнером, где будут отображаться отзывы.

    Напишите функцию, которая будет добавлять отзыв в контейнер с отзывами. Однако если длина введенного отзыва менее 50 или более 500 символов, функция должна генерировать исключение.

    При добавлении отзыва, он должен отображаться на странице под предыдущими отзывами, а не заменять их.
*/

//Массив для начальной загрузки данных.
const productRewievs = [
    {
        product: "Apple iPhone 13",
        reviews: [
            {
                id: "1",
                text: "Отличный телефон! Батарея держится долго.",
            },
            {
                id: "2",
                text: "Камера супер, фото выглядят просто потрясающе.",
            },
        ],
    },
    {
        product: "Samsung Galaxy Z Fold 3",
        reviews: [
            {
                id: "3",
                text: "Интересный дизайн, но дорогой.",
            },
        ],
    },
    {
        product: "Sony PlayStation 5",
        reviews: [
            {
                id: "4",
                text: "Люблю играть на PS5, графика на высоте.",
            },
        ],
    },
];

// переменная для получения данных с формы отзыва
const clientForm = document.getElementById('clientForm');

// метод добавляет отзыв в базу данных
function addReview(event) {

    // данный блок собирает данные со страницы и формирует отзыв
    event.preventDefault();
    const productRewievId = productRewievs.length + 2;
    const productName = clientForm.querySelector('[id="productName"]').value;
    const reviewText = clientForm.querySelector('[id="reviewText"]').value;
    const productRewiev = {
        product: productName,
        reviews: [
            {
                id: productRewievId,
                text: reviewText
            }
        ]
    }

    // данный блок проверяет длину текста отзыва
    try {
        if (reviewText.length > 50 && reviewText.length < 500) {
            // если проверка пройдена, то добавляем отзыв в массив
            productRewievs.push(productRewiev);
        }
        // в противном случае генерируем исключение... 
        else throw error = new Error('Отзыв слишком короткий или слишком длинный! Длина отзыва должна быть от 50 до 500 символов.')
    } catch (error) {
        // ...и выводим ошибку на страницу
        alert('Ошибка: ' + error.message);
    }

    // данный блок выводит отзывы на страницу
    const rewievHtml = productRewievs.map((item) => `<div class="productName">${item.product}</div><div class="textRewiev">${item.reviews[0].text}</div>`).join('');
    document.querySelector('div').innerHTML = rewievHtml;
}

// первоначально выводим отзывы на страницу
const rewievHtml = productRewievs.map((item) => `<div class="productName">${item.product}</div><div class="textRewiev">${item.reviews[0].text}</div>`).join('');
document.querySelector('div').innerHTML = rewievHtml;

// слушаем нажатие кнопки, при нажатии кнопки "Отправить отзыв" запускается функция addRewiev
clientForm.addEventListener('submit', addReview);
