// ""Получение данных о пользователе""

// Реализуйте функцию getUserData, которая принимает идентификатор пользователя (ID) в качестве аргумента и использует fetch для получения данных о пользователе с заданным ID с удаленного сервера. Функция должна возвращать промис, который разрешается с данными о пользователе в виде объекта. Если пользователь с указанным ID не найден, промис должен быть отклонен с соответствующим сообщением об ошибке.

// Подсказка, с последовательностью действий:
// getUserData использует fetch для получения данных о пользователе с удаленного сервера. Если запрос успешен (с кодом 200), функция извлекает данные из ответа с помощью response.json() и возвращает объект с данными о пользователе. Если запрос неуспешен, функция отклоняет промис с сообщением об ошибке.

async function getUserData(ID) {
    const response = await fetch("https://jsonplaceholder.typicode.com/users")
    if (response.status == 200) {
        response.json()
            .then(data => {
                if (data[ID]) {
                    console.log(data[ID - 1]);
                }
                else {
                    console.log('ID ERROR');
                }
            })
    }
    else {
        console.log('STATUS ERROR');
    }
}

getUserData(1);

// async function getUserData(ID) {
//     let response = await fetch("https://jsonplaceholder.typicode.com/users");
//     if (response.status == 200) {
//        let json = await response.json();
//        return json[ID - 1];
//     } else {
//        console.log("Данные с сервера не получены");
//     }
//  }
//  getUserData(1).then(result => {
//     if (result === undefined) {
//        console.log("Пользователь не найден");
//     } else {
//        console.log(result);
//     }
//  });

// function getUserData(ID) {
//     fetch('https://jsonplaceholder.typicode.com/users')
//         .then(res => {
//             if (res.status == 200) {
//                 return res.json()
//             } else {
//                 console.log('STATUS ERROR');
//             }
//         })
//         .then(data => {
//             if (data[ID]) {
//                 console.log(data[ID-1]);
//             }
//             else {
//                 console.log('ID ERROR');
//             }
//         })
// }

