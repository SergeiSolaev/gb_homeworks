<template>
    <div class="top">
        <HeaderComponent/>
        <div class="blog__heading projectDetailsBanner">
<!-- Фоновое изображение вставлено в CSS -->
        </div>
        <div class="project-details">
            <div class="project-details__content">
                <h1 class="projet-details__title title">{{ projects[0].title }}</h1>
                <p class="text"> {{ projects[0].description }}</p>
            </div>     
        </div>
        <SliderComponent/>
        <FooterComponent/>
    </div>
</template>

<script>
    import {mapState} from 'vuex'
    import HeaderComponent from '../components/HeaderComponent.vue'
    import FooterComponent from '../components/FooterComponent.vue'
    import SliderComponent from '../components/SliderComponent.vue'


    export default {
        components: {
            HeaderComponent,
            FooterComponent,
            SliderComponent,
        },
        computed: {
            ...mapState(['projects'])
        }
    }
</script>

<style lang="scss" scoped>

</style>