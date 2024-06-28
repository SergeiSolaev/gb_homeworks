<template>
 <div class="top">
    <HeaderComponent/>
        <div class="blog">
            <div class="blog__heading blogDetailsBanner">
<!-- Фоновое изображение вставлено в CSS -->
            </div>
        </div>
        <div class="blog-details center" id="app">
            <PostComponent/>
        </div>
    <FooterComponent/>
</div>
</template>

<script>
    import HeaderComponent from '../components/HeaderComponent.vue'
    import PostComponent from '../components/PostComponent.vue'
    import FooterComponent from '../components/FooterComponent.vue'
    
    export default {
        name: '',
        components: {
            HeaderComponent,
            PostComponent,
            FooterComponent,
        }
    }
    
</script>

<style lang="scss" scoped>

</style>