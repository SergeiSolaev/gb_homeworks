<template>
  <MainPage/>
  <BlogPage/>
  <BlogDetailsPage/>
  <OurProjectPage/>
</template>

<script>
import MainPage from './pages/MainPage.vue'
import BlogPage from './pages/BlogPage.vue'
import BlogDetailsPage from './pages/BlogDetailsPage.vue'
import OurProjectPage from './pages/OurProjectPage.vue'

export default {
  name: '',
  components: {
    MainPage,
    BlogPage,
    BlogDetailsPage,
    OurProjectPage,
  }
}
</script>

<style lang="scss">

</style>
