<template>
        <header class="header center">
            <div class="header__logo">
                <svg width="33.997559" height="34.000244" viewBox="0 0 33.9976 34.0002" fill="none"
                    xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                    <desc>
                        Created with Pixso.
                    </desc>
                    <defs />
                    <path id="Logo"
                        d="M0 34L13.45 34L13.45 24.49C13.45 22.48 15.08 20.85 17.1 20.85C19.11 20.85 20.74 22.48 20.74 24.49L20.74 34L33.99 34L33.99 0C15.22 0 0 15.22 0 34Z"
                        fill="#CDA274" fill-opacity="1.000000" fill-rule="nonzero" />
                </svg>
                <p class="header__logo__text">Interno</p>
            </div>
            <div class="header__menu">
                <router-link class="header__menu__item" :to="'/'">Домой</router-link> 
                <router-link class="header__menu__item" :to="'/our-project'">Проект</router-link> 
                <router-link class="header__menu__item" :to="'/blog'">Блог</router-link> 
            </div>
        </header>
</template>

<script>
    export default {
        
    }
</script>

<style lang="scss" scoped>

</style>