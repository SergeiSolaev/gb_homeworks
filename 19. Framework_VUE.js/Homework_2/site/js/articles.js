const app = {
    data() {
        return {
          
            articles: [
                {
                    id: 1,
                    title: 'Создадим лучший макет перепланировки',
                    label: 'Дизайн кухни',
                    img: 'img1.jpeg',
                    date:  '20 Декабрь,2022',
                },
                {
                    id: 2,
                    title: 'Лучшие интерьерные идеи по низкой цене',
                    label: 'Дизайн для жизни',
                    img: 'img2.jpeg',
                    date:  '21 Декабрь,2022'
                },
                {
                    id: 3,
                    title: 'Создадим лучший макет перепланировки',
                    label: 'Дизайн интерьера',
                    img: 'img3.jpeg',
                    date:  '22 Декабрь,2022'
                },
                {
                    id: 4,
                    title: 'Лучшие интерьерные идеи по низкой цене',
                    label: 'Дизайн кухни',
                    img: 'img4.jpeg',
                    date:  '23 Декабрь,2022'
                },
                {
                    id: 5,
                    title: 'Создадим лучший макет перепланировки',
                    label: 'Дизайн для жизни',
                    img: 'img5.jpeg',
                    date:  '24 Декабрь,2022'
                },
                {
                    id: 6,
                    title: 'Лучшие интерьерные идеи по низкой цене',
                    label: 'Дизайн интерьера',
                    img: 'img6.jpeg',
                    date:  '25 Декабрь,2022'
                }
            ]
        }
    },
    methods: {
        setClassArticleItem(id) {
            if (id == 2) {
                return 'articles__items__item backgroundCreme'
            } else {
                return 'articles__items__item'
            }
        },
        setClassArticleButton(id) {
            if (id == 2) {
                return 'articles__items__item__date__button backgroundWhite'
            } else {
                return 'articles__items__item__date__button backgroundCreme'
            }
        },
    }
}

Vue.createApp(app).mount("#app");
