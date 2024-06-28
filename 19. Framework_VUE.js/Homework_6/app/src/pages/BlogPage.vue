<template>
    <div class="top">
        <HeaderComponent/>
        <div class="blog">
            <div class="blog__heading blogBanner">
<!-- Фоновое изображение вставлено в CSS -->
            </div>
            <div class="blog__title center">
                <div class="blog__title__text-wrapper">
                    <h1 class="blog__title__text">
                        Cтатьи & <br> Новости
                    </h1>
                </div>
                <div class="breadcrumbs">
                    <a class="breadcrumbs__item" href="index.html">Домой /</a><br>
                    <a class="breadcrumbs__item" href="/blog.html">Блог</a>
                </div>
            </div>
        </div>
        <div class="last-post center">
            <div class="last-post__heading">
                <h1 class="last-post__heading__title">
                    Последний пост
                </h1>
            </div>
            <div class="last-post__article">
                <div class="last-post__article__img-wrapper"><img 
                    class="last-post__article__img" src="@/assets/img/articles/img_7.jpeg" alt=""></div>
                <div class="last-post__article__content">
                    <h2 class="last-post__article__content__title">
                        Low Cost Latest Invented Interior Designing Ideas
                    </h2>
                    <p class="last-post__article__content__text">
                        С того времени этот, похожий на латинский, текст стал стандартом в печатной промышленности для примеров шрифтов и текстов. Перед появлением электронных издательств дизайнеры импровизировали в работе над макетами, изображая текст при помощи волнистых линий. С появлением самоклеющихся наклеек с напечатанным текстом «Lorem ipsum» появился более реалистичный способ обозначения расположения текста на странице.
                    </p>
                    <div class="articles__items__item__date">
                        26 Декабрь,2022
                        <a class="articles__items__item__date__button" href="#">
                            <svg width="10.004044" height="20.008179" viewBox="0 0 10.004 20.0082" fill="none"
                                xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                                <desc>
                                    Created with Pixso.
                                </desc>
                                <defs />
                                <path id="Vector" d="M1 19L9 10L1 1" stroke="#292F36" stroke-opacity="1.000000"
                                    stroke-width="2.000000" stroke-linejoin="round" stroke-linecap="round" />
                            </svg>

                        </a>
                    </div>
                </div>
            </div>
        </div>
        <div class="articles center">
            <div class="articles__info-blog">
                <h1 class="articles__info__title">
                    Cтатьи & Новости
                </h1>
            </div>
            <div id="app" class="articles__items">
                <div v-for="article in articles" :key="article.id" :id="article.id" :class="setClassArticleItem(article.id)">
                    <div class="articles__items__item__img-wrapper">
                        <img :src="article.img" class="articles__items__item__img"  alt="">
                        <div class="articles__items__item__img__label">
                            {{ article.label }}
                        </div>
                    </div>
                    <div class="articles__items__item__title">{{ article.title }}</div>
                    <div class="articles__items__item__date">
                        {{ article.date }}
                        <a :class="setClassArticleButton(article.id)" href="#">
                            <svg width="10.004044" height="20.008179" viewBox="0 0 10.004 20.0082" fill="none"
                                xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                                <desc>
                                    Created with Pixso.
                                </desc>
                                <defs />
                                <path id="Vector" d="M1 19L9 10L1 1" stroke="#292F36" stroke-opacity="1.000000"
                                    stroke-width="2.000000" stroke-linejoin="round" stroke-linecap="round" />
                            </svg>
                        </a>
                    </div>
                </div>
            </div>
            <div class="articles__pagination">
                <a class="articles__items__item__date__button backgroundCreme" href="#">
                    <p class="articles__pagination__button__text">01</p>
                </a>
                <a class="articles__items__item__date__button borderButton" href="#">
                    <p class="articles__pagination__button__text">02</p>
                </a>
                <a class="articles__items__item__date__button borderButton" href="#">
                    <p class="articles__pagination__button__text">03</p>
                </a>
                <a class="articles__items__item__date__button borderButton" href="#">
                    <svg width="10.004044" height="20.008179" viewBox="0 0 10.004 20.0082" fill="none"
                        xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                        <desc>
                            Created with Pixso.
                        </desc>
                        <defs />
                        <path id="Vector" d="M1 19L9 10L1 1" stroke="#292F36" stroke-opacity="1.000000"
                            stroke-width="2.000000" stroke-linejoin="round" stroke-linecap="round" />
                    </svg>
                </a>
            </div>
        </div>
        <FooterComponent/>
    </div>
</template>

<script>
    import HeaderComponent from '../components/HeaderComponent.vue'
    import FooterComponent from '../components/FooterComponent.vue'

    export default {
        name: '',

        components: {
            HeaderComponent,
            FooterComponent,
        },

        data() {
            return {
            
                articles: [
                    {
                        id: 1,
                        title: 'Создадим лучший макет перепланировки',
                        label: 'Дизайн кухни',
                        img: require("@/assets/img/articles/img_1.jpeg"),
                        date:  '20 Декабрь,2022',
                    },
                    {
                        id: 2,
                        title: 'Лучшие интерьерные идеи по низкой цене',
                        label: 'Дизайн для жизни',
                        img: require("@/assets/img/articles/img_2.jpeg"),
                        date:  '21 Декабрь,2022'
                    },
                    {
                        id: 3,
                        title: 'Создадим лучший макет перепланировки',
                        label: 'Дизайн интерьера',
                        img: require("@/assets/img/articles/img_3.jpeg"),
                        date:  '22 Декабрь,2022'
                    },
                    {
                        id: 4,
                        title: 'Лучшие интерьерные идеи по низкой цене',
                        label: 'Дизайн кухни',
                        img: require("@/assets/img/articles/img_4.jpeg"),
                        date:  '23 Декабрь,2022'
                    },
                    {
                        id: 5,
                        title: 'Создадим лучший макет перепланировки',
                        label: 'Дизайн для жизни',
                        img: require("@/assets/img/articles/img_5.jpeg"),
                        date:  '24 Декабрь,2022'
                    },
                    {
                        id: 6,
                        title: 'Лучшие интерьерные идеи по низкой цене',
                        label: 'Дизайн интерьера',
                        img: require("@/assets/img/articles/img_6.jpeg"),
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
</script>

<style lang="scss" scoped>

</style>