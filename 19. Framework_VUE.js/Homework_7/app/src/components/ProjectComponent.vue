<template>
    <div class="project center">
        <!-- Меню для сортировки проектов -->
        <div class="project__menu">
            <div v-for="(tag, index) in tags" :key="index" @click="sortByTag(tag)" class="project__menu__button" :class="{'project__menu__button__active': activeTag == index+1}">
                {{ tag }}
            </div>
        </div> 
        <!-- Карточки проектов -->
        <div class="project__items">
            <div class="project__item" v-for="project in projects" :key="project.id">
                <!-- При двойном клике карточка проекта добавляется в избранное, отрисовывается изображение звёздочки -->
                <img @dblclick="addFavorite(project.id)" :src=project.img class="project__img">
                <svg v-show="project.favorite" class="project__item__favorite" width="35.627197" height="34.361694" viewBox="0 0 35.6272 34.3617" fill="none" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                    <defs>
                        <filter id="filter_8_904_dd" x="0.000000" y="0.000000" width="35.627197" height="34.361694" filterUnits="userSpaceOnUse" color-interpolation-filters="sRGB">
                            <feFlood flood-opacity="0" result="BackgroundImageFix"/>
                            <feColorMatrix in="SourceAlpha" type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 127 0" result="hardAlpha"/>
                            <feOffset dx="0" dy="4"/>
                            <feGaussianBlur stdDeviation="1.33333"/>
                            <feComposite in2="hardAlpha" operator="out" k2="-1" k3="1"/>
                            <feColorMatrix type="matrix" values="0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.25 0"/>
                            <feBlend mode="normal" in2="BackgroundImageFix" result="effect_dropShadow_1"/>
                            <feBlend mode="normal" in="SourceGraphic" in2="effect_dropShadow_1" result="shape"/>
                        </filter>
                    </defs>
                    <g filter="url(#filter_8_904_dd)" style="mix-blend-mode:normal">
                        <path id="Star 3" d="M19.71 1.37L21.61 7.17C21.88 7.99 22.64 8.55 23.51 8.55L29.62 8.55C31.56 8.55 32.36 11.04 30.79 12.17L25.87 15.72C25.16 16.23 24.87 17.14 25.14 17.97L27.02 23.73C27.63 25.57 25.52 27.1 23.95 25.97L18.98 22.38C18.28 21.88 17.34 21.88 16.64 22.38L11.67 25.97C10.09 27.1 7.99 25.57 8.59 23.73L10.48 17.97C10.75 17.14 10.45 16.23 9.75 15.72L4.83 12.17C3.25 11.04 4.06 8.55 6 8.55L12.11 8.55C12.97 8.55 13.74 7.99 14.01 7.17L15.91 1.37C16.51 -0.46 19.11 -0.46 19.71 1.37Z" fill="#FFA928" fill-opacity="1.000000" fill-rule="nonzero"/>
                    </g>
                </svg>
                <div class="products__item__content">
                    <div class="product__item__content__info">
                        <h2 class="products__item__content__info__title">
                            {{ project.title }}
                        </h2>
                        <p class="products__item__content__info__text">
                            {{ project.breadcrumbs }}
                        </p>
                    </div>
                    <a class="products__item__content__button" href="#">
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
</template>

<script>
    export default {
        data() {
            return {
                // Исходный массив с проектами, получаемый от сервера
                projectsMain: [
                    {
                        id: 1,
                        tag: 'Ванная комната',
                        title: 'Минималистичная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_1/img_1.jpeg"),
                    },
                    {
                        id: 2,
                        tag: 'Ванная комната',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_2/img_1.jpeg"),

                    },
                    {
                        id: 3,
                        tag: 'Спальня',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_3/img_1.jpeg"),

                    },
                    {
                        id: 4,
                        tag: 'Спальня',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_4/img_1.jpeg"),

                    },
                    {
                        id: 5,
                        tag: 'Кухня',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_5/img_1.jpeg"),

                    },
                    {
                        id: 6,
                        tag: 'Кухня',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_6/img_1.jpeg"),

                    },
                    {
                        id: 7,
                        tag: 'Гостинная',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_7/img_1.jpeg"),

                    },
                    {
                        id: 8,
                        tag: 'Гостинная',
                        title: 'Современная спальня',
                        breadcrumbs: 'Декор / Планировка',
                        favorite: false,
                        img: require("@/assets/img/our_project/project_8/img_1.jpeg"),

                    },
                ],
                projects: [],
                tags: [],
                activeTag: 0,
                activeButton: false,
            }
        },
        // Создаём независимый от первоначального массива с данными по проектам для работы сортировки
        mounted() {
            this.projects = this.projectsMain;
            this.createTags();
        },
        methods: {
            // Создаём массив с тегами для отображения кнопок сортировки
            createTags() {
                this.tags = [];
                this.projectsMain.forEach(project => {
                    if (!this.tags.includes(project.tag)) {
                        this.tags.push(project.tag);
                    }
                });
            },
            // Сортируем проекты по тегам
            sortByTag(tag) {
                if(this.activeButton) {
                    this.activeButton = !this.activeButton;
                    this.activeTag = 0;
                    this.projects = this.projectsMain; 
                    return;
                }            
                this.projects = this.projectsMain; 
                this.projects = this.projects.filter(project => project.tag == tag)
                this.activeTag = this.tags.indexOf(tag) + 1;
                this.activeButton = !this.activeButton;
            },
            // Добавляем/удаляем из избранного проект
            addFavorite(id) {
                this.projects.forEach(project => {
                    if(project.id == id) {
                        project.favorite =!project.favorite;
                    }
                });                
            }
        }
    }
</script>

<style lang="scss" scoped>

</style>