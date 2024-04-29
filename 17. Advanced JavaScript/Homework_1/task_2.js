
let cookSpecializtion = new Map([
    ['Виктор', 'Пицца'],
    ['Ольга', 'Суши'],
    ['Дмитрий', 'Десерты'],
])

let dishes = new Map([
    ['Пицца "Пепперони"', 'Виктор'],
    ['Пицца "Маргарита"', 'Виктор'],
    ['Суши "Филадельфия"', 'Виктор'],
    ['Суши "Калифорния"', 'Виктор'],
    ['Тирамису', 'Виктор'],
    ['Чизкейк', 'Виктор'],
])

const clients = [];
function Client(name) {
    this.name = name;
}

let orders = new Map([]);

const clientForm = document.getElementById('clientForm');
const showOrders = document.getElementById('showOrders');


function retrieveFormValue(event) {
    event.preventDefault();
    const name = clientForm.querySelector('[name="name"]');
    const dishesFirst = clientForm.querySelector('[id="dishesSelectFirst"]');
    const dishesSecond = clientForm.querySelector('[id="dishesSelectSecond"]');
    const nameValue = name.value;
    const order = [dishesFirst.value, dishesSecond.value];
    clients.push(new Client(nameValue));
    orders.set(clients[clients.length - 1], order);
}

function retrievOrders(event) {
    event.preventDefault();
    let array = [];
    for (let name of orders.keys()) {
        array.push([[name.name],[orders.get(name)]]);
    }

    const ordersHtml = array.map((item) => `<li>Клиент ${item[0]} заказал: ${item[1]}</li>`).join('');
    document.querySelector('ul').innerHTML = ordersHtml;

    console.clear();
    for (let name of orders.keys()) {
        console.log(`Клиент ${name.name} заказал: ${orders.get(name)}`);
    }
}

clientForm.addEventListener('submit', retrieveFormValue);
showOrders.addEventListener('click', retrievOrders);



