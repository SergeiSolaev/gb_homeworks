/*
    Цель: Разработать веб-приложение, которое каждый день будет отображать новое случайное изображение из коллекции Unsplash, давая пользователю возможность узнать больше о фотографе и сделать "лайк" изображению.

    Регистрация на Unsplash:

    • Перейдите на веб-сайт Unsplash (https://unsplash.com/).
    • Зарегистрируйтесь или войдите в свой аккаунт. (если у вас не было регистрации до этого, новый аккаунт создавать не нужно).

    Создание приложения:

    • Перейдите на страницу разработчика Unsplash (https://unsplash.com/developers).
    • Нажмите "New Application".
    • Заполните необходимую информацию о приложении (можете использовать http://localhost для тестирования).
    • Получите свой API-ключ после создания приложения.

    Разработка веб-приложения:

    • Создайте HTML-страницу с элементами: изображение, имя фотографа, кнопка "лайк" и счетчик лайков.
    • Используя JavaScript и ваш API-ключ, получите случайное изображение из Unsplash каждый раз, когда пользователь загружает страницу.
    • Отобразите информацию о фотографе под изображением.
    • Реализуйте функционал "лайка". Каждый раз, когда пользователь нажимает кнопку "лайк", счетчик должен увеличиваться на единицу.

    * Дополнительные задачи (по желанию):

    • Добавьте функцию сохранения количества лайков в локальное хранилище, чтобы при новой загрузке страницы счетчик не сбрасывался.
    • Реализуйте возможность просмотра предыдущих "фото дня" с сохранением их в истории просмотров.
*/


const accecKey = 'your-access-key-here'




const photo = document.querySelector('.photo')
const likesCount = document.querySelector('.likes-count')
const authorName = document.querySelector('.author-name')
const likeBtn = document.querySelector('.like-btn')

getRandomPhoto()
//обработка промиса от функции getRandomPhoto
    .then(data => {
        // добавляем ссылку на фотографию
        photo.src = data.urls.small
        // добавляем описание фотографии
        photo.alt = data.alt_description
        // добавляем количество лайков фотографии
        likesCount.textContent = data.likes
        // добавляем имя автора фотографии
        authorName.textContent = `Фотограф: ${data.user.name}`
    })

increaseLikes()

// получение случайной фотографии и её отображение на странице.
// асинхронная функция возвращает промис
async function getRandomPhoto() {
    try {
        const response = await fetch(`https://api.unsplash.com/photos/random?client_id=${accecKey}`)
        const data = await response.json()
        return data
    } catch (error) {
        console.error('Ошибка при загрузке фотографий:', error);
        return {};
    }
}

// Функция увеличения счетчика лайков
function increaseLikes() {
    likeBtn.addEventListener('click', () => {
        likesCount.textContent = Number(likesCount.textContent) + 1
    })
}


