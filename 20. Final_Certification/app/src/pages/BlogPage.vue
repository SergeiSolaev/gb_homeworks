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
                    class="last-post__article__img" :src="lastPost.img_prewiev" alt=""></div>
                <div class="last-post__article__content">
                    <h2 class="last-post__article__content__title">
                        {{ lastPost.title }}
                    </h2>
                    <p class="last-post__article__content__text">
                        {{ lastPost.text_start }}
                    </p>
                    <div class="posts__items__item__date">
                        {{ lastPost.date }}
                        <router-link class="posts__items__item__date__button backgroundBright" :to="`/blog-detail/${lastPost.id}`">
                            <svg width="10.004044" height="20.008179" viewBox="0 0 10.004 20.0082" fill="none"
                                xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                                <desc>
                                    Created with Pixso.
                                </desc>
                                <defs />
                                <path id="Vector" d="M1 19L9 10L1 1" stroke="#292F36" stroke-opacity="1.000000"
                                    stroke-width="2.000000" stroke-linejoin="round" stroke-linecap="round" />
                            </svg>
                        </router-link>
                    </div>
                </div>
            </div>
        </div>
        <div class="posts center">
            <div class="posts__info-blog">
                <h1 class="posts__info__title">
                    Cтатьи & Новости
                </h1>
            </div>
            <div class="posts__items">
                <div v-for="post in lastSixPosts" :key="post.id" :id="post.id" :class="setClassArticleItem(post.id)">
                    <div class="posts__items__item__img-wrapper">
                        <img :src="post.img_prewiev" class="posts__items__item__img"  alt="">
                        <div class="posts__items__item__img__label">
                            {{ post.short_desc }}
                        </div>
                    </div>
                    <div class="posts__items__item__title">{{ post.title }}</div>
                    <div class="posts__items__item__date">
                        {{ post.date }}
                        <router-link :class="setClassArticleButton(post.id)" :to="`/blog-detail/${post.id}`">
                            <svg width="10.004044" height="20.008179" viewBox="0 0 10.004 20.0082" fill="none"
                                xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                                <desc>
                                    Created with Pixso.
                                </desc>
                                <defs />
                                <path id="Vector" d="M1 19L9 10L1 1" stroke="#292F36" stroke-opacity="1.000000"
                                    stroke-width="2.000000" stroke-linejoin="round" stroke-linecap="round" />
                            </svg>
                        </router-link>
                    </div>
                </div>
            </div>
            <div class="posts__pagination">
                <a class="posts__items__item__date__button backgroundBright" href="#">
                    <p class="posts__pagination__button__text">01</p>
                </a>
                <a class="posts__items__item__date__button borderButton" href="#">
                    <p class="posts__pagination__button__text">02</p>
                </a>
                <a class="posts__items__item__date__button borderButton" href="#">
                    <p class="posts__pagination__button__text">03</p>
                </a>
                <a class="posts__items__item__date__button borderButton" href="#">
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
    import { mapState } from 'vuex';
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
                // Последний пост из массива postsStore
                lastPost: {},
                // Последние 6 постов из массива postsStore, за вычетом lastPost
                lastSixPosts: [],
            }
        },
        computed: {
            // Получаем данные из store
            ...mapState(['postsStore'])
        },
        mounted() {
            // Получаем последний пост из массива postsStore
            this.lastPost = this.postsStore[this.postsStore.length - 1];
            // Получаем последние 6 постов из массива postsStore, за вычетом lastPost
            this.loadLastSixPosts();
        },
        methods: {
            // Метод загружает последние 6 постов из массива postsStore за вычетом lastPost
            loadLastSixPosts() {
                // Получаем массив postsStore в обратном порядке, чтобы получить последние посты первыми
                const posts = this.postsStore;
                const lastSixPosts = posts.slice(Math.max(posts.length - 7, 0));
                this.lastSixPosts = lastSixPosts.reverse()
                // Удаляем последний пост 
                this.lastSixPosts.shift();
            },
            // Метод определяет фон блока статьи
            setClassArticleItem(id) {
                if (id % 2 == 0) {
                    return 'posts__items__item backgroundBright'
                } else {
                    return 'posts__items__item'
                }
            },
            // Метод определяет цвет кнопки статьи
            setClassArticleButton(id) {
                if (id % 2 == 0) {
                    return 'posts__items__item__date__button backgroundWhite'
                } else {
                    return 'posts__items__item__date__button backgroundBright'
                }
            },
        }
    }
</script>

<style lang="scss" scoped>

</style>