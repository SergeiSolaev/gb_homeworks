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

// метод для вывода отзывов на страницу
function updateRewiev() {
    const rewievHtml = productRewievs.map(function (item) {

        // если на один продукт больше одного отзыва, то отзывы на этот продукт выводим под одним заголовком
        if (item.reviews.length > 1) {
            return `<div class="productName">${item.product}${item.reviews.map((elem) => `</div><div class="textRewiev">Отзыв: ${elem.text}</div>`).join('')}`
        } else {
            // если на один продукт один отзыв
            return `<div class="productName">${item.product}</div><div class="textRewiev">Отзыв: ${item.reviews[0].text}</div>`;
        }
    }).join('')

    document.querySelector('[class="rewievs"').innerHTML = rewievHtml;
}

// метод добавляет отзыв в массив с отзывами
function addReview(event) {

    // данный блок собирает данные со страницы и формирует отзыв
    event.preventDefault();
    const productRewievIdInt = parseInt(productRewievs[productRewievs.length - 1].reviews[productRewievs[productRewievs.length - 1].reviews.length - 1].id) + 1;
    const productRewievId = productRewievIdInt.toString();
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
                        
            // далее проверка на то, существует ли отзыв на данный продукт
            let rewiewsAdded = false;
            productRewievs.forEach(element => {
                if (element.product === productName) {
                    element.reviews.push(productRewiev.reviews[0]); // добавляем отзыв
                    rewiewsAdded = true;
                }
            });

            // или не существует отзыв на данный продукт
            if (!rewiewsAdded) {
                productRewievs.push(productRewiev); // добавляем отзыв
            }
        }
        // в противном случае генерируем исключение... 
        else throw error = new Error('Отзыв слишком короткий или слишком длинный! Длина отзыва должна быть от 50 до 500 символов.')
    } catch (error) {
        // ...и выводим ошибку на страницу
        alert('Ошибка: ' + error.message);
    }

    // выводим отзывы на страницу
    updateRewiev();
}

// первоначально выводим отзывы на страницу
updateRewiev();
// слушаем нажатие кнопки, при нажатии кнопки "Отправить отзыв" запускается функция addRewiev
clientForm.addEventListener('submit', addReview);
