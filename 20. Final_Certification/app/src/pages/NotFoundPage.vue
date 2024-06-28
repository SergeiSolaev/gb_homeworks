<template>
    <div>
        <HeaderComponent/>
        <div class="not-found center">
            <div class="not-found__content">
                <h1 class="not-found__title">404</h1>
                <p class="not-found__text">Приносим извинения, но страница, которую вы искали, не найдена</p>
                <router-link class="button" to="/">
                    <p>Домой</p>
                    <svg width="17.151123" height="16.005859" viewBox="0 0 17.1511 16.0059" fill="none" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><desc> Created with Pixso. </desc><defs></defs><path id="Vector" d="M1 7.93L14.73 7.8M9.62 1.41L16.15 7.93L9.49 14.59" stroke="#CDA274" stroke-opacity="1.000000" stroke-width="2.000000" stroke-linejoin="round"></path></svg></router-link>
            </div>
            <div class="not-found__img-wrapper">
                <img class="not-found__img" src="../assets/img/404.jpeg" alt="404">
            </div>
        </div>
    </div>
</template>

<script>
    import HeaderComponent from '../components/HeaderComponent.vue';

    export default {
        components: {
            HeaderComponent
        }
    }
</script>

<style lang="scss" scoped>

</style>