<template>
  <MainPage/>
  <BlogPage/>
  <BlogDetailsPage/>
  <OurProjectPage/>
  <ProjectDetailsPage/>
</template>

<script>
import MainPage from './pages/MainPage.vue'
import BlogPage from './pages/BlogPage.vue'
import BlogDetailsPage from './pages/BlogDetailsPage.vue'
import OurProjectPage from './pages/OurProjectPage.vue'
import ProjectDetailsPage from './pages/ProjectDetailsPage.vue'


export default {
  name: '',
  components: {
    MainPage,
    BlogPage,
    BlogDetailsPage,
    OurProjectPage,
    ProjectDetailsPage,
  }
}
</script>

<style lang="scss">

</style>
