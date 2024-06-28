<template>
    <div>
        <HeaderComponent/>
        <div class="blog">
            <div class="blog__heading ourProjectBanner">
<!-- Фоновое изображение вставлено в CSS -->
            </div>
            <div class="blog__title center">
                <div class="blog__title__text-wrapper">
                    <h1 class="blog__title__text">
                        Наш проект
                    </h1>
                </div>
                <div class="breadcrumbs">
                    <a class="breadcrumbs__item" href="index.html">Домой /</a>
                    <a class="breadcrumbs__item" href="/blog.html">Проект</a>
                </div>
            </div>
        </div>
        <ProjectComponent/>
        <PaginationComponent/>
        <FooterComponent/>
    </div>
</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue'
import FooterComponent from '../components/FooterComponent.vue'
import PaginationComponent from '../components/PaginationComponent.vue'
import ProjectComponent from '../components/ProjectComponent.vue'



export default {
    components: {
        HeaderComponent,
        FooterComponent,
        PaginationComponent,
        ProjectComponent,
    }
}
</script>

<style lang="scss" scoped>

</style>