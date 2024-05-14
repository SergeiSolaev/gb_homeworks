let data = localStorage.getItem('rewievList')

let rewievList = []

// если в local stoarage что-то есть, то загружаем эти данные в массив rewievList
if (data != '' && data != null) {
    rewievList = JSON.parse(data)
}

updateRewiev()

// метод для вывода отзывов на страницу
function updateRewiev() {
    const rewievHtml = rewievList.map(function (item) {

        // если на один продукт больше одного отзыва, то отзывы на этот продукт выводим под одним заголовком
        if (item.rewievs.length > 1) {
            return `<li class="list-group-item" id=""><details><summary><h3>${item.name}</h3></summary><p class="lead">${item.rewievs.map((elem) => `<p class="lead" id="${elem.id}">${elem.text}</p><button class="btn btn-delete btn-primary mb-3" id="${elem.id}">Удалить отзыв</button>`).join('')}</p></details></li>`
        } else {
            // если на один продукт один отзыв
            return `<li class="list-group-item" id=""><details><summary><h3>${item.name}</h3></summary><p class="lead" id="${item.rewievs[0].id}">${item.rewievs[0].text}</p><button class="btn btn-delete btn-primary mb-3" id="${item.rewievs[0].id}">Удалить отзыв</button></details></li>`;
        }
    }).join('')

    document.querySelector('[class="list-group mb-3"').innerHTML = rewievHtml;
}

// метод для добавления отзыва
document.getElementById('add-rewiev-form').addEventListener('submit', function (event) {
    event.preventDefault()

    // получаем данные из формы
    let productName = document.getElementById('product-name').value
    let rewievText = document.getElementById('rewiev-text').value

    // генерируем уникальный id отзыва
    let rewievId = function () {
        if (rewievList.length === 0) {
            return 1
        }
        if (rewievList.length > 0) {
            let idMax = rewievList[0].rewievs[0].id
            for (let i = 0; i < rewievList.length; i++) {
                for (let j = 0; j < rewievList[i].rewievs.length; j++) {
                    if (rewievList[i].rewievs[j].id > idMax) {
                        idMax = rewievList[i].rewievs[j].id
                    }
                }
            }
            return idMax + 1
        }
    }

    // создаём объект для хранения отзыва
    const rewievObj = {
        name: productName,
        rewievs: [
            {
                text: rewievText,
                id: rewievId()
            }
        ]
    }

    // далее проверка на то, существует ли отзыв на данный продукт
    let rewiewsAdded = false;
    rewievList.forEach(element => {
        if (element.name === productName) {
            element.rewievs.push(rewievObj.rewievs[0]); // добавляем отзыв
            rewiewsAdded = true;
        }
    });

    // или не существует отзыв на данный продукт
    if (!rewiewsAdded) {
        rewievList.push(rewievObj); // добавляем отзыв
    }

    // добавляем(обновляем) массив с отзывами в localStorage
    localStorage.setItem('rewievList', JSON.stringify(rewievList))

    updateRewiev()


    //Очищаем текстовые поля после ввода данных
    document.getElementById('product-name').value = ''
    document.getElementById('rewiev-text').value = ''

    location.reload()

})

const deleteRewiev = document.querySelectorAll('.btn-delete')

deleteRewiev.forEach(element => {

    element.addEventListener('click', function (event) {
        // получаем id кнопки которую нажали 
        let rewievIdDelete = event.target.id

        for (let i = 0; i < rewievList.length; i++) {
            for (let j = 0; j < rewievList[i].rewievs.length; j++) {
                if (rewievIdDelete == rewievList[i].rewievs[j].id) {
                    rewievList[i].rewievs.splice(j,1)
                }
                if (rewievList[i].rewievs.length == 0) {
                    rewievList.splice(i)
                }
            }
        }
        localStorage.setItem('rewievList', JSON.stringify(rewievList))
        location.reload()
    })
})


