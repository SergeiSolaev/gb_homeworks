let data = localStorage.getItem('rewievList')

let rewievList = []

// если в local stoarage что-то есть, то загружаем эти данные в массив rewievList
if (data != '' && data != null) {
    rewievList = JSON.parse(data)
}
// выводим существующие отзывы из localStorage
for (const rewiev of rewievList) {
    updateRewiev(rewiev)
}

// ищем все названия продуктов на странице для которых ужке есть отзывы
const namesRewiev = document.getElementsByClassName('name')

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

    // добавляем новый отзыв в массив с отзывами
    let rewiewProductExist = false
    rewievList.forEach(element => {
        if (element.name == productName) {
            element.rewievs.push(rewievObj.rewievs[0])
            rewiewProductExist = true
            return
        }
    });
    if (!rewiewProductExist) {
        rewievList.push(rewievObj)
    }

    // добавляем(обновляем) массив с отзывами в localStorage
    localStorage.setItem('rewievList', JSON.stringify(rewievList))

    // выводим отзыв на HTML страницу
    createNewRewiev(rewievObj, namesRewiev)

    //Очищаем текстовые поля после ввода данных
    document.getElementById('product-name').value = ''
    document.getElementById('rewiev-text').value = ''

})

// метод для удаления отзыва
document.getElementById('rewiev-list').addEventListener('click', function (event) {
    // получаем id кнопки которую нажали 
    let rewievIdDelete = event.target.id

    // удаляем отзыв из массива по id (id кнопки == id отзыва)
    rewievList = rewievList.map(function (item) {
        const rewievObj = {
            name: item.name,
            rewievs: item.rewievs.filter((rewiev) => rewiev.id != rewievIdDelete)
        }
        return rewievObj
    })
    // записываем отфильтрованный массив в localStorage
    localStorage.setItem('rewievList', JSON.stringify(rewievList))

})

function updateRewiev(rewievObj) {

    const itemRewiev = document.createElement('li')
    itemRewiev.classList.add('list-group-item')
    itemRewiev.classList.add('mb-3')

    const itemRewievDetails = document.createElement('details')
    itemRewievDetails.classList.add(rewievObj.name)

    const itemRewievSummary = document.createElement('summary')

    const itemProductName = document.createElement('h3')
    itemProductName.textContent = rewievObj.name
    itemProductName.classList.add('name')
    itemProductName.classList.add(rewievObj.name)

    itemRewievSummary.append(itemProductName)
    itemRewievDetails.append(itemRewievSummary)

    rewievObj.rewievs.forEach(element => {
        const itemRewievText = document.createElement('p')
        itemRewievText.classList.add('lead')
        itemRewievText.id = element.id
        itemRewievText.textContent = element.text

        const itemRewievBtnBr = document.createElement('br')

        const itemDeleteRewievButton = document.createElement('button')
        itemDeleteRewievButton.textContent = 'Удалить отзыв'
        itemDeleteRewievButton.id = element.id
        itemDeleteRewievButton.classList.add('btn')
        itemDeleteRewievButton.classList.add('btn-primary')

        itemRewievText.append(itemRewievBtnBr)
        itemRewievText.append(itemDeleteRewievButton)
        itemRewievDetails.append(itemRewievText)
    });

    itemRewiev.append(itemRewievDetails)

    document.getElementById('rewiev-list').append(itemRewiev)
}

// метод для добавления отзыва на HTML
function createNewRewiev(rewievObj, namesRewiev) {

    let productNameExist = false

    for (let i = 0; i < namesRewiev.length; i++) {
        if (rewievObj.name == namesRewiev[i].innerText) {
            const itemRewievExist = document.querySelector(`[class="${rewievObj.name}"]`)

            const itemRewievText = document.createElement('p')
            itemRewievText.classList.add('lead')
            itemRewievText.id = rewievObj.rewievs[0].id
            itemRewievText.textContent = rewievObj.rewievs[0].text

            const itemRewievBtnBr = document.createElement('br')

            const itemDeleteRewievButton = document.createElement('button')
            itemDeleteRewievButton.textContent = 'Удалить отзыв'
            itemDeleteRewievButton.id = rewievObj.rewievs[0].id
            itemDeleteRewievButton.classList.add('btn')
            itemDeleteRewievButton.classList.add('btn-primary')

            itemRewievText.append(itemRewievBtnBr)
            itemRewievText.append(itemDeleteRewievButton)
            itemRewievExist.append(itemRewievText)
            productNameExist = true
        }
    }

    if (!productNameExist) {

        const itemRewiev = document.createElement('li')
        itemRewiev.classList.add('list-group-item')
        itemRewiev.classList.add('mb-3')


        const itemRewievDetails = document.createElement('details')
        itemRewievDetails.classList.add(rewievObj.name)

        const itemRewievSummary = document.createElement('summary')

        const itemProductName = document.createElement('h3')
        itemProductName.textContent = rewievObj.name
        itemProductName.classList.add('name')
        itemProductName.classList.add(rewievObj.name)

        itemRewievSummary.append(itemProductName)
        itemRewievDetails.append(itemRewievSummary)

        rewievObj.rewievs.forEach(element => {
            const itemRewievText = document.createElement('p')
            itemRewievText.classList.add('lead')
            itemRewievText.id = element.id
            itemRewievText.textContent = element.text

            const itemRewievBtnBr = document.createElement('br')

            const itemDeleteRewievButton = document.createElement('button')
            itemDeleteRewievButton.textContent = 'Удалить отзыв'
            itemDeleteRewievButton.id = element.id
            itemDeleteRewievButton.classList.add('btn')
            itemDeleteRewievButton.classList.add('btn-primary')

            itemRewievText.append(itemRewievBtnBr)
            itemRewievText.append(itemDeleteRewievButton)
            itemRewievDetails.append(itemRewievText)
        });

        itemRewiev.append(itemRewievDetails)

        document.getElementById('rewiev-list').append(itemRewiev)
    }
}


