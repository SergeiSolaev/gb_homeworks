/*
    Вы разрабатываете веб-страницу для отображения расписания занятий в спортивном клубе. Каждое занятие имеет название, время проведения, максимальное количество участников и текущее количество записанных участников.

    1. Создайте веб-страницу с заголовком "Расписание занятий" и областью для отображения занятий.

    2. Загрузите информацию о занятиях из предоставленных JSON-данных. Каждое занятие должно отображаться на странице с указанием его названия, времени проведения, максимального количества участников и текущего количества записанных участников.

    3. Пользователь может нажать на кнопку "Записаться" для записи на занятие. Если максимальное количество участников уже достигнуто, кнопка "Записаться" становится неактивной.

    4. После успешной записи пользователя на занятие, обновите количество записанных участников и состояние кнопки "Записаться".

    5. Запись пользователя на занятие можно отменить путем нажатия на кнопку "Отменить запись". После отмены записи, обновите количество записанных участников и состояние кнопки.

    6. Все изменения (запись, отмена записи) должны сохраняться и отображаться в реальном времени на странице.

    7. При разработке используйте Bootstrap для стилизации элементов.
*/

// первичные данные в JSON формате
const scheduleData = JSON.parse('[{ "title": "Бокс", "startTime": "2024-05-16 11:30", "studentsNumbers": 5, "maxStudentsNumbers": 10 }, { "title": "Шахматы", "startTime": "2024-05-17 16:30", "studentsNumbers": 7, "maxStudentsNumbers": 10 }, { "title": "Плавание", "startTime": "2024-05-21 10:00", "studentsNumbers": 7, "maxStudentsNumbers": 10 }]')

// создаём HTML код 
const lessons = scheduleData.map(createLesson).join("")

// вставляем ранее созданный HTML код на страницу
document.querySelector('.schedule').innerHTML = lessons

// переменная для навешивания обработчика кнопки
const schedule = document.querySelector('.schedule')

// обрабатываем нажатие кнопки
schedule.addEventListener('click', ({ target }) => {

    // если нажата кнопка "Записаться"
    if (target.closest('.sign-up')) {
        scheduleData.forEach(lesson => {
            if (`${lesson.title}-sign-up` == target.id) {
                lesson.studentsNumbers = lesson.studentsNumbers + 1
                document.querySelector(`[id="${lesson.title}"]`).innerText = `Количество записанных студентов: ${lesson.studentsNumbers}`
                console.log(target);
                console.log(lesson.studentsNumbers);
            }
            if (lesson.studentsNumbers === lesson.maxStudentsNumbers) {
                document.querySelector(`[id="${lesson.title}-sign-up"]`).setAttribute('disabled', true)
            }
        });
    }

    //  если нажата кнопка "Удалить запись"
    if (target.closest('.sign-out')) {
        scheduleData.forEach(lesson => {
            if (`${lesson.title}-sign-out` == target.id) {
                lesson.studentsNumbers = lesson.studentsNumbers - 1
                if (lesson.studentsNumbers <= 0) {
                    lesson.studentsNumbers = 0
                }
                document.querySelector(`[id="${lesson.title}"]`).innerText = `Количество записанных студентов: ${lesson.studentsNumbers}`
                console.log(lesson.studentsNumbers);
                document.querySelector(`[id="${lesson.title}-sign-up"]`).removeAttribute('disabled')
            }
        });
    }
})

// метод для добавления расписания занятий на страницу
function createLesson(lesson) {
    return `
        <div class="lesson">
            <div class="title">Занятие: ${lesson.title}</div>
            <div class="start-time">Время начала: ${lesson.startTime}</div>
            <div class="students-number" id="${lesson.title}">Количество записанных студентов: ${lesson.studentsNumbers}</div>
            <div class="max-students-number">Максимальное количество студентов: ${lesson.maxStudentsNumbers}</div>
            <div class="">
                <button class="sign-up btn btn-outline-success" id="${lesson.title}-sign-up">Записаться на занятие</button>
                <button class="sign-out btn btn-outline-danger" id="${lesson.title}-sign-out">Отменить запись</button>
            </div>
        </div>`
}

